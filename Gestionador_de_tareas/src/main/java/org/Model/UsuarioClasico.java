package org.Model;

public class UsuarioClasico extends Usuario {
    //Ahora usaremos herencia para que esta clase herede los atributos de la clase padre que es Usuario.java
    //Creamos el constructor para que herede la base o atributos de la clase padre
    public UsuarioClasico(String id_usuario, String nombre_usuario, String email, String password, boolean premium) {
        super(id_usuario, nombre_usuario, email, password, premium);
    }
}
