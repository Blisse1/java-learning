package oop;

// Interface are common methods all items must implement
// everything in an interface is assumed to be abstract
// and that methods must be overwritten

public interface ItemStuff {
    String getName();
    int getQuantity();
    void displayInfo();
}
