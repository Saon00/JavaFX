import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class Main extends Application {

        Stage window;
        Button buttonA,buttonB,buttonC,buttonD, buttonE, buttonF;

    @Override
    public void start(Stage primaryStage) throws Exception {

        window = primaryStage;
        window.setTitle("JAVA FX TUTORIAL");

        HBox topMenu = new HBox();
        buttonA = new Button("File");
        buttonB = new Button("Edit");
        buttonC = new Button("View");
        topMenu.getChildren().addAll(buttonC, buttonB, buttonA);

        VBox leftMenu = new VBox();
        buttonD = new Button("D");
        buttonE = new Button("E");
        buttonF = new Button("F");
        leftMenu.getChildren().addAll(buttonD, buttonE, buttonF);

        BorderPane borderPane = new BorderPane();
        borderPane.setTop(topMenu);
        borderPane.setLeft(leftMenu);


        Scene scene = new Scene(borderPane,350,250);
        window.setScene(scene);
        window.show();
    }
}
