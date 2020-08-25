
package sample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {
    Button button1;
    Scene scene1;


    @Override
    public void start(Stage primaryStage) throws Exception {
        
        // set Title
        primaryStage.setTitle("JavaFX Demo");

        // button fix
        button1 = new Button("Click Me");

        // layout set
        StackPane layout1 = new StackPane();
        layout1.getChildren().add(button1);

        // scene set
        scene1 = new Scene(layout1, 600, 250);
        primaryStage.setScene(scene1);
        primaryStage.setResizable(false);
        primaryStage.show();

    }


    public static void main(String[] args) {
        launch(args);
    }
}
