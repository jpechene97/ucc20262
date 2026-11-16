package ProgramacionOO.TallerAscensor;

public class Puerta {

    private boolean abierta;
    private boolean sensorObstaculo;

    public Puerta() {
        this.abierta = false;
        this.sensorObstaculo = false;
    }

    public void abrir() {
        abierta = true;
    }

    /** Devuelve true si se pudo cerrar, false si hay un obstaculo. */
    public boolean cerrar() {
        if (hayObstaculo()) {
            return false;
        }
        abierta = false;
        return true;
    }

    public void mantenerAbierta() {
        abierta = true;
    }

    public boolean hayObstaculo() {
        return sensorObstaculo;
    }

    public boolean isAbierta() {
        return abierta;
    }

    // Acceso al atributo privado (para simular el sensor)
    public void setSensorObstaculo(boolean sensorObstaculo) {
        this.sensorObstaculo = sensorObstaculo;
    }
}