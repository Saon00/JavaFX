import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


public class Main extends Application {

        Stage window;
        Button button1;

    @Override
    public void start(Stage primaryStage) throws Exception {

        window=primaryStage;
        button1 = new Button("Click Me");
        StackPane layout1 = new StackPane();
        layout1.getChildren().add(button1);
        button1.setOnAction(event -> {
            boolean result = AlertBox.display("Yes No Window","Are you sure you want to quit" +
                    " Proframming for today ??");
            System.out.println(result);
        });

        Scene scene = new Scene(layout1,600,300);
        window.setScene(scene);

        window.setTitle("Class 5");
        window.show();


    }


    public static void main(String[] args) {
        launch(args);
    }

}
