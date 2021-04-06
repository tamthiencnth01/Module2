package com.tamthien;
public class TestProduct {
    public static void main(String[] args) {
        com.tamthien.Product.change();
        com.tamthien.Product s1 = new com.tamthien.Product("Main", 1600000);
        com.tamthien.Product s2 = new com.tamthien.Product("Chip", 2100000);
        com.tamthien.Product s3 = new com.tamthien.Product("Ram", 1800000);
        s1.display();
        s2.display();
        s3.display();

    }
}
