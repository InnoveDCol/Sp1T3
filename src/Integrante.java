public class Integrante {

    // Atributos
    private String nombreCompleto, rol;
    private String grupo; // Se especifica el grupo en formato X-Y, por ejemplo: 21-22, 7-8, etc.

    private static final String NOMBRE_EQUIPO = "Innoved Col";

    // Constructor
    public Integrante(String nombreCompleto, String rol, String grupo) {
        this.nombreCompleto = nombreCompleto;
        this.rol = rol;
        this.grupo = grupo;
    }

    // Getters & Setters
    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public String getNombreEquipo() {
        return NOMBRE_EQUIPO;
    }

    public void presentacion() {
        System.out.println("Hola! Mi nombre es " + nombreCompleto);
    }

    public static void mensajeEquipo(){
        System.out.println("\nInnoveD Col - Un gran equipo de desarrolladores de software con el mejor componente innovador!");
        System.out.println("-> Mira nuestro trabajo en https://github.com/InnoveDCol <-");
    }

}
