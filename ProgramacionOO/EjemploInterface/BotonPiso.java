package ProgramacionOO.EjemploInterface;

public class BotonPiso implements Boton {
    
    private boolean iluminado;
    private boolean presionado;
    
    public BotonPiso(boolean iluminado, boolean presionado){
        this.iluminado = iluminado;
        this.presionado = presionado;
    }
    
    public void setIluminado(boolean iluminado){
        this.iluminado = iluminado;
    }

    public void setPresionado(boolean presionado){
        this.presionado = presionado;
    }

    public boolean iluminar(){
        return false;
    }
    public boolean presionar(){
        return false;
    }
    
    public String toString(){
        return "BotonPiso [iluminado: " + iluminado + " presionado: " + presionado + "]";
    }

}