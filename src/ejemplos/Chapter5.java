package ejemplos;

public class Chapter5 {
    public static double mass = 11.2;
    // this variable being static means that its associated with the class
    // and not with an individual instance. And if we change its value
    // it changes for all Chapter 5 objects

    // no access modifier defined means that its default
    // and only can be accessed from the classes of the same package
    // we need to mark it as static if we want to use it outside this scope
    float diameter = 1.0f;
    int x, y;

    public void printDetails(){
        System.out.println(" mass: " + mass);
        System.out.println(" diameter: " + diameter);
        System.out.println(" position: (" + x + ", " + y + ")");
    }

//    boolean isTouching(Chapter5 other){
//
//    }
}
