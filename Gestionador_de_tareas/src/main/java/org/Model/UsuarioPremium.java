package org.Model;

public class UsuarioPremium extends Usuario{
    //Creamos el constructor para que herede la base o atributos de la clase padre
    public UsuarioPremium(String id_usuario,String nombre_usuario, String email, String password, boolean premium){
        super(id_usuario, nombre_usuario, email, password, premium);
    }
}
