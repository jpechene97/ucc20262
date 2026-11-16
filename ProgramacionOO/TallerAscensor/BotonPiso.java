package ProgramacionOO.TallerAscensor;

public class BotonPiso extends Boton {
 private String direccion; // "SUBIR" o "BAJAR"

    public BotonPiso(String direccion) {
        super(true);
        this.direccion = direccion;
    }

    @Override
    public void presionar() {
        if (estaFallando()) {
            System.out.println("   BotonPiso " + direccion + ": no responde");
            return;
        }
        System.out.println("   BotonPiso " + direccion + " presionado");
        iluminar();
        emitirSonido();
    }
}   
