package controllers;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import javafx.animation.Interpolator;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.util.Duration;

import javax.swing.*;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;


public class LoginController implements Initializable{

    @FXML
    private AnchorPane container;

    @FXML
    private JFXTextField usernameText;

    @FXML
    private JFXPasswordField passwordText;

    @FXML
    private JFXButton loginButton;

    @FXML
    private JFXButton dontHaveAccountButton;

    //

    public void userNamePassFunc(String usernameText, String passwordText){
        this.usernameText.setText(usernameText);
        this.passwordText.setText(passwordText);
    }

    @FXML
    void loginFunc(ActionEvent event) throws IOException {

        String userName_login = usernameText.getText().strip();
        String passName_login = passwordText.getText();



        if (userName_login.equals("saon") && passName_login.equals("1234")) { // I'm making this static, in future I'll update this into dynamic.
            JOptionPane.showMessageDialog(null, "Login Successful");
            System.out.println(userName_login + ", Successfully Logged in!");
            // open home screen fxml
            Parent root = FXMLLoader.load(getClass().getResource("/designs/homeScreen.fxml"));
            Scene scene = dontHaveAccountButton.getScene();
            root.translateXProperty().set(scene.getHeight());
            StackPane parentContainer = (StackPane) scene.getRoot();
            parentContainer.getChildren().add(root);

            Timeline timeline = new Timeline();
            KeyValue keyValue = new KeyValue(root.translateXProperty(), 0, Interpolator.EASE_IN);
            KeyFrame keyFrame = new KeyFrame(Duration.seconds(1), keyValue);
            timeline.getKeyFrames().add(keyFrame);

            timeline.setOnFinished(event2 -> {
                parentContainer.getChildren().remove(container);
            });
            timeline.play();
        } else {
            JOptionPane.showMessageDialog(null, "Login failed");
            System.out.println("Someone is Trying to enter your ID");


        }


    }


    public void open_signin_form(ActionEvent actionEvent) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("/designs/signup.fxml"));
        Scene scene = dontHaveAccountButton.getScene();
        root.translateYProperty().set(scene.getHeight());
        StackPane parentContainer = (StackPane) scene.getRoot();
        parentContainer.getChildren().add(root);

        Timeline timeline = new Timeline();
        KeyValue keyValue = new KeyValue(root.translateYProperty(), 0, Interpolator.EASE_IN);
        KeyFrame keyFrame = new KeyFrame(Duration.seconds(1), keyValue);
        timeline.getKeyFrames().add(keyFrame);

        timeline.setOnFinished(event -> {
            parentContainer.getChildren().remove(container);
        });
        timeline.play();

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
