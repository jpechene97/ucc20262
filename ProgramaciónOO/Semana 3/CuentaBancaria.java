public class CuentaBancaria {

    //Atributos de la clase CuentaBancaria
    private int saldo;
    private String titular;
    private int numeroCuenta;
    private String tipoCuenta;
    private int clave;

    //Constructor de la clase
    public CuentaBancaria(int saldo, String titular, int numeroCuenta, String tipoCuenta, int clave){
        this.saldo = saldo;
        this.titular = titular;
        this.numeroCuenta = numeroCuenta;
        this.tipoCuenta = tipoCuenta;
        this.clave = clave;
    }
public String toString  (){
        return "CuentaBancaria [saldo: "+ saldo + " titular: " + titular + " numeroCuenta: " + numeroCuenta + "tipoCuenta:" + tipoCuenta + " clave: " + clave + "]";

}

}
