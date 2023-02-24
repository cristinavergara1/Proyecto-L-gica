package com.mycompany.inventory;

public class Product {
//Instance field declarations

    private String name;
    private float price;
    private int qty;
    private String number;

    //Este es el inicializador de los valores de la clase
    public Product() {
        name = "Calculadora";
        price = 40000;
        qty = 15;
        number = "1123";

    }

    public Product(String name, float price, int qty, String number) {
        this.name = name;
        this.price = price;
        this.qty = qty;
        this.number = number;
    }

    //Permite obtener el nombre del Product 
    public String getName() {
        return name;
    }

    //Permite modificar el nombre del Product
    public void setName(String name) {
        this.name = name;
    }

    //Permite obtener el precio del Product 
    public float getPrice() {
        return price;
    }

    //Permite modificar el precio del Product
    public void setPrice(float price) {
        this.price = price;
    }

    //Permite obtener la cantidad de unidades del Product 
    public int getQty() {
        return qty;
    }

    //Permite modificar la cantidad de unidades del Product
    public void setQty(int qty) {
        this.qty = qty;
    }

    //Permite obtener la referencia del Product 
    public String getNumber() {
        return number;
    }

    //Permite modificar la referencia del Product
    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Item number: " + number + "\n"
                + "Name:  " + name + "\n" 
                + "Quantity in stock: " + qty + "\n" 
                + "Price: " + price;
    }

}
