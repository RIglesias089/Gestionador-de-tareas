package org.GUI;

import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.StrokeLineCap;
import javafx.scene.shape.StrokeLineJoin;

public class LoginController {

    @FXML private TextField campoCorreo;
    @FXML private PasswordField campoContrasena;
    @FXML private Canvas canvasTriangulos;
    @FXML private Canvas canvasCheck;

    private static final Color AZUL = Color.web("#111144");

    @FXML
    public void initialize() {
        dibujarTriangulosFigma();
        dibujarCheck();
    }

    /**
     * Dibuja los triángulos de fondo abstractos localizados en la esquina
     * inferior izquierda tal cual como se muestra en la línea estética de Figma.
     */
    private void dibujarTriangulosFigma() {
        GraphicsContext gc = canvasTriangulos.getGraphicsContext2D();
        double height = canvasTriangulos.getHeight();

        // Limpiamos el lienzo antes de pintar
        gc.clearRect(0, 0, canvasTriangulos.getWidth(), canvasTriangulos.getHeight());

        // Color azul oscuro de los triángulos de fondo con una opacidad suave (Minimalista)
        Color azulAbstracto = Color.web("#111144", 0.15);
        gc.setFill(azulAbstracto);

        // Triángulo grande esquinero inferior izquierdo
        double[] x1 = {0, 0, 450};
        double[] y1 = {height, height - 400, height};
        gc.fillPolygon(x1, y1, 3);

        // Triángulo secundario entrelazado
        double[] x2 = {150, 380, 580};
        double[] y2 = {height, height - 280, height};
        gc.fillPolygon(x2, y2, 3);

        // Triángulo pequeño flotante superior izquierdo
        double[] x3 = {0, 0, 180};
        double[] y3 = {height - 350, height - 550, height - 350};
        gc.fillPolygon(x3, y3, 3);
    }

    private void dibujarCheck() {
        GraphicsContext gc = canvasCheck.getGraphicsContext2D();
        double w = canvasCheck.getWidth();
        double h = canvasCheck.getHeight();

        gc.clearRect(0, 0, w, h);

        // Fondo del icono (Caja blanca redondeada pequeña)
        gc.setFill(Color.web("#111144"));
        gc.fillRoundRect(2, 2, w - 4, h - 4, 18, 18);

        // El check (Color blanco contrastante dentro de la caja)
        gc.setStroke(Color.WHITE);
        gc.setLineWidth(5);
        gc.setLineCap(StrokeLineCap.ROUND);
        gc.setLineJoin(StrokeLineJoin.ROUND);

        // Coordenadas proporcionales adaptadas al tamaño 65x65 del FXML
        gc.strokeLine(w * 0.28, h * 0.50, w * 0.46, h * 0.68);
        gc.strokeLine(w * 0.46, h * 0.68, w * 0.75, h * 0.32);
    }

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