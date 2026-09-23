package ProgramacionOO.test;

public class CuentaBan {
    //Atributos
    private int id;
    private String titular;
    private String numeroCuenta;
    private double saldo;
    //comentarios

    //Constructor de la clase --> Recuerde que tiene el mismo nombre de la clase
    public CuentaBan(int id, String titular, String numeroCuenta, double saldo){
        this.id = id;
        this.titular = titular;
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }

    //Método consignar
    public double consignar(double valor){
        double total = saldo + valor;
        return total;
    }

    @Override
    public String toString(){
        return "CuentaBancaria [ id: " + id + " titular: " + titular + " numeroCuenta: " + 
                                         numeroCuenta + " saldo: " + saldo + "]";
    }
}
