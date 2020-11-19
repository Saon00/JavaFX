package sample;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.stage.Stage;


public class Main extends Application {

    Stage window;

    @Override
    public void start(Stage primaryStage) throws Exception {

        window = primaryStage;
        window.setTitle("CheckBox Example");

        // CheckBoxes
        CheckBox boxA = new CheckBox("Burger");
        CheckBox boxB = new CheckBox("Pizza");
        // boxB.setSelected(true); // if you want to set tik by default

        //Text Field
        TextField textFieldA = new TextField();
        textFieldA.setPromptText("Write Your Name...");

        // Button
        Button button1 = new Button("Order Now");
        button1.setOnAction(event -> manageCheckBoxes(boxA, boxB,textFieldA));

        // Layout
        VBox layout = new VBox(10);
        layout.setPadding(new Insets(20));
        layout.getChildren().addAll( textFieldA, boxA, boxB,button1);

        Scene scene = new Scene(layout, 350, 250);
        window.setScene(scene);
        window.show();

    }

    private void manageCheckBoxes(CheckBox boxA, CheckBox boxB, TextField textFieldA){
        String message = "Hey, "+textFieldA.getText();
        if(boxA.isSelected()){
            message += ", You like BURGER !!!";
        }
        if(boxB.isSelected()){
            message += ", You like PIZZA !!!";
        }
        System.out.println(message);
    }

}
