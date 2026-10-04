package ProgramacionOO.Semana5.ProductoyVenta;

// Clase que representa un producto dentro del sistema de la tienda.
public class Producto {
 
    // Atributos privados (encapsulamiento, igual que en el ejercicio del Libro)
    private String codigo;
    private String nombre;
    private double precio;
    private int stock; // cantidad de unidades disponibles en bodega
 
    // Constructor: recibe los 4 datos iniciales del producto
    public Producto(String codigo, String nombre, double precio, int stock) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }
 
    // ===== Getters y Setters =====
 
    public String getCodigo() {
        return codigo;
    }
 
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
 
    public String getNombre() {
        return nombre;
    }
 
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
 
    public double getPrecio() {
        return precio;
    }
 
    public void setPrecio(double precio) {
        this.precio = precio;
    }
 
    public int getStock() {
        return stock;
    }
 
    // Dejamos el setStock por si se necesita corregir manualmente el inventario,
    // pero en el uso normal del sistema, el stock se debería mover
    // únicamente a través de vender() y reabastecer(), que sí validan la lógica.
    public void setStock(int stock) {
        this.stock = stock;
    }
 
    // ===== Métodos de negocio =====
 
    // Intenta vender "cantidad" unidades del producto.
    // Devuelve el valor total de la venta si se pudo realizar,
    // o -1 si no se pudo vender (por falta de stock).
    public double vender(int cantidad) {
        if (cantidad <= 0) {
            System.out.println("La cantidad a vender debe ser mayor que cero.");
            return -1;
        }
 
        // Regla del ejercicio: no se puede vender más de lo que hay en stock
        if (cantidad > stock) {
            System.out.println("No hay suficiente stock de \"" + nombre + "\". "
                    + "Disponible: " + stock + ", solicitado: " + cantidad);
            return -1;
        }
 
        // Si hay suficiente stock, se descuenta y se calcula el valor de la venta
        stock = stock - cantidad;
        double total = cantidad * precio;
        System.out.println("Venta realizada: " + cantidad + " unidad(es) de \"" + nombre
                + "\" por un total de $" + total);
        return total;
    }
 
    // Aumenta el stock disponible (por ejemplo, cuando llega mercancía nueva)
    public void reabastecer(int cantidad) {
        if (cantidad <= 0) {
            System.out.println("La cantidad a reabastecer debe ser mayor que cero.");
            return;
        }
        stock = stock + cantidad;
        System.out.println("Se reabastecieron " + cantidad + " unidad(es) de \"" + nombre
                + "\". Stock actual: " + stock);
    }
 
    // Calcula el valor total del inventario de ESTE producto
    // (precio unitario multiplicado por las unidades que quedan en stock)
    public double calcularValorInventario() {
        return precio * stock;
    }
 
    @Override
    public String toString() {
        return "Producto [Codigo=" + codigo +
                ", Nombre=" + nombre +
                ", Precio=$" + precio +
                ", Stock=" + stock + "]";
    }
}
