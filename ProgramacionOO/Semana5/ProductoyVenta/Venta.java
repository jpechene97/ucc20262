package ProgramacionOO.Semana5.ProductoyVenta;

// Clase Venta (reto adicional del ejercicio).
// Representa UNA venta concreta: qué producto se vendió y en qué cantidad.
// Es distinta del método vender() de Producto: aquí estamos modelando
// la venta como un objeto propio, con su propia información.
public class Venta {
 
    private Producto producto;
    private int cantidad;
    private double total; // guardamos el resultado de la venta (precio * cantidad)
 
    // Constructor: al crear la Venta, inmediatamente intentamos
    // realizar la venta sobre el producto (esto descuenta el stock).
    public Venta(Producto producto, int cantidad) {
        this.producto = producto;
        this.cantidad = cantidad;
 
        // Reutilizamos el método vender() que ya creamos en Producto.
        // Así no repetimos la lógica de validación de stock en dos lugares.
        this.total = producto.vender(cantidad);
    }
 
    // ===== Getters y Setters =====
 
    public Producto getProducto() {
        return producto;
    }
 
    public void setProducto(Producto producto) {
        this.producto = producto;
    }
 
    public int getCantidad() {
        return cantidad;
    }
 
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
 
    public double getTotal() {
        return total;
    }
 
    @Override
    public String toString() {
        // Si el total es -1, significa que la venta no se pudo realizar
        if (total == -1) {
            return "Venta fallida: " + cantidad + " unidad(es) de \"" + producto.getNombre() + "\" (sin stock suficiente)";
        }
        return "Venta [Producto=" + producto.getNombre() +
                ", Cantidad=" + cantidad +
                ", Total=$" + total + "]";
    }
}