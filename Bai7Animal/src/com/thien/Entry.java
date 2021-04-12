package com.thien;

public class Entry {
    public static void main(String[] args) {
        // Using the subclasses
        Cat cat1 = new Cat("KaLi");
        cat1.greeting();
        Dog dog1 = new Dog("KaLu");
        dog1.greeting();
        BigDog bigDog1 = new BigDog("Bull");
        bigDog1.greeting();

        // Using Polymorphism
//        Animal animal1 = new Cat("Kalista");
//        animal1.greeting();
//        Animal animal2 = new Dog("Treizi");
//        animal2.greeting();
//        Animal animal3 = new BigDog("Bluto");
//        animal3.greeting();

//        // Downcast
        Dog dog2 = new Dog("Kaluuu");
        dog1.greeting(dog2);
        BigDog bigDog2 = new BigDog("Henry");
        bigDog1.greeting(dog2);
        dog2.greeting(bigDog2);
    }
}
