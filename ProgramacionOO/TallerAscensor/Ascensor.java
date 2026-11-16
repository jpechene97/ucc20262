package ProgramacionOO.TallerAscensor;

public class Ascensor {

    private int pisoActual;
    private String direccion;
    private String estadoAscensor;
    private Puerta puerta;
    private Boton boton;

    public Ascensor(int pisoActual, Puerta puerta, Boton boton) {
        this.pisoActual = pisoActual;
        this.direccion = "DETENIDO";
        this.estadoAscensor = "DETENIDO";
        this.puerta = puerta;
        this.boton = boton;
    }

    /** Se mueve un piso en la direccion actual. */
    public void mover() {
        if (direccion.equals("SUBIR")) {
            pisoActual++;
        } else if (direccion.equals("BAJAR")) {
            pisoActual--;
        } else {
            return;
        }
        estadoAscensor = "MOVIENDO";
        System.out.println("   >> El ascensor pasa por el piso " + pisoActual);
    }

    /** Invierte la direccion (SUBIR <-> BAJAR). */
    public void cambiarDireccion() {
        if (direccion.equals("SUBIR")) {
            direccion = "BAJAR";
        } else if (direccion.equals("BAJAR")) {
            direccion = "SUBIR";
        }
        System.out.println("   El ascensor cambia de direccion: " + direccion);
    }

    /** Se detiene en el piso, abre la puerta y la vuelve a cerrar. */
    public void detenerEnPisoCercano() {
        direccion = "DETENIDO";
        System.out.println("** El ascensor se detiene en el piso " + pisoActual + " **");
        puerta.abrir();
        estadoAscensor = "PUERTAS_ABIERTAS";

        if (puerta.hayObstaculo()) {
            puerta.mantenerAbierta();
            System.out.println("   (La persona ya despejo la puerta)");
            puerta.setSensorObstaculo(false);
        }

        puerta.cerrar();
        estadoAscensor = "DETENIDO";
    }

    // Acceso a los atributos privados
    public int getPisoActual() {
        return pisoActual;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getEstadoAscensor() {
        return estadoAscensor;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Boton getBoton() {
        return boton;
    }
}