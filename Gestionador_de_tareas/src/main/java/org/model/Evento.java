package org.model;

import java.time.LocalDate;

public abstract class Evento {

    protected String id_evento;
    protected String nombre_evento;
    protected String descripcion;
    protected Usuario creador;
    protected LocalDate fecha;

    public Evento(
            String id_evento,
            String nombre_evento,
            String descripcion,
            Usuario creador,
            LocalDate fecha
    ) {

        this.id_evento = id_evento;
        this.nombre_evento = nombre_evento;
        this.descripcion = descripcion;
        this.creador = creador;
        this.fecha = fecha;
    }

    public String getId() {
        return id_evento;
    }

    public void setId(String id_evento) {
        this.id_evento = id_evento;
    }

    public String getNombre() {
        return nombre_evento;
    }

    public void setNombre(String nombre_evento) {
        this.nombre_evento = nombre_evento;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Usuario getCreador() {
        return creador;
    }

    public void setCreador(Usuario creador) {
        this.creador = creador;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public abstract void mostrarInformacion();

}