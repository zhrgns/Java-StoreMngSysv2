package com.domain;

public class Product {

    private String productName;
    private String type;
    private String brand;
    private double price;
    private int productId, quantity, storageSize;
    private double screenSize;
    private int ram, batteryPower;

    public Product() {
    }

    public Product(String productName, String type, String brand, double price, int quantity, int storageSize, double screenSize, int ram, int batteryPower) {
        this.productName=productName;
        this.type = type;
        this.brand = brand;
        this.price = price;
        this.quantity = quantity;
        this.storageSize = storageSize;
        this.screenSize = screenSize;
        this.ram = ram;
        this.batteryPower = batteryPower;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getStorageSize() {
        return storageSize;
    }

    public void setStorageSize(int storageSize) {
        this.storageSize = storageSize;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getBatteryPower() {
        return batteryPower;
    }

    public void setBatteryPower(int batteryPower) {
        this.batteryPower = batteryPower;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productName='" + productName + '\'' +
                ", type='" + type + '\'' +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                ", productId=" + productId +
                ", quantity=" + quantity +
                ", storageSize=" + storageSize +
                ", screenSize=" + screenSize +
                ", ram=" + ram +
                ", batteryPower=" + batteryPower +
                '}';
    }
}
