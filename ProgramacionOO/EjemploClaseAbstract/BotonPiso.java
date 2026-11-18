package ProgramacionOO.EjemploClaseAbstract;

public class BotonPiso extends Boton {
    
    public BotonPiso(boolean iluminado, boolean presionado){
        super(iluminado, presionado);
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