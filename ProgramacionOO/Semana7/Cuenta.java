public class Cuenta {
    private String numeroCuenta;
    private String titular;
    private double saldo;

    //Constructor

    public Cuenta(String numeroCuenta, String titular, double saldo) {
        this.numeroCuenta = numeroCuenta;
        this.titular = titular;
        this.saldo = saldo;

        //Metodo
    }
    public void consignar(double valor){
        saldo = saldo + valor;
    }

    public double getSaldo() {
        return saldo;
    }

        // toString
    @Override
    public String toString() {
        return "Cuenta [numeroCuenta=" + numeroCuenta + ", titular=" + titular + ", saldo=" + saldo + "]";
    }
       
}
