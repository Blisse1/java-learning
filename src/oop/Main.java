package oop;

public class Main {
    public static void main(String[] args){
        Inventory inventory = new Inventory();
        Item item = new Item("Apples", 20);
        Item item2 = new Item("Oranges", 12);
        Fruit fruit = new Fruit("Apple", 4, "Fuji");

        inventory.addItem(item);
        inventory.addItem(item2);
        inventory.addItem(fruit);

        inventory.displayInventory();
    }
}
