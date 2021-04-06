package com.tamthien;
public class Product {
    private String product;
    private int price;
    private static String store;

    public Product(String p, int pr) {
        product = p;
        price = pr;
    }
    static void change(){
        store = "TAMTHIEN";
    }
    void display(){
        System.out.println(product + " " + price + " " + store);
    }
}
