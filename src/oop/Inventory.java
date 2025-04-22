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

    public void displayInventory(){
        for(Item item : items){
            System.out.println("The name of your item is: " + item.getName() +
                    ". The quantity of your item is: " + item.getQuantity());
        }
    }
}
