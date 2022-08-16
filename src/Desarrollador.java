public class Desarrollador extends Integrante {

    // Constructor
    public Desarrollador(String nombreCompleto, String grupo) {

        super(nombreCompleto, "Desarrollador", grupo);
    }

    @Override
    public void presentacion() {
        System.out.println("Hola! Mi nombre es " + getNombreCompleto() + ", soy " + getRol() + " de "+ getNombreEquipo() +" y estoy en el grupo " + getGrupo() + ".");
    }
}
