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

public class SignupController implements Initializable{

    @FXML
    private StackPane parentContainer;

    @FXML
    private AnchorPane container;

    @FXML
    private JFXTextField firstName;

    @FXML
    private JFXTextField lastName;

    @FXML
    private JFXPasswordField sign_confrmPass;

    @FXML
    private JFXButton signupButton;

    @FXML
    private JFXTextField sign_username;

    @FXML
    private JFXPasswordField sign_Pass;

    @FXML
    private JFXButton alreadyHaveAccountButton;



    public void open_login_form(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/designs/login.fxml"));
        Scene scene = alreadyHaveAccountButton.getScene();
        root.translateXProperty().set(scene.getWidth());


        parentContainer.getChildren().add(root);

        Timeline timeline = new Timeline();
        KeyValue keyValue = new KeyValue(root.translateXProperty(), 0, Interpolator.EASE_IN);
        KeyFrame keyFrame = new KeyFrame(Duration.seconds(1), keyValue);
        timeline.getKeyFrames().add(keyFrame);

        timeline.setOnFinished(event -> {
            parentContainer.getChildren().remove(container);
        });
        timeline.play();

    }


    public void signup_button(ActionEvent event) throws IOException {

        //
        String chkfirstName = firstName.getText();
        String chklastName = lastName.getText();
        String chksign_username = sign_username.getText();
        String chksign_Pass = sign_Pass.getText();
        String chksign_confrmPass = sign_confrmPass.getText();

        //

       if((chkfirstName.isEmpty() && chklastName.isEmpty() && chksign_username.isEmpty() && chksign_Pass.isEmpty() && chksign_confrmPass.isEmpty())){
           JOptionPane.showMessageDialog(null, "Fill all the fields.");
       }
       else {

           if(chksign_Pass.equals(chksign_confrmPass)) {


               Parent root = FXMLLoader.load(getClass().getResource("/designs/login.fxml"));
               Scene scene = alreadyHaveAccountButton.getScene();
               root.translateXProperty().set(scene.getWidth());


               parentContainer.getChildren().add(root);

               Timeline timeline = new Timeline();
               KeyValue keyValue = new KeyValue(root.translateXProperty(), 0, Interpolator.EASE_BOTH);
               KeyFrame keyFrame = new KeyFrame(Duration.seconds(1), keyValue);
               timeline.getKeyFrames().add(keyFrame);

               timeline.setOnFinished(event1 -> {
                   parentContainer.getChildren().remove(container);
               });
               timeline.play();

           }else{
               JOptionPane.showMessageDialog(null, "Password didn't match!!");
           }

       }
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
