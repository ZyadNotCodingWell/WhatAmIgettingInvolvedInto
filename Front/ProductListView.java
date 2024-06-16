package JavaFX;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ProductListView extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Liste de produits");


        
        ListView<String> listView = new ListView<>();
        listView.getItems().addAll(ProductArray.prodArray);

        Button redirectButton = new Button("Ajouter Produit");
        redirectButton.setOnAction(e -> {
            DisplayProducts displayProducts = new DisplayProducts();
            try {
                displayProducts.start(primaryStage);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        });


        VBox vbox = new VBox(redirectButton);


        BorderPane borderPane = new BorderPane();
        borderPane.setTop(vbox);
        borderPane.setCenter(listView);


        Scene scene = new Scene(borderPane, 300, 200);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
