package sample;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.stage.Stage;


public class Main extends Application {

    Stage window;

    @Override
    public void start(Stage primaryStage) throws Exception {

        window = primaryStage;
        window.setTitle("JavaFX Tutorial");

        // from
        TextField textField1 = new TextField();

        Button button1 = new Button("Click Me");
        button1.setOnAction(e -> isInt(textField1, textField1.getText()));

        // Layout
        VBox layout = new VBox(10);
        layout.setPadding(new Insets(20));
        layout.getChildren().addAll(textField1, button1);

        Scene scene = new Scene(layout, 350, 250);
        window.setScene(scene);
        window.show();

    }

    // validity check
    private boolean isInt(TextField number, String message) {
        try {
            int age = Integer.parseInt(number.getText());
            System.out.println("Your Age is: " + age);
            return true;
        } catch (Exception e) {
            System.out.println("Error " + message + " is not a number..");
            return false;
        }
    }
}