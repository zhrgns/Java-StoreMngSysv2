package com.screen;

import com.dao.ProductDAO;
import com.domain.Product;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.List;

public class ListScreen extends JFrame {

    private JPanel listPanel;
    private JTable tableProduct;

    public ListScreen() {
        this.add(listPanel);
        this.setTitle("List of Products");
        this.getContentPane();
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(800,600);
        this.setResizable(false);
        this.setLocationRelativeTo(null); // centered window

        ProductDAO pDAO = new ProductDAO();
        List<Product> products = pDAO.getProducts();

        DefaultTableModel model = new DefaultTableModel();
        tableProduct.setModel(model);
        tableProduct.setEnabled(false);
        model.addColumn("ID");
        model.addColumn("Name");
        model.addColumn("Type");
        model.addColumn("Brand");
        model.addColumn("Price");
        model.addColumn("Quantity");
        model.addColumn("Storage Size");
        model.addColumn("Screen Size");
        model.addColumn("Ram");
        model.addColumn("Battery Power");
        tableProduct.setAutoResizeMode(JTable.AUTO_RESIZE_SUBSEQUENT_COLUMNS);

        for (Product product : products) {

            String pid = String.valueOf(product.getProductId());
            String pName = product.getProductName();
            String pType = product.getType();
            String brand = product.getBrand();
            String price = String.valueOf(product.getPrice());
            String quantity = String.valueOf(product.getQuantity());
            String stSize = String.valueOf(product.getStorageSize());
            String scSize = String.valueOf(product.getScreenSize());
            String ram = String.valueOf(product.getRam());
            String bPower = String.valueOf(product.getBatteryPower());

            String[] p = new String[]{pid,pName,pType,brand,price,quantity,stSize,scSize,ram,bPower};
            model.addRow(p);


        }
    }
}
