package model;

public class Usuario
{

    private String Nombre;
    private String Apellido;

    public Usuario()
    {
    }

    public Usuario(String Nombre, String Apellido)
    {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
    }

    /**
     * @return the Nombre
     */
    public String getNombre()
    {
        return Nombre;
    }

    /**
     * @param Nombre the Nombre to set
     */
    public void setNombre(String Nombre)
    {
        this.Nombre = Nombre;
    }

    /**
     * @return the Apellido
     */
    public String getApellido()
    {
        return Apellido;
    }

    /**
     * @param Apellido the Apellido to set
     */
    public void setApellido(String Apellido)
    {
        this.Apellido = Apellido;
    }
}
