public class Main {
    public static void main(String[] args) {

        // Crear un objeto de la clase Integrante y definimos sus atributos segun el rol dentro del equipo
        Integrante integrante5 = new ScrumMaster("Jeyson David Zuñiga Gomez","21-22");
        // Llamamos al método presentacion para mostrar la presentación del integrante
        integrante5.presentacion();
        // Llamamos al método mensajeEquipo para mostrar el mensaje del equipo
        integrante5.mensajeEquipo();

    }
}