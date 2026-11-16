package ProgramacionOO.EjercicioSemana7;

import java.util.Date;

public class Ejecutarpedido {

    public static void main(String[] args) {

        Cliente cliente1 = new Cliente("123456", "Juan");      
        Foto foto1 = new Foto ("Foto1.JPG");
        Foto foto2= new Foto ("Foto2.JPG");

        Date fecha = new Date();

        
        Camara camara = new Camara("Canon", "EOS 5D Mark IV");
        
        Producto producto1 = new Producto(1);
        
        
        Cliente cliente = new Cliente("7749856", "Juan");
        
        Producto[] productos = new Producto[2];
        productos[0] = new Producto(1);
        productos[1] = new Producto(2);
        
        Pedido pedido = new Pedido(cliente, productos, new java.util.Date(20/12/2023), "123456");
        pedido.imprimirPedido( foto1, "verde", fecha);
        pedido.imprimirPedido( foto2, "rojo", fecha);
        System.out.println(pedido);


    }
}