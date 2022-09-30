package com.oop_java.A_Week_03;
import com.oop_java.C_Week02.Date;

public class Product {
    private String productID;
    private String name;

    private double price;
    private int quantity;
    private Date manafacturingDate;
    private static int productCounter=1;

    public Product(String name, double price, Date manafacturingDate){
        this.productID=" ";

        this.productID=this.productID+" "+String.format("%4d",productCounter++);
        //this.productID="0001";
        this.name=name;
        this.price=price;
        this.manafacturingDate=manafacturingDate;
        this.quantity=0;

    }

    public String getProductID() {
        return productID;
    }

    public void setProductID(String productID) {
        this.productID = productID;
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

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Date getManafacturingDate() {
        return manafacturingDate;
    }

    public void setManafacturingDate(Date manafacturingDate) {
        this.manafacturingDate = manafacturingDate;
    }

    public boolean equals(Object other){
        //downcast

        Product temp=(Product) other;

        return this.productID==temp.productID;
    }

    public int compareTo(Product other){
        int compared=-100;
        if(this.price==other.price)
            compared=0;
        if(this.price<other.price)
            compared=-1;
        if(this.price>other.price)
            compared=1;

        return compared;
    }


    public String toString(){

        return String.format("%s %s %f %d %s",
                this.productID,this.name,this.price,
                this.quantity,this.manafacturingDate);
    }

}
