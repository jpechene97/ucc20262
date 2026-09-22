public class CuentaBancaria {

    //Atributos de la clase CuentaBancaria
    private double saldo;
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
    // Método para depositar dinero
    public void depositar(double monto) {
        if (monto>0){
            saldo = saldo + monto;
            System.out.println("Depósito exitoso. Nuevo saldo: " + saldo);
        }else{
            System.out.println("El monto a depositar debe ser mayor a cero.");
        }
    }

//Metodo para retirar dinero
    public void retirar(double monto) 
    if (monto<=0){
        System.System.out.println("El monto a retirar debe ser mayor a cero");
    }   

public String toString  (){
        return "CuentaBancaria [saldo: "+ saldo + " titular: " + titular + " numeroCuenta: " + numeroCuenta + "tipoCuenta:" + tipoCuenta + " clave: " + clave + "]";

}

}
