public class EjecutarVehiculos {
    public static void main(String[] args) {
       
        //Una constante es un valor que no cambia durante la ejecucion y deben ir en mayuscula sostenida
        final int ANIO_ACTUAL = 2026;
 
        Vehiculo objVehiculo1 = new Vehiculo(2025, "renault", "gris", 950.5, "stepway");
        Vehiculo objVehiculo2 = new Vehiculo(1954, "Hudson", "Azul", 1800, "Hornet");
 
        System.out.println(objVehiculo1);
        System.out.println(objVehiculo2);
 
        System.out.println(objVehiculo1.calcularAntiguedadVehiculo(ANIO_ACTUAL));
        System.out.println(objVehiculo2.calcularAntiguedadVehiculo(ANIO_ACTUAL));
 
 
    }
}