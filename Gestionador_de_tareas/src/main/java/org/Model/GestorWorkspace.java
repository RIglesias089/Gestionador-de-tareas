package org.Model;

public class GestorWorkspace {
    //Creamos un Gestor de Workspace para que pueda crar las tareas, recordatorios y demas opciones en el programa

    String id_gestor;
    String nombre_gestor;
    String descripcion;

    //Creamos el contructor de el gestor de workspace
    public GestorWorkspace(String id_gestor, String nombre_gestor, String descripcion){
        this.id_gestor = id_gestor;
        this.nombre_gestor = nombre_gestor;
        this.descripcion = descripcion;
    }
}
