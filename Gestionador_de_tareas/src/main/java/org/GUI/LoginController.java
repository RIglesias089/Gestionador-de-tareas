//aca haremos la logica de cada archivo para poder trabajar con javafx y que funcione

package org.GUI;

import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class LoginController {

    @FXML private TextField campoCorreo;
    @FXML private PasswordField campoContrasena;

    @FXML
    private void handleLogin() {
        String correo = campoCorreo.getText();
        String contrasena = campoContrasena.getText();
        System.out.println("Login con: " + correo);
    }

    @FXML
    private void handleRecuperar(MouseEvent event) {
        System.out.println("Recuperar contraseña");
    }

    @FXML
    private void handleCrearCuenta(MouseEvent event) {
        System.out.println("Crear cuenta");
    }
}