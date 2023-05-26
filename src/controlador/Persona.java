package controlador;

public abstract class Persona {

    private double dni;
    private String nombreYapellido;


    public Persona(double dni, String nombreYapellido) {
        this.dni = dni;
        this.nombreYapellido = nombreYapellido;
    }


    public double getDni() {
        return dni;
    }

    public void setDni(double dni) {
        this.dni = dni;
    }


    public String getNombreYapellido() {
        return nombreYapellido;
    }


    public void setNombreYapellido(String nombreYapellido) {
        this.nombreYapellido = nombreYapellido;
    }


}
