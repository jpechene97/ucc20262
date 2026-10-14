package ProgramacionOO.EjercicioSemana7;

public class impresion extends Foto {

    private String Color;
    private Foto [] Fotos;

    public impresion(String color, Foto[] fotos) {
        super("fichero");
        Color = color;
        Fotos = fotos;
    }

    @Override
    public String toString() {
        return "impresion [Color=" + Color + ", Fotos=" + (Fotos) + "]";
    }

    
}
