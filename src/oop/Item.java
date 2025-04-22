package oop;

// it can be converted to a record class

// In Java, a record is a special type of class introduced in Java 14 that acts as a data carrier.
// Records are useful for creating data transfer objects (DTOs) or plain old Java objects (POJOs).
// Records automatically generate essential methods like constructors, equals(), hashCode(), and toString(), reducing boilerplate code

// This is a data-carrier class
public class Item {
    // not assigned a value because each time it is going to be different
    private final String name;
    private final int quantity; // final means that it cant be modified or extended

    // constructor in order to actually create objects
    public Item(String name, int quantity){
        this.name = name;
        this.quantity = quantity;
    }

    public String getName(){
        return name;
    }

    public int getQuantity(){
        return quantity;
    }
}
