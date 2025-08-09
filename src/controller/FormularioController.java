package controller;

import dao.UsuarioDAO;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import model.Usuario;

public class FormularioController
{

    @FXML
    private TextField txtNombre;

    @FXML
    private TextField txtApellido;

    @FXML
    private Button btnAceptar;

    @FXML
    private void onAceptar()
    {
        String nombre = txtNombre.getText();
        String apellido = txtApellido.getText();
        
        Usuario nuevoUsuario = new Usuario(nombre, apellido);
        
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        
        usuarioDAO.insertarUsuario(nuevoUsuario);
        
        System.out.println("Nombre: " + nombre + ", Apellido: " + apellido);
    }
}
