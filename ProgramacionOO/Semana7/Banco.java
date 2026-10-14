public class Banco {

    private String nombre;
    private String direccion;
    private Cuenta Cuenta;

    //Constructor
    public Banco(String nombre, String direccion, Cuenta cuenta) {
        this.nombre = nombre;
        this.direccion = direccion;
        Cuenta = cuenta;
    }

    //Metodo
    public void abrirCuenta(Cliente Cliente){
        System.out.println("Apertura de cuenta: " + Cliente);
    }
    
}
