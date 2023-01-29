package com.dao;

import com.domain.Product;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProductDAO {

    public static final String url = "jdbc:mysql://localhost/storeinventory";
    public static final String username = "root";
    public static final String password = "1234";
    private Connection connection = null;
    private PreparedStatement ps = null;
    private ResultSet rset = null;

    public ProductDAO() {
        try {
            this.connection = DriverManager.getConnection(url, username, password);
            System.out.println("Connection established");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void insertProduct(Product product) {
        String insertQuery = "insert into products (productName, type, brand, price, quantity, storageSize, screenSize, ram, batteryPower) values (?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps = this.connection.prepareStatement(insertQuery);
            ps.setString(1, product.getProductName());
            ps.setString(2, product.getType());
            ps.setString(3, product.getBrand());
            ps.setDouble(4, product.getPrice());
            ps.setInt(5, product.getQuantity());
            ps.setInt(7, product.getStorageSize());
            ps.setDouble(6, product.getScreenSize());
            ps.setInt(8, product.getRam());
            ps.setInt(9, product.getBatteryPower());
            ps.executeUpdate();
            System.out.println("Product Added");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public List<Product> getProducts() {
        String selectAllQuery = "select * from storeinventory.products";
        List<Product> inventory = new ArrayList<Product>();
        try {
            PreparedStatement ps = this.connection.prepareStatement(selectAllQuery);
            ResultSet rset =ps.executeQuery();
            while (rset.next()) {
                Product product = new Product();
                product.setProductId(rset.getInt("productsID"));
                product.setProductName(rset.getString("productName"));
                product.setType(rset.getString("type"));
                product.setBrand( rset.getString("brand"));
                product.setPrice(rset.getDouble("price"));
                product.setQuantity(rset.getInt("quantity"));
                product.setStorageSize (rset.getInt("storageSize"));
                product.setScreenSize(rset.getInt("screenSize"));
                product.setRam(rset.getInt("ram"));
                product.setBatteryPower(rset.getInt("batteryPower"));
                inventory.add(product);
            }
            System.out.println("End of Table");
            for (Product product: inventory) {
                System.out.println(product.toString());
            }
        } catch (SQLException e) {
            e.printStackTrace();
            inventory = null;
        }
        return inventory;
    }



}
