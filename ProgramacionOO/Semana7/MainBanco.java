public class MainBanco {
    public static void main(String[] args) {
        
        //Creacion del objeto cuenta
        Cuenta objCuenta = new Cuenta ("5869874-2", "Juan", 0);

        //Creacion del objeto cliente

        Cliente objCliente = new Cliente(1059605176, "Camilo");

       //Creacion del objeto Banco
       
       Banco objBanco = new Banco ("AVVillas", "Oficina Centenario", objCuenta);

       
       System.out.println(objBanco);

    }
}
