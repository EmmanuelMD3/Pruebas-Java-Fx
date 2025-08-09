/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.Usuario;

/**
 *
 * @author chemo
 */
public class UsuarioDAO
{
    public boolean insertarUsuario(Usuario usuario)
    {
        String sql = "INSERT INTO Usuarios (Nombre, Apellido) VALUES (?, ?)";

        try (Connection conn = Conexion.conectar(); PreparedStatement pstmt = conn.prepareStatement(sql))
        {

            pstmt.setString(1, usuario.getNombre());
            pstmt.setString(2, usuario.getApellido());

            return pstmt.executeUpdate() > 0;

        } catch (SQLException e)
        {
            System.err.println("Error al insertar Usuarip: " + e.getMessage());
            return false;
        }
    }
}
