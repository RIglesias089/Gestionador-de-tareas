package org.Model;


public class Usuario {
    //Planteamos los datos que usaremos
    private String id;
    private String nombre;
    private String email;
    private String password;
    private Boolean premium; //esto nos serviara para poder ver si es premium o no.



    //Siempre dentro de la clase, planteamos el contructorq ue inicializara los objetos
    public Usuario(String id, String nombre, String email, String password){
        this.id = id;
        this.nombre = nombre;
        this.email = email;
        this.password = password;
    }

    // Aplicamos sobrecarga con otro constructo que nos permitira en el main podamos crear de mas de una forma un Usuario
    public Usuario(String idUsuario, String nombreUsuario, String email, String password, boolean premium) {
    }
}

//Afuera podemos empezar a plantear los methods, o metodos de dicha clase.