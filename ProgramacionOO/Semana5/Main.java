package ProgramacionOO.Semana5;

public class Main {
    public static void main(String[] args) throws Exception {
        
        //Crear el objeto de la clase Estudiante
        
        Estudiante objEst1 = new Estudiante("Juan", "1016896547", 20, "Ingeniería de Sistemas");
        Estudiante objEst2 = new Estudiante("María", "89698563", 22, "Ingeniería Industrial");
        Estudiante objEst3 = new Estudiante("Miguel", "14569874", 18, "Ingeniería de Sistemas");
        
        //Mostrar la información del objeto
        System.out.println(objEst1);
        System.out.println(objEst2);
        System.out.println(objEst3);
        
        //Uso de los métodos get y set
        System.out.println(objEst1.getEdad()); //20
        System.out.println(objEst3.getEdad()); //18
        
        //Cambiar el nombre del objeto "objEst2"
        objEst2.setNombre("María Isabel");

        //Cambiar el programa del objeto "objEst2"
        objEst2.setPrograma("Ingeniería de Sistemas");
        
        //Mostrar el objeto completo
        System.out.println(objEst2); //Estudiante [ nombre: María Isabel documento: 89698563 edad: 22 programa: Ingeniería de Sistemas ]
        
        //validar con el metodo setEdad que la edad sea mayor o igual a cero
        objEst1.setEdad(30);
        System.out.println(objEst1);
        objEst1.setEdad(-30);

    }
}