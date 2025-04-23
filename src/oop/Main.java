package oop;

public class Main {
    public static void main(String[] args){
        Inventory inventory = new Inventory();
        //Item item = new Item("Apples", 20);
        //Item item2 = new Item("Oranges", 12);
        //Fruit fruit = new Fruit("Apple", 4, "Fuji");
        //Weapon weapon = new Weapon("Sword", 2, 14, "Thunder");

        //inventory.addItem(item);
        //inventory.addItem(item2);
        inventory.addItem("Sword", 2, 14, "Thunder");
        //inventory.addItem("Apple", 4, "Fuji");

        inventory.displayInventory();
    }
}
