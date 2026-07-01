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

    private static final Color NARANJA = Color.web("#F98513");
    private static final Color AZUL    = Color.web("#111144");

    @FXML
    public void initialize() {
        dibujarTriangulos();
        dibujarCheck();
    }

    private void dibujarTriangulos() {
        GraphicsContext gc = canvasTriangulos.getGraphicsContext2D();
        double ancho = canvasTriangulos.getWidth();
        double alto  = canvasTriangulos.getHeight();

        double base = 110;
        double h    = base * Math.sqrt(3) / 2;

        int cols = (int)(ancho * 0.57 / (base / 2)) + 2;
        int rows = (int)(alto / h) + 2;

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols * 2; col++) {
                double x = col * (base / 2);
                double y = row * h;

                boolean apuntaArriba = (col % 2 == 0);
                boolean esNaranja    = ((row + col) % 2 == 0);
                gc.setFill(esNaranja ? NARANJA : AZUL);

                double[] xs, ys;
                if (apuntaArriba) {
                    xs = new double[]{x, x + base, x + base / 2};
                    ys = new double[]{y + h, y + h, y};
                } else {
                    xs = new double[]{x, x + base, x + base / 2};
                    ys = new double[]{y, y, y + h};
                }
                gc.fillPolygon(xs, ys, 3);
            }
        }
    }

    private void dibujarCheck() {
        GraphicsContext gc = canvasCheck.getGraphicsContext2D();
        double w = canvasCheck.getWidth();
        double h = canvasCheck.getHeight();

        gc.clearRect(0, 0, w, h);

        // Cuadrado con esquinas redondeadas
        gc.setStroke(AZUL);
        gc.setLineWidth(5);
        gc.strokeRoundRect(4, 4, w - 8, h - 8, 12, 12);

        // Check mark
        gc.setStroke(AZUL);
        gc.setLineWidth(6);
        gc.setLineCap(StrokeLineCap.ROUND);
        gc.setLineJoin(StrokeLineJoin.ROUND);
        gc.strokeLine(18, 48, 36, 66);
        gc.strokeLine(36, 66, 72, 24);
    }

    @FXML
    private void handleLogin() {
        String correo     = campoCorreo.getText();
        String contrasena = campoContrasena.getText();
        // TODO: conectar con lógica de autenticación
        System.out.println("Login con: " + correo);
    }

    @FXML
    private void handleRecuperar(MouseEvent event) {
        // TODO: navegar a recuperar contraseña
        System.out.println("Recuperar contraseña");
    }

    @FXML
    private void handleCrearCuenta(MouseEvent event) {
        // TODO: navegar a crear cuenta
        System.out.println("Crear cuenta");
    }
}