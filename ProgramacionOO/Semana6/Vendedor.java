package ProgramacionOO.Semana6;

public class Vendedor extends Trabajador{
    
    //Atributos
    private double comision;

    //Constructor
    public Vendedor (int cedula, String nombre, double salario, double comision){
        super(cedula, nombre, salario);
        this.comision = comision;
    }
    public double pagar (){
        return getSalario() * (1 + (comision /100));
    }
}
    

