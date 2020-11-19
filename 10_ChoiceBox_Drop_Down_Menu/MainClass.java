package sample;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;


public class Main extends Application {

    Stage window;

    @Override
    public void start(Stage primaryStage) throws Exception {

        window = primaryStage;
        window.setTitle("CheckBox Example");

        //Label
        Label label = new Label("Choose Your Favourite Food");

        //Button
        Button button1 = new Button("Click Here");

        //Choice Box
        ChoiceBox<String> choiceBoxA = new ChoiceBox<>();

        // items
        choiceBoxA.getItems().add("Pizza");
        choiceBoxA.getItems().add("Ramen");
        choiceBoxA.getItems().addAll("Pasta", "Burger", "Soup");

        // default Value
        choiceBoxA.setValue("Pizza");

        // set action
        button1.setOnAction(event -> selectChoice(choiceBoxA));


        // Layout
        VBox layout = new VBox(10);
        layout.setPadding(new Insets(20));
        layout.getChildren().addAll( label,choiceBoxA ,button1);

        Scene scene = new Scene(layout, 350, 250);
        window.setScene(scene);
        window.show();

    }
private void selectChoice(ChoiceBox<String> choiceBoxA){
        String menuItems = choiceBoxA.getValue();
    System.out.println("You choose "+menuItems);

}

}

