package com.hi;

import java.util.*;

abstract class WarehouseItem { String name; WarehouseItem(String n){name=n;} }
class Electronics extends WarehouseItem { Electronics(){super("Electronics");} }
class Groceries extends WarehouseItem { Groceries(){super("Groceries");} }
class Furniture extends WarehouseItem { Furniture(){super("Furniture");} }

class Storage<T extends WarehouseItem> {
    private List<T> items = new ArrayList<>();
    public void addItem(T item){ items.add(item); }
    public List<T> getItems(){ return items; }
    public static void displayAll(List<? extends WarehouseItem> items){
        items.forEach(i -> System.out.println(i.name));
    }
}

public class Warehouse {
    public static void main(String[] args) {
        Storage<Electronics> electronicsStorage = new Storage<>();
        electronicsStorage.addItem(new Electronics());
        Storage.displayAll(electronicsStorage.getItems());
    }
}
