package ProgramacionOO.Semana6;

public class Main {
    public static void main (String[] args) throws Exception {

        //Creación del arreglo Trabajador (arreglo de objetos)
        Trabajador[] t = new Trabajador[3];

        // Creación del objeto Trabajador y asignando a la posición del arreglo

        t[0] = new Trabajador (101125635, "Jhon", 1000.0);
        t[1] = new Trabajador (105960517, "Mario", 2000.0);
        t[2] = new Trabajador (14698852, "Lina", 1500.0);

        for (int i = 0; i< t.length; i++){
            System.out.println("El salario a pagar de " + t[i].getNombre() + " es: " + t[i].pagar());
            
        }
    }
    
}
