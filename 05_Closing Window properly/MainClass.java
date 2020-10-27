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
        // this will close the program when x button will be pressed.
        // closeWindow() called to check it is working or not
        // window.setOnCloseRequest(event -> closeWindow()); // formula - 1

        // formula - 2
        window.setOnCloseRequest(event -> {
            event.consume();
            closeWindow();
        });

        button1 = new Button("Close Me");
        StackPane layout1 = new StackPane();
        layout1.getChildren().add(button1);
        button1.setOnAction(event -> closeWindow());

        Scene scene = new Scene(layout1,600,300);
        window.setScene(scene);

        window.setTitle("Class 5");
        window.show();

    }

    // formula - 1: when you are closing directly
//    private void closeWindow(){
//        window.close();
//        System.out.println("Program Saved");
//    }

    // formula - 2: taking users commands

    private void closeWindow(){
        Boolean answer = AlertBox.display("Exit Window", "Are you want to exit?");
        if(answer)
            window.close();
    }

    public static void main(String[] args) {

        launch(args);
    }

}
