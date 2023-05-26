package controlador;

public class Paciente extends Persona {

    private ObraS obrasocial;


    public Paciente(double dni, String nombreYapellido, ObraS obrasocial) {
        super(dni, nombreYapellido);
        this.obrasocial = obrasocial;
    }
}
