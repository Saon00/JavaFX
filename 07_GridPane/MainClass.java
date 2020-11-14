import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.stage.Stage;


public class Main extends Application {

        Stage window;

    @Override
    public void start(Stage primaryStage) throws Exception {

        window = primaryStage;
        window.setTitle("JAVA FX TUTORIAL");

        GridPane gridPane = new GridPane();
        gridPane.setPadding(new Insets(10));
        // individual cells gap
        gridPane.setVgap(8);
        gridPane.setHgap(10);

        // Name Label
        Label nameLabel = new Label("UserName: ");
        GridPane.setConstraints(nameLabel, 0,0);

        // Name Input
        TextField nameInput = new TextField();
        nameInput.setPromptText("e.g.: Saon"); // bengali: akta avcha lekha thakbe bg te
        GridPane.setConstraints(nameInput,1,0);

        // Password Label
        Label passwordLabel = new Label("Password: ");
        GridPane.setConstraints(passwordLabel, 0,1);

        // Password Input
        TextField passwordInput = new TextField();
        passwordInput.setPromptText("Password");
        GridPane.setConstraints(passwordInput,1,1);

        // Log-in Button
        Button logInButton = new Button("Log-In");
        GridPane.setConstraints(logInButton,1,2);

        gridPane.getChildren().addAll(nameLabel, nameInput, passwordLabel, passwordInput, logInButton);

        // Scene Create
        Scene scene = new Scene(gridPane, 350, 200);
        window.setScene(scene);
        window.show();
    }
}
