package sample;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class Main extends Application {

    Stage window;
    BorderPane borderPane;

    @Override
    public void start(Stage primaryStage) throws Exception {

        window = primaryStage;
        window.setTitle("Menus JavaFX");

        // filemenu
        Menu fileMenu = new Menu("_File");
        /* here "_File" means we made short cut.
           if you type 'Alt+F' it will open with menu bar.
         */

        // menu Items
        MenuItem newFile = new MenuItem("New");
        newFile.setOnAction(event -> System.out.println("Created a new File"));
        fileMenu.getItems().add(newFile); // this is bcz if we want any action on that item
        fileMenu.getItems().add(new MenuItem("Open..."));
        fileMenu.getItems().add(new MenuItem("Save..."));
        fileMenu.getItems().add(new SeparatorMenuItem());
        fileMenu.getItems().add(new MenuItem("Settings..."));
        fileMenu.getItems().add(new SeparatorMenuItem());
        fileMenu.getItems().add(new MenuItem("Exit..."));

        // editMenu
        Menu editMenu = new Menu("_Edit");

        // menuItems
        editMenu.getItems().add(new MenuItem("Copy"));
        editMenu.getItems().add(new MenuItem("Cut"));
        editMenu.getItems().add(new MenuItem("Paste"));

        MenuItem readOnly = new MenuItem("read-only");
        readOnly.setDisable(true);
        editMenu.getItems().add(readOnly);

        // Main Menu Bar
        MenuBar menuBar = new MenuBar();
        menuBar.getMenus().addAll(fileMenu, editMenu);

        borderPane = new BorderPane();
        borderPane.setTop(menuBar);

        Scene scene = new Scene(borderPane,400,300);
        window.setScene(scene);
        window.show();

    }
    public static void main(String[] args){ launch(args);
    }

}