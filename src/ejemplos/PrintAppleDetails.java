package ejemplos;

public class PrintAppleDetails{
    public static void main(String args[]){
        Chapter5 c5 = new Chapter5();
        System.out.println("Apple a1: ");
        c5.printDetails();
        c5.mass = 10.0f;
        c5.x = 20;
        c5.y = 42;
        System.out.println("Updated a1:");
        c5.printDetails();
    }
}
