package ProgramacionOO.EjercicioSemana7;

import java.util.Arrays;
import java.util.Date;

public class Pedido {

    private Cliente cliente;
    private Producto[] producto;
    private Date fecha;
    private String numeroTarjetaCredito;

    public Pedido(Cliente cliente, Producto[] producto, Date fecha, String numeroTarjetaCredito) {

        this.cliente = cliente;
        this.producto = producto;
        this.fecha = fecha;
        this.numeroTarjetaCredito = numeroTarjetaCredito;
    }

    public void imprimirPedido(Foto foto, 
        String color, Date fecha) {

        System.out.println("\t -------- Pedido ---- ----");
        System.out.println("Pedido:");

        System.out.println(cliente);
        System.out.println("Productos: ");
        for (Producto p : producto) {
            System.out.println("- Producto ID: " + p.getNumero());
        }
        System.out.println("Fecha: " + fecha);
        System.out.println("Número de Tarjeta de Crédito: " + numeroTarjetaCredito);
        System.out.println("Foto: " + foto.getFichero() + ", Color: " + color);
    }

    @Override
    public String toString() {
        return "Pedido [cliente=" + cliente + ", producto=" + Arrays.toString(producto) + ", fecha=" + fecha
                + ", numeroTarjetaCredito=" + numeroTarjetaCredito + "]";
    }

        
}
