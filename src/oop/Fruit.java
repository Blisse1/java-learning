package oop;

// Inheritance

/*public class Fruit extends Item{
    private final String type;

    public Fruit(String name, int quantity, String type){
        super(name, quantity); // from the super class
        // assigning values being passed in as parameters from the Item class
        this.type = type;
    }

    public String getType(){
        return type;
    }

    //@Override
    //public String toString(){
        //return "Item: " + getName() + ", Quantity: " + getQuantity() + ", Type: " + getType();
    //}
}*/

// Using an interface
public class Fruit implements ItemStuff{
    private String name;
    private int quantity;
    private String type;

    public Fruit(String name, int quantity, String type){
        //super(name, quantity); when we're not inheriting we
        // have to declare it the old-fashioned way
        this.name = name;
        this.quantity = quantity;
        // assigning values being passed in as parameters from the Item class
        this.type = type;
    }

    public String getType(){
        return type;
    }

    @Override
    public String getName(){
        return name;
    }

    @Override
    public int getQuantity(){
        return quantity;
    }

    @Override
    public void displayInfo(){
        System.out.println("Fruit: " + getName() + ", Quantity: " + getQuantity() + ", Type: " + type);
    }
}