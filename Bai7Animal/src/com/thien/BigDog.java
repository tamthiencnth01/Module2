package com.thien;

public class BigDog extends Dog{
    public BigDog(String name) {
        super(name);
    }
    @Override
    public void greeting(){
        System.out.println("Wooow");
    }
    public void greeting(Dog another){
        System.out.println("Wooooooow");
    }
    public void greeting(BigDog another){
        System.out.println("Wooooooooooooooow");
    }
}
