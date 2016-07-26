/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shriya.ProductList;

import com.shriya.ProductList.util.EnterRecords;
import java.util.Scanner;

/**
 *
 * @author shneha
 */
public class program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);
         
        String[] Products = new String[5];
        double[] Price = new double[Products.length];
        boolean[] Status = new boolean[Products.length];
        int[] Quantity = new int[Products.length];

        EnterRecords EnterRecords = new EnterRecords(input,Products, Price, Status, Quantity);
 while (true) {
 

            System.out.println("1. Enter Product name: ");
            System.out.println("2. Enter Price: ");
           
            System.out.println("3. Enter quantity ");
             System.out.println("4. Status: ");
            System.out.println("5. Exit");

            System.out.print("Enter your choice[1-5]: ");
            
            int choice = input.nextInt();

            switch (choice) {
                case 1:
                    EnterRecords.enterProduct();
                    break;
                case 2:
                    EnterRecords.enterPrice();
                    break;
                case 3:
                    EnterRecords.enterQuantity();
                    break;
                case 4:
                    EnterRecords.productStatus();
                   
                    break;
                case 5:
                    System.exit(0);
                    break;

          
            }
            
            
           
        }
 
 

    }
    }
