package ProgramacionOO.Semana4;

public class CuentaBan {
    //Atributos
    private int id;
    private String titular;
    private String numeroCuenta;
    private double saldo;

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

        //Método retirar
    public String retirar(double valor){
        String msg = "";
        if(valor > saldo){
            msg = "No se puede hacer el retiro";
        } else {
             msg = (saldo - valor) + "";
        }
        return msg;
    }

    //Consultar saldo
    public String saldo(double valor){
        return "Saldo actual: " + saldo;
    }

    @Override
    public String toString(){
        return "CuentaBancaria [ id: " + id + " titular: " + titular + " numeroCuenta: " + 
                                         numeroCuenta + " saldo: " + saldo + "]";
    }
}
