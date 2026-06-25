package org.Model;

//Al trabajar con fechas implementaremos la libreria
import java.time.LocalDate;

public abstract class Evento {
    protected String id_evento;
    protected String nombre_evento;
    protected String descripcion;
    protected Usuario creador;
    protected LocalDate fecha;

    //Hacemos el constructor
    public Evento(String id_evento,
    String nombre_evento,
    String descripcion,
    Usuario creador,
    LocalDate fecha){
        this.id_evento = id_evento;
        this.nombre_evento = nombre_evento;
        this.descripcion = descripcion;
        this.creador = creador;
        this.fecha = fecha;
    }

    //Planteamos los get y set de los datos
    public String getId_evento() {
        return id_evento;
    }

    public void setId_evento(String id_evento) {
        this.id_evento = id_evento;
    }

    public String getNombre_evento() {
        return nombre_evento;
    }

    public void setNombre_evento(String nombre_evento) {
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

    
}

