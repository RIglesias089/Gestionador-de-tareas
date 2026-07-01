package org;

//Importamos para el uso de JavaFX
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.text.Font;

public class App extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

        //Cargamos la funete que usamos en el proyecto
        Font.loadFont(
                getClass().getResourceAsStream("/org/css/fonts/Kurale-Regular.ttf"), 14
        );
    }
}