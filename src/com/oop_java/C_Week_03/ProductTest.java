package com.oop_java.C_Week_03;

import com.oop_java.C_Week02.Date;

public class ProductTest {
    public static Product productList[]=new Product[100];

    public static void main(String[] args) {

        productList[0]=new Product("Keyboard",500,new Date(1,1,2022));
        productList[0].setDescription("Long text description");
        productList[1]=new Product("Keyboard",500,new Date(1,1,2022));
        productList[1].setDescription("Long text description");
        productList[2]=new Product("Keyboard",500,new Date(1,1,2022));
        productList[2].setDescription("Long text description");

        System.out.println(productList[0].productCounter);
        System.out.println(productList[1].productCounter);

        if(productList[0].equals(productList[1]))
            System.out.println("Products are equal");
        else
            System.out.println("Products are not equal");

    }
}
