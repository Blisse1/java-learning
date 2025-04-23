package oop;

import java.util.ArrayList; // to manage groups of objects

public class Inventory {
    private ArrayList<Item> items = new ArrayList<>(); // declaring the arrayList

    // constructor
    public Inventory(){
        items = new ArrayList<>();
    }

    public void addItem(Item item){ // passing a parameter of type Item
        items.add(item);
    }

    //public void addItem(String name, int quantity, String type){
        //items.add(new Item(name, quantity, type));
    //}

    public void addItem(String name, int quantity, int damage, String type){
        items.add(new Weapon(name, quantity, damage, type));
    }

    public void displayInventory(){
        for(Item item : items){
            item.displayInfo();
        }
    }
}
