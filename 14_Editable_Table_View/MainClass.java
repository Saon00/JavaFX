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
    TableView<Product> table;
    TextField nameInput, priceInput, quantityInput;

    @Override
    public void start(Stage primaryStage) throws Exception {

        window = primaryStage;
        window.setTitle("thenewboston - JavaFX");

        //Name column
        TableColumn<Product, String> nameColumn = new TableColumn<>("Name");
        nameColumn.setMinWidth(200);
        nameColumn.setCellValueFactory(new PropertyValueFactory<>("name"));

        //Price column
        TableColumn<Product, Double> priceColumn = new TableColumn<>("Price");
        priceColumn.setMinWidth(100);
        priceColumn.setCellValueFactory(new PropertyValueFactory<>("price"));

        //Quantity column
        TableColumn<Product, String> quantityColumn = new TableColumn<>("Quantity");
        quantityColumn.setMinWidth(100);
        quantityColumn.setCellValueFactory(new PropertyValueFactory<>("quantity"));

        // Name Input
        nameInput = new TextField();
        nameInput.setPromptText("Enter Product's Name");
        nameInput.setMinWidth(200);
        // Price Input
        priceInput = new TextField();
        priceInput.setPromptText("Enter Product's Price");
        priceInput.setMinWidth(100);
        // Quantity Input
        quantityInput = new TextField();
        quantityInput.setPromptText("Enter Product's Quantity(s)");
        quantityInput.setMinWidth(100);

        // Button(s)
        Button addButton = new Button("Add");
        addButton.setOnAction(event -> addButtonClicked());
        Button deleteButton = new Button("Delete");
        deleteButton.setOnAction(event -> deleteButtonClicked());

        HBox hBox = new HBox();
        hBox.setPadding(new Insets(10));
        hBox.setSpacing(10);
        hBox.getChildren().addAll(nameInput, priceInput, quantityInput, addButton, deleteButton);

        table = new TableView<>();
        table.setItems(getProduct());
        table.getColumns().addAll(nameColumn, priceColumn, quantityColumn);

        VBox vBox = new VBox();
        vBox.getChildren().addAll(table,hBox);

        Scene scene = new Scene(vBox);
        window.setScene(scene);
        window.show();
    }
    public static void main(String[] args){ launch(args);
    }

    // add button clicked
    public void addButtonClicked(){
        Product product = new Product();
        product.setName(nameInput.getText());
        product.setPrice(Double.parseDouble(priceInput.getText()));
        product.setQuantity(Integer.parseInt(quantityInput.getText()));
        table.getItems().add(product);
        nameInput.clear();
        priceInput.clear();
        quantityInput.clear();
    }

    // delete button clicked
    public void deleteButtonClicked(){
        ObservableList<Product> productSelected, allProducts;
        allProducts = table.getItems();
        productSelected = table.getSelectionModel().getSelectedItems();
        productSelected.forEach(allProducts::remove);
    }
    // get all of the products
    public ObservableList<Product> getProduct(){
        ObservableList<Product> products = FXCollections.observableArrayList();
        products.add(new Product("ASUS Laptop",70_000,20));
        products.add(new Product("LENEVO Laptop",45_000,15));
        products.add(new Product("HP Laptop",60_000,30));
        products.add(new Product("MAC Laptop",1_20_000,5));
        products.add(new Product("ACER Laptop",35_000,40));

        return products;
    }

}
/* you can sort, re-arrange, add, delete. */