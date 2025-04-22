package oop;

// Inheritance
public class Fruit extends Item{
    private final String type;

    public Fruit(String name, int quantity, String type){
        super(name, quantity); // from the super class
        // assigning values being passed in as parameters from the Item class
        this.type = type;
    }

    public String getType(){
        return type;
    }
}
