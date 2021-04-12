package com.thien;

public class Dog extends Animal{
    public Dog(String name) {
        super(name);
    }
    @Override
    public void greeting() {
        System.out.println("Woof");
    }
    public void greeting(Dog another) {
        System.out.println("Woooooof");
    }
}
