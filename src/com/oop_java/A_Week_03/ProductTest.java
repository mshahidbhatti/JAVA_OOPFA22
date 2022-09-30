package com.oop_java.A_Week_03;

import com.oop_java.C_Week02.Date;

public class ProductTest {
    static Product[] productList=new Product[100];

    public static void main(String[] args) {
        productList[0]=new Product("Keyboard",30,new Date(1,1,2022));
        productList[0].setQuantity(5);
        productList[1]=new Product("Ram",30,new Date(1,1,2022));

        productList[2]=new Product("Pen",30,new Date(1,1,2022));

        productList[3]=new Product("Laptop",30000,new Date(1,1,2022));


        System.out.println(productList[0]);

        boolean b=productList[2].equals(productList[3]);

        int x=productList[2].compareTo(productList[3]);
        System.out.println();
        System.out.println(x);

        /// print products
        printProducts(productList);



    }

    public static void printProducts(Product []list){
        System.out.println("ID Name Price Man. Date Quantity");
        System.out.println("=========================");
        for(int i=0;i<list.length;i++)
            if(list[i]!=null)
            System.out.println(list[i]);
        System.out.println("=========================");
    }

}
