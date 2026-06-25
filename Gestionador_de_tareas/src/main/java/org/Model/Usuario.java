package org.Model;

//importamos el interface
import org.interfaces.Autenticable;
import java.util.List;
import java.util.ArrayList;

//Hacemos que sea una clase abstracta para que no nos de un error
public abstract class Usuario implements Autenticable {
    //Planteamos los datos que usaremos
    private String id;
    private String nombre;
    private String email;
    private String password;
    private Boolean premium; //esto nos serviara para poder ver si es premium o no.

    //Al implementar un gestor de workspace, este puede ser uno o varios y debe ser dinamico para que pueda aumentar o disminuir sin restriccion
    private List<GestorWorkspace> workspace;

    //Siempre dentro de la clase, planteamos el contructorq ue inicializara los objetos
    public Usuario(String id, String nombre, String email, String password){
        this.id = id;
        this.nombre = nombre;
        this.email = email;
        this.password = password;

        this.workspace = new ArrayList<>(); //el Arraylist hace una lista apoyada en un solo arreglo interno quen nos ayuda a darle dinamismo.
    }

    // Aplicamos sobrecarga con otro constructo que nos permitira en el main podamos crear de mas de una forma un Usuario
    public Usuario(String idUsuario, String nombreUsuario, String email, String password, boolean premium) {
    }
}

//Afuera podemos empezar a plantear los methods, o metodos de dicha clase.