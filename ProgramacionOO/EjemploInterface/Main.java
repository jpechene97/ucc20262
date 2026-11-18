package ProgramacionOO.EjemploInterface;

public class Main
{
	public static void main(String[] args) {
		
		System.out.println("Se presiona el botón para subir");
		BotonPiso subir = new BotonPiso(true, true);
		System.out.println(subir);
		System.out.println("llega el ascensor....");
		System.out.println("Se apaga la luz del boton subir");
		subir.setIluminado(false);
		subir.setPresionado(false);
		System.out.println(subir);
		System.out.println("Se abren las puertas del piso");
		System.out.println("Se abren las puertas del ascensor");
		System.out.println("Entra la persona al ascensor");
		System.out.println("Presiona en piso 5");
		BotonAscensor piso5 = new BotonAscensor(true, true);
		System.out.println(piso5);
		System.out.println("Se cierran las puertas del ascensor");
		System.out.println("Se cierran las puertas del piso");
		System.out.println("Ascensor subiendo......");
		System.out.println("Alguien presiona botón alarma");
		System.out.println(piso5.emitirSonido());
		
		
	}
}