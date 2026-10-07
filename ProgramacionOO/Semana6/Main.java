package ProgramacionOO.Semana6;

public class Main {
    public static void main (String[] args) throws Exception {

        //Creación del arreglo Trabajador (arreglo de objetos)
        Trabajador[] t = new Trabajador[3];

        // Creación del objeto Operario o Vendedor y asignando a la posición del arreglo

        t[0] = new Operario (101125635, "Jhon", 100, 120);
        t[1] = new Vendedor (105937209, "Mario", 2000.0, 21.5);
        t[2] = new Operario (14698852, "Lina", 1500.0, 60);

        for (int i = 0; i< t.length; i++){
            System.out.println("El salario a pagar de " + t[i].getNombre() + " es: " + t[i].pagar());
            
        }
    }
    
}
