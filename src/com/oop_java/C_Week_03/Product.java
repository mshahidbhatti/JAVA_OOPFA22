package com.oop_java.C_Week_03;

import com.oop_java.C_Week02.*;

public class Product {
    private String productID;
    private String name;
    private double price;
    private Date manfacturingDate;
    private int quantity;
    private String description;
    static int productCounter=1;

    public boolean equals(Object other){
        Product otherProduct=(Product)other;
        return this.productID.equalsIgnoreCase(otherProduct.productID);
    }
    public Object clone(){
        Product temp=new Product(this.name,this.price,new Date(this.manfacturingDate.getDay(),this.manfacturingDate.getMonth(),this.manfacturingDate.getYear()),this.quantity,this.description);

        return temp;
    }

    public Product(String name, double price, Date manfacturingDate, int quantity, String description) {
        productCounter++;
        this.productID = "0001";
        this.name = name;
        this.price = price;
        this.manfacturingDate = manfacturingDate;
        this.quantity = quantity;
        this.description = description;
    }

    public Product(String name, double price, Date manfacturingDate) {
        productCounter++;
        this.name = name;
        this.price = price;
        this.manfacturingDate = manfacturingDate;
    }

    public Product(String name) {
        productCounter++;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Date getManfacturingDate() {
        return manfacturingDate;
    }

    public void setManfacturingDate(Date manfacturingDate) {
        this.manfacturingDate = manfacturingDate;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productID='" + productID + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", manfacturingDate=" + manfacturingDate +
                ", quantity=" + quantity +
                ", description='" + description + '\'' +
                '}';
    }


}
