package ProgramacionOO.TallerAscensor;

public class SistemaControl {
    
private Ascensor ascensor;
    private Piso[] pisos;
    private GestorAlertas alertas;

    public SistemaControl(Ascensor ascensor, Piso[] pisos, GestorAlertas alertas) {
        this.ascensor = ascensor;
        this.pisos = pisos;
        this.alertas = alertas;
    }

    /** Solicitud hecha desde el boton de un piso. direccion: "SUBIR" o "BAJAR". */
    public void recibirSolicitud(int numeroPiso, String direccion) {
        if (numeroPiso < 1 || numeroPiso > pisos.length) {
            System.out.println("El piso " + numeroPiso + " no existe.");
            return;
        }

        Piso piso = pisos[numeroPiso - 1];
        BotonPiso boton = direccion.equalsIgnoreCase("SUBIR") ? piso.getBotonSubir() : piso.getBotonBajar();

        if (boton.estaFallando()) {
            alertas.registrarFalla("El boton " + direccion + " del piso " + numeroPiso + " no funciona");
            alertas.notificarMantenimiento("Revisar el boton " + direccion + " del piso " + numeroPiso);
            return;
        }

        piso.solicitarAscensor(direccion);
        alertas.registrarActividad("Solicitud recibida en el piso " + numeroPiso + " (" + direccion + ")");
    }

    /** Decide si el ascensor debe SUBIR, BAJAR o quedarse DETENIDO. */
    public void decidirDireccion() {
        int actual = ascensor.getPisoActual();
        BotonAscensor cabina = (BotonAscensor) ascensor.getBoton();
        int objetivo = -1;

        if (cabina.isIluminado()) {
            // El destino elegido dentro del ascensor tiene prioridad
            objetivo = cabina.getPisoDestino();
        } else {
            // Si no, el piso con boton encendido mas cercano
            int menorDistancia = Integer.MAX_VALUE;
            for (Piso p : pisos) {
                if (p.getBotonSubir().isIluminado() || p.getBotonBajar().isIluminado()) {
                    int distancia = Math.abs(p.getNumero() - actual);
                    if (distancia < menorDistancia) {
                        menorDistancia = distancia;
                        objetivo = p.getNumero();
                    }
                }
            }
        }

        String nueva;
        if (objetivo == -1 || objetivo == actual) {
            nueva = "DETENIDO";
        } else if (objetivo > actual) {
            nueva = "SUBIR";
        } else {
            nueva = "BAJAR";
        }

        String anterior = ascensor.getDireccion();
        if ((anterior.equals("SUBIR") && nueva.equals("BAJAR"))
                || (anterior.equals("BAJAR") && nueva.equals("SUBIR"))) {
            ascensor.cambiarDireccion();
        } else {
            ascensor.setDireccion(nueva);
        }
    }

    /** Atiende todas las solicitudes pendientes, parando en los pisos que lo necesiten. */
    public void atenderSolicitudes() {
        BotonAscensor cabina = (BotonAscensor) ascensor.getBoton();
        boolean huboAlgo = false;

        while (true) {
            decidirDireccion();
            int actual = ascensor.getPisoActual();
            Piso piso = pisos[actual - 1];

            boolean paradaAqui = (cabina.isIluminado() && cabina.getPisoDestino() == actual)
                    || piso.getBotonSubir().isIluminado()
                    || piso.getBotonBajar().isIluminado();

            if (paradaAqui) {
                huboAlgo = true;
                ascensor.detenerEnPisoCercano();
                piso.getBotonSubir().apagarIluminacion();
                piso.getBotonBajar().apagarIluminacion();
                if (cabina.getPisoDestino() == actual) {
                    cabina.apagarIluminacion();
                }
                alertas.registrarActividad("El ascensor atendio el piso " + actual);
                continue;
            }

            if (ascensor.getDireccion().equals("DETENIDO")) {
                break; // no quedan solicitudes
            }

            ascensor.mover();
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }

        if (huboAlgo) {
            System.out.println("No quedan solicitudes. Ascensor en reposo en el piso " + ascensor.getPisoActual());
        } else {
            System.out.println("No hay solicitudes pendientes.");
        }
    }
}
