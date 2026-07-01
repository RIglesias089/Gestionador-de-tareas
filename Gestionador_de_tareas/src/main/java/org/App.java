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

        //Cargamos la pantalla de login
        FXMLLoader loader = new FXMLLoader(
                getClass().getResource("/org/GUI/login.fxml")
        );

        Scene scene = new Scene(loader.load(), 1280, 720);

        stage.setTitle("SnowList");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
    }
}