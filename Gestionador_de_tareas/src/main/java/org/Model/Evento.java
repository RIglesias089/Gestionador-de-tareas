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
}
