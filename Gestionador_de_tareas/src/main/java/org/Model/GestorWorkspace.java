package org.Model;

import java.util.ArrayList;
import java.util.List;

public class GestorWorkspace {
    //Creamos un Gestor de Workspace para que pueda crar las tareas, recordatorios y demas opciones en el programa

    String id_gestor;
    String nombre_gestor;
    String descripcion;

    private List<Usuario>miembros; //Hacemos que la cantidad de usuarios sean renombradas como los miembros
    private Usuario creador; //Definimos un objeto de tipo usuario con el rol de creador


    //Creamos el contructor de el gestor de workspace
    public GestorWorkspace(
            String id_gestor,
            String nombre_gestor,
            String descripcion,
            List<Usuario> miembros,
            Usuario creador
    ) {

        this.id_gestor = id_gestor;
        this.nombre_gestor = nombre_gestor;
        this.descripcion = descripcion;

        this.miembros = miembros;
        this.creador = creador;
    }

    //Hacemos los metodos para la clase
    public String getId_gestor() {
        return id_gestor;
    }

    public void setId_gestor(String id_gestor) {
        this.id_gestor = id_gestor;
    }

    public String getNombre_gestor() {
        return nombre_gestor;
    }

    public void setNombre_gestor(String nombre_gestor) {
        this.nombre_gestor = nombre_gestor;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    //El metodo toma los datos de el lsitado de usuarios y los deveulve como miembros nada mas
    public List<Usuario> getMiembros() {
        return miembros;
    }

    //Reescribe los miembros que extrajo en miembros
    public void setMiembros(List<Usuario> miembros) {
        this.miembros = miembros;
    }

    public Usuario getCreador() {
        return creador;
    }

    public void setCreador(Usuario creador) {
        this.creador = creador;
    }

    //Ahora con el gestor haremos que podamos crear usuarios
    public void agregarUsuario(Usuario usuario){
        if (!miembros.contains(usuario)){ //Hacemos uso de el contains para que recorra la lsita de miembros y vea si el usuario ya existe o no
            miembros.add(usuario); //Si este no esta incluye al usuario en miembros
        }
        if (!usuario.getWorkspace().contains(this)){ // Buscamos hacer que si el usuario no esta en el workspace, lo agregue 
            usuario.getWorkspace().add(this);
        }
    }


}
