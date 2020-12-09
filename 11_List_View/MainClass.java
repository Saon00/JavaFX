package sample;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;


public class Main extends Application {

    Stage window;
    Scene scene;
    Button button;
    ListView<String> listView;

    @Override
    public void start(Stage primaryStage) throws Exception {
        // window initialisation
        window = primaryStage;
        window.setTitle("List Tutorial");

        // button settings
        button = new Button("Click Here");
        button.setOnAction(event -> buttonClicked());

        // listview settings
        listView = new ListView<>();
        listView.getItems().addAll("Saon","Srabon","Sikder","Mohammad");
        listView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE); // to select multiple items

        // layout settings
        VBox vBox = new VBox(10);
        vBox.setPadding(new Insets(20));
        vBox.getChildren().addAll(listView, button);

        // scene settings
        scene = new Scene(vBox, 350,200);
        window.setScene(scene);
        window.show();

    }
    public static void main(String[] args){ launch(args);
    }

    private void buttonClicked(){
        String message = "";
        ObservableList<String> names;
        names = listView.getSelectionModel().getSelectedItems();

        for(String s: names){
            message += s+"\n";
        }
        System.out.println(message);
    }
}