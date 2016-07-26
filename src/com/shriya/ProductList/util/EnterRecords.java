/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shriya.ProductList.util;

import java.util.Scanner;

/**
 *
 * @author shneha
 */
public class EnterRecords {

    Scanner input;
    String[] Products;
    double[] Price;
    boolean[] Status;
    int[] Quantity;
    int pc=0;
    int counter = 0;
    int c,i;
    String sp="";
    boolean found = false;

    public EnterRecords(Scanner input,String[] Products,double[] Price, boolean[] Status, int[] Quantity) {
        this.input = input;

        this.Products = Products;
        this.Price = Price;
        this.Status = Status;
        this.Quantity = Quantity;

    }

    public void enterProduct() {
    if(pc<5) {
       
            System.out.println("Enter the Product name: ");
            Products[pc] = input.next();
    
          counter=pc;
            }
    else{
         System.out.println("Maximum limit is 5");

    }
    }

    public void enterPrice() {
      
        System.out.print("Enter price for " + Products[counter] + ":");
        Price[counter] = input.nextDouble();
    }
    

    public void enterQuantity() {
        
        System.out.print("Enter price for " + Products[counter] + ":");
       Quantity[counter]=input.nextInt();
        
}

    public void productStatus() {
        System.out.println("Enter the Product name :");
        String sp = input.next();
         for ( i=0;i<Products.length;i++) {
            if (Products[pc].equalsIgnoreCase(sp)) {
                found = true;
                c = i;

            }
         }
            if (found == true) {
                System.out.println("Product Found !!");
                System.out.println("name:" + Products[c]);
                System.out.println("Price:" + Price[c]);
                System.out.println("Quantity:" + Quantity[c]);

            } else {
                System.out.println("Product not Entered");
            }
       
    }
}
