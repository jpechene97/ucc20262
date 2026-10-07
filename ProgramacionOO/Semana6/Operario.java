package ProgramacionOO.Semana6;

public class Operario extends Trabajador{

    //Atributos
    private double horas;

    //Constructor
    public Operario(int cedula, String nombre, double salario, double horas){
        super(cedula, nombre, salario);
        this.horas = horas;
    }
      public double pagar(){
        return getSalario() * horas;
      }   
}
