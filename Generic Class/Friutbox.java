package com.hi;

class Fruit { String name; Fruit(String n){name=n;} }
class Apple extends Fruit { Apple(){super("Apple");} }
class Mango extends Fruit { Mango(){super("Mango");} }

class FruitBox<T extends Fruit> {
    private java.util.List<T> fruits = new java.util.ArrayList<>();
    public void addFruit(T fruit){ fruits.add(fruit); }
    public void displayFruits(){ fruits.forEach(f -> System.out.println(f.name)); }
}

public class Friutbox {
    public static void main(String[] args) {
        FruitBox<Fruit> box = new FruitBox<>();
        box.addFruit(new Apple());
        box.addFruit(new Mango());
        box.displayFruits();
    }
}
