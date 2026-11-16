package ProgramacionOO.TallerAscensor;

import java.util.ArrayList;

public class GestorAlertas {
    
private ArrayList<String> registroEventos;

    public GestorAlertas() {
        registroEventos = new ArrayList<>();
    }

    public void registrarFalla(String descripcion) {
        registroEventos.add("FALLA: " + descripcion);
        System.out.println("   [ALERTA] Falla registrada: " + descripcion);
    }

    public void notificarMantenimiento(String descripcion) {
        registroEventos.add("MANTENIMIENTO: " + descripcion);
        System.out.println("   [ALERTA] Se notifico a mantenimiento: " + descripcion);
    }

    public void registrarActividad(String descripcion) {
        registroEventos.add("ACTIVIDAD: " + descripcion);
        System.out.println("   [REGISTRO] " + descripcion);
    }
}
