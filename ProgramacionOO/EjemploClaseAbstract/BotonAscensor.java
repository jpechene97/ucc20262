package ProgramacionOO.EjemploClaseAbstract;

public class BotonAscensor extends Boton {
    
    public BotonAscensor(boolean iluminado, boolean presionado){
        super(iluminado, presionado);
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