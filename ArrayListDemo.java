
// import statement to use ArrayList class
import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {

        // Calling the ArrayList constructor
        ArrayList<String> strArray = new ArrayList<String>(); // initial capacity is 10 by default
        ArrayList<Double> dblArray = new ArrayList<>(); // diamond operator <> is a shortcut
        ArrayList<Integer> intArray = new ArrayList<>(7); // specify an initial size of 7

        // .add() method

            // string array
            strArray.add("red");
            strArray.add("orange");
            strArray.add("yellow");
            strArray.add("green");
            strArray.add("blue");
            strArray.add("indigo");
            strArray.add("violet");

            // integer array using fibonacci method and for loop
            int numOfElements = 8;
            for(int i = 0; i < numOfElements; i++) {
                intArray.add(fibonacci(i));
            }

            // double array using while loop
            int count = 0;
            while(count < 10) {
                dblArray.add(3.14);
                count++;
            }

            // Print to console
            System.out.println("The String Array: " + strArray);
            System.out.println("The Integer Array: " + intArray);
            System.out.println("The Double Array: " + dblArray);
            System.out.println();
        
        // .size() method
        System.out.println("strArray size: " + strArray.size());
        System.out.println("intArray size: " + intArray.size());
        System.out.println("dblArray size: " + dblArray.size());
        System.out.println();
        
        // .remove() method
        strArray.remove(1);
        System.out.println("In a world where there is no orange: " + strArray);
        
        for(int i = dblArray.size() / 2; i >= 0; i--) {
            dblArray.remove(i);
        }
        System.out.println("And values are cut in half: " + dblArray);
        
        intArray.remove(0);
        System.out.println("And everything starts from one: " + intArray);
        System.out.println();

        // .set() method
        intArray.set(0, 0);
        System.out.println("Start from zero again: " + intArray);
        
        strArray.set(5, "purple");
        System.out.println("Changed violet to purple: " + strArray);
        
        for(int i = 0; i < dblArray.size(); i++) {
            dblArray.set(i, i + 1.0);
        }
        System.out.println("Doubles array starting from 1.0: " + dblArray);
        System.out.println();

        // .get() method
        String color = strArray.get(strArray.size() - 2);
        System.out.println("The best color: " + color);
        
        int number = intArray.get(intArray.size() - 1);
        System.out.println("Lucky number: " + number);
        
        double amount = dblArray.get(2);
        System.out.println("Two outta three ain't bad: " + amount);
        System.out.println();
        
    }
    // method to calculate fibonacci number by index specified
    public static int fibonacci(int num) {
        if(num == 0 || num == 1)
            return num;
        else 
            return fibonacci(num - 1) + fibonacci(num - 2); 
    }
}
