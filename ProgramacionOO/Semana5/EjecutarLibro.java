package ProgramacionOO.Semana5;

public class EjecutarLibro {
    public static void main(String[] args) {

        // Creamos 5 libros de prueba

        Libro libro1 = new Libro ("97804", "Cien años de soledad", "Gabriel García Márquez", 1967);
        Libro libro2 = new Libro ("97876", "Rayuela", "Julio Cortázar", 1963);
        Libro libro3 = new Libro ("97832", "1984", "George Orwell", 1949);
        Libro libro4 = new Libro ("97804", "Crónica de una muerte anunciada", "Gabriel García Márquez", 1981);
        Libro libro5 = new Libro ("97842", "El amor en los tiempos del cólera", "Gabriel García Márquez", 1985);

        // Mostramos la información inicial de cada libro (todos deberían estar disponibles)

        System.out.println("=== Estado inicial de los libros ===");
        System.out.println(libro1);
        System.out.println(libro2);
        System.out.println(libro3);
        System.out.println(libro4);
        System.out.println(libro5);

          System.out.println("\n=== Probando préstamos ===");
        libro1.prestar(); // debería prestarse sin problema
        libro2.prestar(); // debería prestarse sin problema
        libro1.prestar(); // ya estaba prestado, debería avisar que no está disponible
 
        System.out.println("\n=== Verificando disponibilidad ===");
        System.out.println("¿Libro 1 disponible? " + libro1.estaDisponible());
        System.out.println("¿Libro 3 disponible? " + libro3.estaDisponible());
 
        System.out.println("\n=== Probando devolución ===");
        libro1.devolver(); // vuelve a estar disponible
 
        System.out.println("\n=== Estado final de los libros ===");
        System.out.println(libro1);
        System.out.println(libro2);
        System.out.println(libro3);
        System.out.println(libro4);
        System.out.println(libro5);
    }
}