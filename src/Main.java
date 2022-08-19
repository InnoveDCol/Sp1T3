public class Main {
    public static void main (String[] args) {
        Integrante integrante4 = new Desarrollador("Yury Catalina Taborda Passos" , "21-22");
        Integrante integrante3 = new Desarrollador("Mayra Alejandra Moreano Vásquez" , "7-8");
        integrante4.presentacion();
        integrante3.presentacion();
        // Crear un objeto de la clase Integrante y definimos sus atributos segun el rol dentro del equipo
        Integrante integrante5 = new ScrumMaster("Jeyson David Zuñiga Gomez","21-22");
        // Llamamos al método presentacion para mostrar la presentación del integrante
        integrante5.presentacion();
        // Llamamos al método mensajeEquipo para mostrar el mensaje del equipo
        integrante5.mensajeEquipo();

    }
}