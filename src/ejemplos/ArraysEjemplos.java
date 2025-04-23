package ejemplos;

public class ArraysEjemplos {
    // Enhanced arrays
    public static void main(String[] args){
        int [] arrayOfInts = {2, 3, 4};
        String greeting = "Hello";

        for (int i: arrayOfInts)
            System.out.println(i);

        for(int i = 0; i < greeting.length(); i++){
            System.out.println(greeting.charAt(i));
        }

        instanceOf();
    }

    public static void instanceOf(){
        Boolean b;

        String [] asd = new String[4];
        asd[0] = "asd";

        System.out.println(asd[0]);

        String str = "foo";
        b = (str instanceof String);
        System.out.println(b);
        b = (str instanceof Object);
        System.out.println(b);

    }
}
