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
        window.setTitle("CSS");

        //GridPane with 10px padding around edge
        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10, 10, 10, 10));
        grid.setVgap(8);
        grid.setHgap(10);

        //Name Label - constrains use (child, column, row)
        Label nameLabel = new Label("Username:");
        GridPane.setConstraints(nameLabel, 0, 0);

        //Name Input
        TextField nameInput = new TextField();
        nameInput.setPromptText("e.g.: Saon");
        GridPane.setConstraints(nameInput, 1, 0);

        //Password Label
        Label passLabel = new Label("Password:");
        GridPane.setConstraints(passLabel, 0, 1);

        //Password Input
        TextField passInput = new TextField();
        passInput.setPromptText("********");
        GridPane.setConstraints(passInput, 1, 1);

        //Login
        Button loginButton = new Button("Log In");
        GridPane.setConstraints(loginButton, 1, 2);

        // SignUp
        Button signupButton = new Button("Sign Up");
//        signupButton.getStylesheets().add("signupButtonColor"); it is not working on Intellij IDE
        GridPane.setConstraints(signupButton,1,3);

//          demo built in Style sheet
//        loginButton.setOnAction(event -> {
//            setUserAgentStylesheet(STYLESHEET_CASPIAN);
//        });

        //Add everything to grid
        grid.getChildren().addAll(nameLabel, nameInput, passLabel, passInput, loginButton,signupButton);

        Scene scene = new Scene(grid, 400, 200);
        scene.getStylesheets().add("/sample/Design.css");
        window.setScene(scene);
        window.show();

    }
    public static void main(String[] args){ launch(args);
    }

}