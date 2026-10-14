public class MainBanco {
    public static void main(String[] args) {
        
        //Creacion del objeto cuenta
        Cuenta objCuenta = new Cuenta ("5869874-2", "Juan", 0);

        //Creacion del objeto cliente

        Cliente objCliente = new Cliente(1059605176, "Camilo");

       //Creacion del objeto Banco
       
       Banco objBanco = new Banco ("AVVillas", "Oficina Centenario", objCuenta);

       
       System.out.println(objBanco); //Banco [nombre=AVVillas, direccion=Oficina Centenario, Cuenta=Cuenta [numeroCuenta=5869874-2, titular=Juan, saldo=0.0]]

       objBanco.abrirCuenta(objCliente); //Apertura de cuenta: Cliente [identificacion=1059605176, nombre=Camilo]

    }
}
