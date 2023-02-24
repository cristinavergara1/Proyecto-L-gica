/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.inventory;

/**
 *
 * @author pauli
 */
public class ProductTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Product productOne = new Product();
        
        Product productTwo = new Product();
        productTwo.setName("Cajas lapiceros x12");
        productTwo.setPrice(40000);
        productTwo.setQty(260);
        productTwo.setNumber("9528");
        
        Product productThree = new Product("Grapadoras", 15000, 70, "1301");
        Product productFour = new Product("Folders", 27000, 50, "2508");
        Product productFive = new Product("Portalapices", 11900, 125, "0180");
        Product productSix = new Product("Licencia Windows Pro", 55999, 8, "101333");

        System.out.println(productOne + "\n");
        System.out.println(productTwo + "\n");
        System.out.println(productThree + "\n");
        System.out.println(productFour + "\n");
        System.out.println(productFive + "\n");
        System.out.println(productSix);
    }

}
