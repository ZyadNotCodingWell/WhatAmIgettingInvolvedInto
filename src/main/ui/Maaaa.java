package main.ui;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import main.metier.*;

public class Maaaa {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame("Suck it");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);

     
        JTextField nameField = new JTextField(10);
        JTextField cityField = new JTextField(10);
        JTextField priceField = new JTextField(5);
        JTextField quantityField = new JTextField(5);
        JComboBox<String> qualityField = new JComboBox<>(new String[]{"High_Quality", "Low_Quality"});
        JTextField discountField = new JTextField(5);
        JComboBox<String> productTypeComboBox = new JComboBox<>(new String[]{"ProduitA", "ProduitB"});

        JButton addButton = new JButton("Add Product");
        JTextArea outputArea = new JTextArea(10, 50);
        JButton annuler = new JButton("Annuler");

        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                String city = cityField.getText();
                double price = Double.parseDouble(priceField.getText());
                int quantity = Integer.parseInt(quantityField.getText());
                String productType = (String) productTypeComboBox.getSelectedItem();

                if (productType.equals("ProduitA")) {
                    String quality = (String) qualityField.getSelectedItem();
                    ProduitA productA = new ProduitA(name, city, price, quantity, quality);
                    outputArea.append("Nouveau ProduitA: " + productA + "\n");
                    outputArea.append("Prix total: " + productA.calculerPrix() + "\n");
                } else if (productType.equals("ProduitB")) {
                    double discount = Double.parseDouble(discountField.getText());
                    ProduitB productB = new ProduitB(name, city, price, quantity, discount);
                    outputArea.append("Nouveau ProduitB: " + productB + "\n");
                    outputArea.append("Prix total avec reduction: " + productB.calculerPrixReduit() + "\n");
                }
                nameField.setText("");
                cityField.setText("");
                priceField.setText("");
                quantityField.setText("");
                qualityField.setSelectedIndex(0);
                discountField.setText("");
                productTypeComboBox.setSelectedIndex(0);
            }
        });
        annuler.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				  nameField.setText("");
	                cityField.setText("");
	                priceField.setText("");
	                quantityField.setText("");
	                qualityField.setSelectedIndex(0);
	                discountField.setText("");
	                productTypeComboBox.setSelectedIndex(0);
				
			}
		});

        // Layout setup
        JPanel panel = new JPanel();
        panel.add(new JLabel("Name:"));
        panel.add(nameField);
        panel.add(new JLabel("City:"));
        panel.add(cityField);
        panel.add(new JLabel("Price:"));
        panel.add(priceField);
        panel.add(new JLabel("Quantity:"));
        panel.add(quantityField);
        panel.add(new JLabel("Type:"));
        panel.add(productTypeComboBox);
        panel.add(new JLabel("Quality:"));
        panel.add(qualityField);
        panel.add(new JLabel("Discount:"));
        panel.add(discountField);
        panel.add(addButton);
        
        panel.add(new JScrollPane(outputArea));
        panel.add(annuler);
        frame.getContentPane().add(BorderLayout.CENTER, panel);
        frame.setVisible(true);
    }

	}


