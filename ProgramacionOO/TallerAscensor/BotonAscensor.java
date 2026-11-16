package ProgramacionOO.TallerAscensor;

public class BotonAscensor extends Boton {

    private int pisoDestino;
    private boolean mantenerAbiertas;

    public BotonAscensor(int pisoDestino) {
        super(true);
        this.pisoDestino = pisoDestino;
        this.mantenerAbiertas = false;
    }

    @Override
    public void presionar() {
        if (estaFallando()) {
            System.out.println("   BotonAscensor: no responde");
            return;
        }
        System.out.println("   BotonAscensor presionado: piso " + pisoDestino);
        iluminar();
        emitirSonido();
    }

    // Acceso al atributo privado
    public int getPisoDestino() {
        return pisoDestino;
    }

    public void setPisoDestino(int pisoDestino) {
        this.pisoDestino = pisoDestino;
    }

    public boolean isMantenerAbiertas() {
        return mantenerAbiertas;
    }
}