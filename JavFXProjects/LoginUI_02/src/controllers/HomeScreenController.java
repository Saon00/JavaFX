package controllers;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Text;
import sample.Main;

public class HomeScreenController{

    @FXML
    private BorderPane borderContainer;

    @FXML
    private Text fnt;

    @FXML
    private Text lnT;

    @FXML
    private Text unT;

    @FXML
    private Text pT;

    @FXML
    private JFXButton exitButton;

    @FXML
    void closeWindow(ActionEvent event) {

    }

}
