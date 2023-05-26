package controlador;

public class Medico extends Persona {

    private double tarifa;
    private String especialidad;

    public Medico(double dni, String nombreYapellido, double tarifa, String especialidad) {
        super(dni, nombreYapellido);
        this.tarifa = tarifa;
        this.especialidad = especialidad;
    }


    public double getTarifa() {
        return tarifa;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
}
