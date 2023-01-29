package com.screen;

import com.domain.Product;
import com.dao.ProductDAO;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

public class MainScreen extends JFrame {

    private JPanel mainPanel;
    private JButton addProductButton;
    private JButton resetButton;
    private JTextField productNameTextField;
    private JComboBox typeComboBox;
    private JTextField priceTextField;
    private JTextField brandTextField;
    private JTextField quantityTextField;
    private JTextField screenSizeTextField;
    private JTextField storageSizeTextField;
    private JTextField ramTextField;
    private JTextField batteryPowerTextField;
    private JPanel leftPanel;
    private JPanel formPanel;
    private JPanel titlePanel;
    private JButton listButton;

    public MainScreen() {
        this.add(mainPanel);
        this.setTitle("Inventory Management System | Tech Store");
        this.getContentPane();
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(400,600); // size of the window
        this.setResizable(false);
        this.setLocationRelativeTo(null); // centered window

        // add function to add button
        addProductButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //get values from user inputs.
                String productName = productNameTextField.getText();
                String type = Objects.requireNonNull(typeComboBox.getSelectedItem()).toString();
                String brand = brandTextField.getText();
                double price = Double.parseDouble(priceTextField.getText());
                int stockQuantity = Integer.parseInt(quantityTextField.getText());
                int storageSize = Integer.parseInt(storageSizeTextField.getText());
                double screenSize = Double.parseDouble(screenSizeTextField.getText());
                int ram = Integer.parseInt(ramTextField.getText());
                int batteryPower = Integer.parseInt(batteryPowerTextField.getText());


                Product product = new Product(productName, type, brand, price, stockQuantity, storageSize, screenSize, ram, batteryPower);


                ProductDAO pDAO = new ProductDAO();
                pDAO.insertProduct(product);
            }
        });


        //add function to list button
        listButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame listScreen = new ListScreen();
                listScreen.setVisible(true);
            }
        });


        //add function to reset button
        resetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                productNameTextField.setText("");
                priceTextField.setText("");
                brandTextField.setText("");
                quantityTextField.setText("");
                screenSizeTextField.setText("");
                storageSizeTextField.setText("");
                ramTextField.setText("");
                batteryPowerTextField.setText("");
            }
        });
    }

}
