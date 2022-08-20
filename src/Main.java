public class Main {
    public static void main (String[] args) {

        Integrante integrante1 = new Desarrollador( "Alexander Carvajal Oquendo", "21-22");
        Integrante integrante2 = new Desarrollador("Carlos Mario Mora Delgado","21-22");
        Integrante integrante3 = new Desarrollador("Mayra Alejandra Moreano Vásquez" , "7-8");
        Integrante integrante4 = new Desarrollador("Yury Catalina Taborda Passos" , "21-22");
        Integrante integrante5 = new ScrumMaster("Jeyson David Zuñiga Gomez","21-22");

        integrante1.presentacion();
        integrante2.presentacion();
        integrante3.presentacion();
        integrante4.presentacion();
        integrante5.presentacion();

        Integrante.mensajeEquipo();
    }
}
