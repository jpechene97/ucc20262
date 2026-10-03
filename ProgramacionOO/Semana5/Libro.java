package ProgramacionOO.Semana5;

public class Libro {

    //Atributos
    private String libroconisbn;
    private String titulo;
    private String autor;
    private int aniopublicacion;
    private boolean disponible;
    
    //constructor
    public Libro (String libroconisbn, String titulo, String autor, int aniopublicacion){
        this.libroconisbn = libroconisbn;
        this.titulo = titulo;
        this.autor = autor;
        this.aniopublicacion = aniopublicacion;
        this.disponible = true;
        
    }
    //Metodos getter y setter

    public String getLibroconisbn(){
        return libroconisbn;
}
    public void setLibroconisbn (String libroconisbn){
        this.libroconisbn = libroconisbn;
    }
    public String getTitulo(){
        return titulo;
}
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }
 
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public int getAniopublicacion(){
        return aniopublicacion;
}
    public void setAniopublicacion(int aniopublicacion){
        this.aniopublicacion = aniopublicacion;
    }
    
    // Para "disponible" no se creó un setter directo, porque ese cambio
    // de estado debe hacerse solo a través de prestar() y devolver().
    // Así evitamos que alguien cambie la disponibilidad "a la fuerza"
    // sin pasar por la lógica del préstamo.

    public boolean getDisponible(){
        return disponible;
}

    // Métodos pedidos en el ejercicio
    // Cambia disponible a false, solo si el libro estaba disponible

     public void prestar() {
        if (disponible) {
            disponible = false;
            System.out.println("El libro \"" + titulo + "\" fue prestado con éxito.");
        } else {
            System.out.println("El libro \"" + titulo + "\" no está disponible para préstamo.");
        }
    }

    // Cambia disponible a true (el libro fue devuelto)
    public void devolver() {
        disponible = true;
        System.out.println("El libro \"" + titulo + "\" fue devuelto.");
    }

    // Retorna si el libro está disponible o no
    public boolean estaDisponible() {
        return disponible;
    }

    // toString() para mostrar la información del libro de forma ordenada
    @Override
    public String toString() {
        return "Libro [ISBN=" + libroconisbn +
                ", Titulo=" + titulo +
                ", Autor=" + autor +
                ", Año=" + aniopublicacion +
                ", Disponible=" + disponible + "]";
    }

}
