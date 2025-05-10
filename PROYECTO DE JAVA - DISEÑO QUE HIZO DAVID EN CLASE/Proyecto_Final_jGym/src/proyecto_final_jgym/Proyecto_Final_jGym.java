package proyecto_final_jgym;

import javafx.application.Application;
import javafx.stage.Stage;

public class Proyecto_Final_jGym extends Application {

    @Override
    public void start(Stage primaryStage) {
        Pantalla objeto_pantalla = new Pantalla();
        objeto_pantalla.setVisible(true);
    }

    public static void main(String[] args) {
        launch(args);
    }

}
