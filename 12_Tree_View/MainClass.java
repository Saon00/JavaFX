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
    TreeView<String> treeView;
   

    @Override
    public void start(Stage primaryStage) throws Exception {
        // window initialisation
        window = primaryStage;
        window.setTitle("List Tutorial");

        // treeView Settings
        TreeItem<String> root, saon, languages;

        // root
        root = new TreeItem<>();
        root.setExpanded(true);
        // saon
        saon = makeBranch("Saon", root);
        makeBranch("Youtube", saon);
        makeBranch("Tutorial", saon);
        makeBranch("Gaming", saon);
        // languages
        languages = makeBranch("Languages", root);
        makeBranch("Java", languages);
        makeBranch("Python", languages);
        makeBranch("C", languages);

        // crete tree
        treeView = new TreeView<>(root);
        treeView.setShowRoot(false); // it will create/don't create  an empty root
        treeView.getSelectionModel().selectedItemProperty().addListener((v, oldValue, newValue) -> {

        if(newValue != null)
            System.out.println(newValue.getValue());

        });

        // scene settings
        StackPane stackPane = new StackPane();
        stackPane.getChildren().add(treeView);
        scene = new Scene(stackPane, 350,200);
        window.setScene(scene);

        window.show();

    }
    public static void main(String[] args){ launch(args);
    }

    // create branch
    public TreeItem<String> makeBranch(String title, TreeItem<String> parent){
        TreeItem<String> item = new TreeItem<>(title);
        item.setExpanded(false);
        parent.getChildren().add(item);
        return item;
    }
}
