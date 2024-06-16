package JavaFX;

import whyDoIAgreeToThisShit.*;

import JavaFX.ProductArray.*;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import java.lang.Integer.*;
@SuppressWarnings("unused")
public class DisplayProducts extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Create product");

        GridPane grid = new GridPane();
        
        Label prodNameLabel = new Label("Name:");
        TextField prodNameField = new TextField();
        Label originCityLabel = new Label("Origin City:");
        TextField originCityField = new TextField();
        Label unitPriceLabel = new Label("Unit Price:");
        TextField unitPriceField = new TextField();
        Label quantityLabel = new Label("Quantity: ");
        TextField quantityField = new TextField();
        
        // Here's the idea, prodA : a radio for high qual or low qual
        // prodB : another textfield with a parseInt to get discount rate
        
        // Part dyal radio
        Label qualLabel = new Label("Quality: ");
        ToggleGroup qual = new ToggleGroup();
        RadioButton highQual = new RadioButton("High Quality");
        highQual.setToggleGroup(qual);
        highQual.setSelected(true);
        RadioButton lowQual = new RadioButton("Low Quality"); // Cap, nothing from fatima is low qual
        lowQual.setToggleGroup(qual);
        // Part dyal discount
        Label discountRateLabel = new Label("Product B Discount Rate");
        TextField discountRateField = new TextField();

        Button saveButtonA = new Button("Add element as product A");
        Button saveButtonB = new Button("Add element as product B");
        Button returnButton = new Button("Return to list display");
        
        saveButtonA.setOnAction(e -> {
            try {
                String name = prodNameField.getText();
                String originCity = originCityField.getText();
                int unitPrice = Integer.parseInt(unitPriceField.getText());
                int quantity = Integer.parseInt(quantityField.getText());
                if (highQual.isSelected()) {
                    ProduitA prodInt = new ProduitA(name, originCity, unitPrice, quantity, Quality.High_Quality);
                    ProductArray.add(prodInt.toString());
                } else {
                    ProduitA prodInt = new ProduitA(name, originCity, unitPrice, quantity, Quality.Low_Quality);
                    ProductArray.add(prodInt.toString());
                }
            } catch (NumberFormatException ex) {
                ex.printStackTrace();
            }
        });
        
        saveButtonB.setOnAction(e -> {
            try {
                String name = prodNameField.getText();
                String originCity = originCityField.getText();
                int unitPrice = Integer.parseInt(unitPriceField.getText());
                int quantity = Integer.parseInt(quantityField.getText());
                int discountRate = Integer.parseInt(discountRateField.getText());
                ProduitB prodInt = new ProduitB(name, originCity, unitPrice, quantity, discountRate);
                ProductArray.add(prodInt.toString());
            } catch (NumberFormatException ex) {
                ex.printStackTrace();
            }
        });

       returnButton.setOnAction(e -> new ProductListView().start(primaryStage));

        grid.add(prodNameLabel, 0, 0);
        grid.add(prodNameField, 1, 0);
        grid.add(originCityLabel, 0, 1);
        grid.add(originCityField, 1, 1);
        grid.add(unitPriceLabel, 0, 2);
        grid.add(unitPriceField, 1, 2);
        grid.add(quantityLabel, 0, 3);
        grid.add(quantityField, 1, 3);
        grid.add(qualLabel, 0, 4);
        grid.add(highQual, 1, 4);
        grid.add(lowQual, 2, 4);
        grid.add(discountRateLabel, 0, 5);
        grid.add(discountRateField, 1, 5);
        grid.add(saveButtonA, 0, 6);
        grid.add(saveButtonB, 1, 6);
        grid.add(returnButton, 2, 6);

        Scene scene = new Scene(grid, 720, 480);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
