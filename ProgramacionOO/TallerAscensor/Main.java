package ProgramacionOO.TallerAscensor;  

public class Main {

    public static void main(String[] args) {

        // ---------- Armado del sistema ----------
        int totalPisos = 5;
        Piso[] pisos = new Piso[totalPisos];
        for (int i = 0; i < totalPisos; i++) {
            pisos[i] = new Piso(i + 1);
        }
        PuertaAscensor puertaAscensor = new PuertaAscensor();
        BotonAscensor botonAscensor = new BotonAscensor(1);
        Ascensor ascensor = new Ascensor(1, puertaAscensor, botonAscensor);
        GestorAlertas alertas = new GestorAlertas();
        SistemaControl sistema = new SistemaControl(ascensor, pisos, alertas);

        System.out.println("##########################################");
        System.out.println("   SIMULACION DE UN ASCENSOR");
        System.out.println("   Edificio de " + totalPisos + " pisos");
        System.out.println("##########################################");

        // ---------- Escenario 1: estado inicial ----------
        titulo("ESCENARIO 1: Estado inicial");
        mostrarEstado(ascensor, puertaAscensor, botonAscensor, pisos);

        // ---------- Escenario 2: alguien en el piso 4 quiere bajar ----------
        titulo("ESCENARIO 2: Una persona en el piso 4 llama el ascensor para bajar");
        sistema.recibirSolicitud(4, "BAJAR");
        mostrarEstado(ascensor, puertaAscensor, botonAscensor, pisos);
        System.out.println("\nEl sistema atiende la solicitud:");
        sistema.atenderSolicitudes();
        mostrarEstado(ascensor, puertaAscensor, botonAscensor, pisos);

        // ---------- Escenario 3: la persona entra y elige el piso 1, con obstaculo ----------
        titulo("ESCENARIO 3: La persona entra, elige el piso 1 y una mano bloquea la puerta");
        botonAscensor.setPisoDestino(1);
        botonAscensor.presionar();
        puertaAscensor.setSensorObstaculo(true);
        System.out.println("   (Una persona esta bloqueando la puerta del ascensor)");
        mostrarEstado(ascensor, puertaAscensor, botonAscensor, pisos);
        System.out.println("\nEl sistema atiende la solicitud:");
        sistema.atenderSolicitudes();
        mostrarEstado(ascensor, puertaAscensor, botonAscensor, pisos);

        // ---------- Escenario 4: falla en los botones del piso 3 ----------
        titulo("ESCENARIO 4: Fallan los botones del piso 3");
        pisos[2].getBotonSubir().setFuncionando(false);
        pisos[2].getBotonBajar().setFuncionando(false);
        System.out.println("Una persona intenta llamar el ascensor desde el piso 3:");
        sistema.recibirSolicitud(3, "BAJAR");
        mostrarEstado(ascensor, puertaAscensor, botonAscensor, pisos);

        // ---------- Escenario 5: varias solicitudes a la vez ----------
        titulo("ESCENARIO 5: Varias solicitudes al mismo tiempo");
        System.out.println("Una persona dentro elige el piso 5 y otra en el piso 2 llama para subir:");
        botonAscensor.setPisoDestino(5);
        botonAscensor.presionar();
        sistema.recibirSolicitud(2, "SUBIR");
        mostrarEstado(ascensor, puertaAscensor, botonAscensor, pisos);
        System.out.println("\nEl sistema atiende las solicitudes (se detiene a recoger en el camino):");
        sistema.atenderSolicitudes();

        // ---------- Estado final ----------
        titulo("ESTADO FINAL");
        mostrarEstado(ascensor, puertaAscensor, botonAscensor, pisos);
        System.out.println("\nFin de la simulacion.");
    }

    // Imprime un titulo para separar cada escenario
    private static void titulo(String texto) {
        System.out.println("\n\n******************************************");
        System.out.println(texto);
        System.out.println("******************************************");
    }

    // Muestra como esta el ascensor en este momento
    private static void mostrarEstado(Ascensor ascensor, PuertaAscensor puerta,
                                      BotonAscensor botonInterno, Piso[] pisos) {
        System.out.println("\n========== ESTADO DEL ASCENSOR ==========");
        System.out.println("Piso actual:  " + ascensor.getPisoActual());
        System.out.println("Movimiento:   " + ascensor.getDireccion());
        System.out.println("Estado:       " + ascensor.getEstadoAscensor());
        System.out.println("Puerta:       " + (puerta.isAbierta() ? "ABIERTA" : "CERRADA")
                + (puerta.hayObstaculo() ? " (hay un obstaculo)" : ""));

        // Solicitudes pendientes = botones que estan iluminados
        String pendientes = "";
        if (botonInterno.isIluminado()) {
            pendientes += "[dentro del ascensor -> piso " + botonInterno.getPisoDestino() + "] ";
        }
        for (Piso p : pisos) {
            if (p.getBotonSubir().isIluminado()) {
                pendientes += "[piso " + p.getNumero() + " SUBIR] ";
            }
            if (p.getBotonBajar().isIluminado()) {
                pendientes += "[piso " + p.getNumero() + " BAJAR] ";
            }
        }
        System.out.println("Solicitudes:  " + (pendientes.isEmpty() ? "ninguna" : pendientes));

        // Fallas = botones que no funcionan
        String fallas = "";
        if (botonInterno.estaFallando()) {
            fallas += "[boton interno del ascensor] ";
        }
        for (Piso p : pisos) {
            if (p.getBotonSubir().estaFallando() || p.getBotonBajar().estaFallando()) {
                fallas += "[botones del piso " + p.getNumero() + "] ";
            }
        }
        System.out.println("Fallas:       " + (fallas.isEmpty() ? "ninguna" : fallas));
        System.out.println("=========================================");
    }
}