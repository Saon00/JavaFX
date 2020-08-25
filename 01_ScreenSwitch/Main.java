Screen Switch

package sample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class Main extends Application {
    Button button1, button2;
    Scene scene1, scene2;


    @Override
    public void start(Stage primaryStage) throws Exception {

        // button 1
        Label label1 = new Label("This is First Scene");
        button1 = new Button("lets go to scene 2");
        button1.setOnAction(e -> primaryStage.setScene(scene2));

        // layout 1
        VBox layout1 = new VBox(10);
        layout1.getChildren().addAll(label1, button1);
        scene1 = new Scene(layout1, 600, 200);

        // button 2
        Label label2 = new Label("Badhon Onek Lokkhi meye :3");
        button2 = new Button("move scene 1");
        button2.setOnAction(e -> primaryStage.setScene(scene1));

        // layout 2
        VBox layout2 = new VBox(10);
        layout2.getChildren().addAll(label2, button2);
        scene2 = new Scene(layout2, 400, 200);

        primaryStage.setScene(scene1);
        primaryStage.setTitle("JavaFX Demo");
        primaryStage.show();


    }


    public static void main(String[] args) {
        launch(args);
    }
}
