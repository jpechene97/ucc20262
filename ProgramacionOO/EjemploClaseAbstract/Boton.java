package ProgramacionOO.EjemploClaseAbstract;

abstract class Boton {
    
    public boolean iluminado;
    public boolean presionado;
    
    public Boton(boolean iluminado, boolean presionado){
        this.iluminado = iluminado;
        this.presionado = presionado;
    }
    
    public void setIluminado(boolean iluminado){
        this.iluminado = iluminado;
    }

    public void setPresionado(boolean presionado){
        this.presionado = presionado;
    }
    
    public abstract boolean iluminar();
    public abstract boolean presionar();
    
    public String emitirSonido(){
        return "";
    }
}
