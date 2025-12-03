package com.hi;

import java.util.*;

class Cart<T> {
    private List<T> items = new ArrayList<>();
    public void addItem(T item){ items.add(item); }
    public void removeItem(T item){ items.remove(item); }
    public void displayItems(){ items.forEach(System.out::println); }
}

public class cartbox {
    public static void main(String[] args) {
        Cart<String> electronicsCart = new Cart<>();
        electronicsCart.addItem("Laptop");
        electronicsCart.addItem("Phone");
        electronicsCart.displayItems();

        Cart<String> clothesCart = new Cart<>();
        clothesCart.addItem("Shirt");
        clothesCart.addItem("Jeans");
        clothesCart.displayItems();
    }
}

