package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author chemo
 */
public class Conexion
{
    private static final String url = "jdbc:mysql://localhost:3306/Prueba";
    private static final String usuario = "root";
    private static final String contraseña = "Emmanuel360#";

    public static Connection conectar()
    {
        Connection connection = null;
        try
        {
            connection = DriverManager.getConnection(url, usuario, contraseña);
            System.out.println("Conexion exitosa a la base de datos.");
        } catch (SQLException e)
        {
            System.out.println("Error al conectar a la base de datos.");
            e.printStackTrace();
        }
        return connection;
    }
    
    public static void main(String[] args)
    {
        conectar();
    }
}
