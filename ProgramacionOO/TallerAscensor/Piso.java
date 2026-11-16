package ProgramacionOO.TallerAscensor;

public class Piso {
    
 private int numero;
    private BotonPiso botonSubir;
    private BotonPiso botonBajar;

    public Piso(int numero) {
        this.numero = numero;
        this.botonSubir = new BotonPiso("SUBIR");
        this.botonBajar = new BotonPiso("BAJAR");
    }

    /** direccion: "SUBIR" o "BAJAR" */
    public void solicitarAscensor(String direccion) {
        System.out.println("Piso " + numero + ": solicita el ascensor (" + direccion + ")");
        if (direccion.equalsIgnoreCase("SUBIR")) {
            botonSubir.presionar();
        } else {
            botonBajar.presionar();
        }
    }

    // Acceso a los atributos privados
    public int getNumero() {
        return numero;
    }

    public BotonPiso getBotonSubir() {
        return botonSubir;
    }

    public BotonPiso getBotonBajar() {
        return botonBajar;
    }
}
