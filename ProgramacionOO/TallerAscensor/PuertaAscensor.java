package ProgramacionOO.TallerAscensor;

public class PuertaAscensor extends Puerta{
    
 public PuertaAscensor() {
        super();
    }

    @Override
    public void abrir() {
        super.abrir();
        System.out.println("   PuertaAscensor: se abre");
    }

    @Override
    public boolean cerrar() {
        boolean cerro = super.cerrar();
        if (cerro) {
            System.out.println("   PuertaAscensor: se cierra");
        } else {
            System.out.println("   PuertaAscensor: obstaculo detectado, no puede cerrar");
        }
        return cerro;
    }

    @Override
    public void mantenerAbierta() {
        super.mantenerAbierta();
        System.out.println("   PuertaAscensor: se mantiene abierta");
    }

    @Override
    public boolean hayObstaculo() {
        return super.hayObstaculo();
    }
}