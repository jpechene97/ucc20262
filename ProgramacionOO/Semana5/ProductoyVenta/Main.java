package ProgramacionOO.Semana5.ProductoyVenta;

public class Main {
    public static void main(String[] args) {
 
        // Creamos algunos productos de prueba
        Producto p1 = new Producto("P001", "Cuaderno", 3500, 50);
        Producto p2 = new Producto("P002", "Lapicero", 1200, 100);
        Producto p3 = new Producto("P003", "Mochila", 85000, 5);
 
        System.out.println("=== Inventario inicial ===");
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
 
        // Probamos ventas normales (dentro del stock disponible)
        System.out.println("\n=== Simulando ventas ===");
        p1.vender(10);  // debería funcionar, quedan 40
        p2.vender(30);  // debería funcionar, quedan 70
 
        // Probamos una venta que excede el stock disponible (debe fallar)
        p3.vender(8);   // solo hay 5, debe mostrar el mensaje de error
 
        // Probamos el reabastecimiento
        System.out.println("\n=== Reabasteciendo productos ===");
        p3.reabastecer(20); // ahora p3 debería tener 25 unidades
 
        // Ahora que ya hay stock suficiente, la venta sí debería funcionar
        System.out.println("\n=== Intentando vender de nuevo ===");
        p3.vender(8);
 
        // Calculamos el valor del inventario de cada producto
        System.out.println("\n=== Valor del inventario por producto ===");
        System.out.println(p1.getNombre() + ": $" + p1.calcularValorInventario());
        System.out.println(p2.getNombre() + ": $" + p2.calcularValorInventario());
        System.out.println(p3.getNombre() + ": $" + p3.calcularValorInventario());
 
        // Sumamos el valor total de todo el inventario de la tienda
        double valorTotalInventario = p1.calcularValorInventario()
                + p2.calcularValorInventario()
                + p3.calcularValorInventario();
        System.out.println("Valor total del inventario de la tienda: $" + valorTotalInventario);
 
        // ===== Probando la clase Venta (reto adicional) =====
        System.out.println("\n=== Probando la clase Venta ===");
        Venta venta1 = new Venta(p1, 5);   // venta válida
        Venta venta2 = new Venta(p3, 100); // venta inválida, no hay tanto stock
 
        System.out.println(venta1);
        System.out.println(venta2);
 
        System.out.println("\n=== Inventario final ===");
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
    }
}