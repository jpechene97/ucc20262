package ProgramacionOO.EjemploInterface;

public class BotonAscensor implements Boton {
    
    private boolean iluminado;
    private boolean presionado;
    
    public BotonAscensor(boolean iluminado, boolean presionado){
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
    
    public String emitirSonido(){
        return "ring ring";
    }
    
    public String toString(){
        return "BotonAscensor [iluminado: " + iluminado + " presionado: " + presionado + "]";
    }
}
