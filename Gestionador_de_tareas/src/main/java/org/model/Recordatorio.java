package org.model;

import org.strategy.NotificacionesStrategy;
import org.strategy.NumeroNotificacion;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Recordatorio extends Evento {

    private LocalDateTime Hora;
    private NotificacionesStrategy estrategia;

    public Recordatorio(
            String id_evento,
            String nombre_evento,
            String descripcion,
            Usuario creador,
            LocalDate fecha,
            LocalDateTime Hora
    ) {
        // Ejecuta el constructor de la clase padre (Evento)
        super(id_evento, nombre_evento, descripcion, creador, fecha);

        this.Hora = Hora;

        // para obtener el teléfono se llame exactamente getTelefono() o gettelefono().
        // Si en tu clase Usuario se llama 'gettelefono()', cambia la T mayúscula por minúscula.
        this.estrategia = new NumeroNotificacion(creador.gettelefono());
    }

    public LocalDateTime getHora() {
        return Hora;
    }

    public void setHora(LocalDateTime Hora) {
        this.Hora = Hora;
    }

    public NotificacionesStrategy getEstrategia() {
        return estrategia;
    }

    public void setEstrategia(NotificacionesStrategy estrategia) {
        this.estrategia = estrategia;
    }

    public void activarAlarma() {
        String mensaje = "ALARMA ACTIVADA - Recordatorio: "
                + nombre_evento
                + " | Descripcion: "
                + descripcion
                + " | Fecha: "
                + fecha
                + " | Hora: "
                + Hora
                + " | Creador: "
                + creador.getNombre_usuario();

        if (estrategia != null) {
            estrategia.enviarnotificaion(mensaje);
        } else {
            System.out.println("⚠️ Sin canal asignado: " + mensaje);
        }
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("====== RECORDATORIO ======");
        System.out.println("ID: " + id_evento);
        System.out.println("Nombre: " + nombre_evento);
        System.out.println("Descripcion: " + descripcion);
        System.out.println("Creador: " + creador.getNombre_usuario());

        System.out.println("Telefono del Creador: " + creador.gettelefono());

        System.out.println("Fecha: " + fecha);
        System.out.println("Hora: " + Hora);
    }

    public static Recordatorio crearDesdeConsola(
            Scanner scanner,
            String id,
            Usuario creador
    ) {
        System.out.print("Nombre del recordatorio: ");
        String nombre = scanner.nextLine();

        System.out.print("Descripcion: ");
        String descripcion = scanner.nextLine();

        System.out.print("Fecha (YYYY-MM-DD): ");
        LocalDate fecha = LocalDate.parse(scanner.nextLine());

        System.out.print("Hora (HH:MM): ");
        String horaStr = scanner.nextLine();

        LocalDateTime Hora = LocalDateTime.parse(
                fecha + "T" + horaStr + ":00"
        );

        return new Recordatorio(
                id,
                nombre,
                descripcion,
                creador,
                fecha,
                Hora
        );
    }
}