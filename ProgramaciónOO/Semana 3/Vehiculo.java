public class Vehiculo {
   
    //Atributos de la clase vehiculos
 
    private int modelo;
    private String marca;
    private String color;
    private double peso;
    private String linea;
 
    //constructor de la clase
    public Vehiculo(int modelo, String marca, String color, double peso, String linea){
 
        this.modelo = modelo;
        this.marca = marca;
        this.color = color;
        this.peso = peso;
        this.linea = linea;
    }
 
    public int calcularAntiguedadVehiculo(int anioActual){
        return anioActual - modelo;
       
    }
 
 
    //Metodo toString sirve para mostrar como esta creado el objeto
    public String toString(){
        return "Vehiculo{ Modelo: " + modelo + " Marca: " + marca + " Color: " + color + " Peso: " + peso + "kg Linea: " + linea;
       
    }
 
}