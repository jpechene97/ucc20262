package ProgramacionOO.Semana5;

public class Biblioteca {

    //Atributos
    private String libroconisbn;
    private String titulo;
    private String autor;
    private int aniopublicacion;
    private String disponible;
    
    //constructor
    public Biblioteca(String libroconisbn, String titulo, String autor, int aniopublicacion, String disponible){
        this.libroconisbn = libroconisbn;
        this.titulo = titulo;
        this.autor = autor;
        this.aniopublicacion = aniopublicacion;
        this.disponible = disponible;
        
    }
    //Metodos getter y setter

    public String getLibroconisbn(){
        return libroconisbn;
}
    public void setLibroconisbn (String libroconisbn){
        this.libroconisbn = libroconisbn;
    }
    public String getTitulo(){
        return titulo;
}
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    public int getAniopublicacion(){
        return aniopublicacion;
}
    public void setAniopublicacion(int aniopublicacion){
        this.aniopublicacion = aniopublicacion;
    }
    public String getDisponible(){
        return disponible;
}
    public void setDisponible(String disponible){
        this.disponible = disponible;
    }
}
