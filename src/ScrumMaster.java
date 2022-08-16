public class ScrumMaster extends Integrante {

    // Constructor
    public ScrumMaster(String nombreCompleto, String grupo) {

        super(nombreCompleto, "Scrum Master", grupo);
    }

    @Override
    public void presentacion() {
        System.out.println("Hola! Mi nombre es " + getNombreCompleto() + ", ademas de ser Desarrollador soy el " + getRol() +" de "+ getNombreEquipo() +" y estoy en el grupo " + getGrupo() + ".");
    }
}
