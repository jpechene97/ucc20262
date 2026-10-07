package ProgramacionOO.Semana6;

public class Trabajador {

    //Atributos
    private int cedula;
    private String nombre;
    private double salario;

    //Constructor
    public Trabajador (int cedula, String nombre, double salario){
        this.cedula = cedula;
        this.nombre = nombre;
        this.salario = salario;
    }
    //Metodo pagar
    public double pagar(){
        return salario * 1.10;
    }
    
}
