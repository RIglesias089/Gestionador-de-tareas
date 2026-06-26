package org.model;

import org.enums.Estado;
import org.enums.Prioridad;

import java.time.LocalDate;
import java.util.Scanner;

public class Tarea extends Evento {

    private Prioridad prioridad;
    private Estado estado;

    public Tarea(
            String id_evento,
            String nombre_evento,
            String descripcion,
            Usuario creador,
            LocalDate fecha,
            Prioridad prioridad,
            Estado estado
    ) {

        super(id_evento, nombre_evento, descripcion, creador, fecha);

        this.prioridad = prioridad;
        this.estado = estado;
    }

    public Prioridad getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(Prioridad prioridad) {
        this.prioridad = prioridad;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public void notificar() {
        System.out.println("NOTIFICACION: " + nombre_evento);
    }

    public void cambiarEstado(Estado estado) {
        this.estado = estado;
        System.out.println("Estado actualizado: " + estado);
    }

    @Override
    public void mostrarInformacion() {

        System.out.println("ID: " + id_evento);
        System.out.println("Nombre: " + nombre_evento);
        System.out.println("Descripcion: " + descripcion);
        System.out.println("Creador: " + creador.getNombre_usuario());
        System.out.println("Fecha: " + fecha);
        System.out.println("Estado: " + estado);
        System.out.println("Prioridad: " + prioridad);

    }

    public static Tarea crearDesdeConsola(
            Scanner scanner,
            String id,
            Usuario creador
    ) {

        System.out.print("Nombre de la tarea: ");
        String nombre = scanner.nextLine();

        System.out.print("Descripcion: ");
        String descripcion = scanner.nextLine();

        System.out.print("Fecha (YYYY-MM-DD): ");
        LocalDate fecha = LocalDate.parse(scanner.nextLine());

        System.out.print("Prioridad (ALTA/MEDIA/BAJA): ");
        Prioridad prioridad = Prioridad.valueOf(
                scanner.nextLine().toUpperCase()
        );

        System.out.print("Estado (PENDIENTE/EN_PROGRESO/COMPLETADO/CANCELADA): ");
        Estado estado = Estado.valueOf(
                scanner.nextLine().toUpperCase()
        );

        return new Tarea(
                id,
                nombre,
                descripcion,
                creador,
                fecha,
                prioridad,
                estado
        );

    }
}