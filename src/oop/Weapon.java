package oop;

// Inheritance
public class Weapon extends Item {

    // Encapsulation
    private int damage;
    private String type;

    // constructor
    public Weapon(String name, int quantity, int damage, String type) {
        super(name, quantity);
        this.damage = damage;
        this.type = type;
    }

    public int getDamage(){
        return damage;
    }

    public String getType(){
        return type;
    }

    //@Override
    //public String toString(){
        //return "Weapon: " + getName() + ", Quantity: " + getQuantity() + ", Damage: " + getDamage() +
                //", Type: " + getType();
    //}

    @Override
    public String displayInfo(){
        return ("Weapon: " + getName() + ", Quantity: " + getQuantity() + ", Damage: " + getDamage() +
                ", Type: " + getType());
    }
}
