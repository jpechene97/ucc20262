package ProgramacionOO.Semana5;

public class Estudiante {
    
    //Atributos
    private String nombre;
    private String documento;
    private int edad;
    private String programa;
    
    //Constructor de la clase
    public Estudiante(String nombre, String documento, int edad, String programa){
        this.nombre = nombre;
        this.documento = documento;
        this.edad = edad;
        this.programa = programa;
    }
    
    //Los métodos getter y setter
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getDocumento(){
        return documento;
    }
    
    public void setDocumento(String documento){
        this.documento = documento;}

    public String getPrograma(){
        return programa;
    }
    
    public void setPrograma(String programa){
        this.programa = programa;
    }
    
    //Método toString (Mostar la información del objeto)
    public String toString(){
        return "Estudiante [ nombre: " + nombre + " documento: " + documento + " edad: " + edad + " programa: " + programa + " ]";
    }
    
public int getEdad(){
        return edad;
    }
    
    public void setEdad(int edad){
        if(edad >= 0) 
            this.edad = edad;
        else
            System.out.println("La edad es negativa");
    }
}