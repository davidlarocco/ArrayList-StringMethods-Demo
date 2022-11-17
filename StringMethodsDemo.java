/* 

*/

import java.util.ArrayList;

public class StringMethodsDemo {
    public static void main(String[] args) {

        // String declarations
        String sentence = "The quick brown fox jumped over the lazy dog.";
        String greeting = "Hello, friend!";
        String word = "pizza";

        // .length() method
        System.out.println("The length of 'sentence' is " + sentence.length());
        System.out.println("The length of 'greeting' is " + greeting.length());
        System.out.println("The length of 'word' is " + word.length());
        System.out.println();

        // .indexOf() method
        System.out.println("The first occurence of ' ' is at index " + sentence.indexOf(' '));
        System.out.println("The first occurence of 'x' is at index " + greeting.indexOf('x')); // will be negative since it there is no occurence
        System.out.println("The first occurence of 'i' is at index " + word.indexOf('i'));
        System.out.println();

        // .charAt() method
        System.out.println("The first character of the string is " + sentence.charAt(0));
        System.out.println("The last character of the string is " + greeting.charAt(greeting.length() - 1)); // returns the last character of the String
        System.out.println();

        // .equals() and .equalsIgnoreCase() methods
        System.out.println("Does '" + sentence + "' equal '" + greeting + "'? : " + sentence.equals(greeting));
        System.out.println("Does '" + word + "' equal 'pizza'? : " + word.equals("pizza"));
        System.out.println();
        System.out.println("Does '" + word + "' equal 'PiZzA'? : " + word.equals("PiZzA"));
        System.out.println("What if we ignore cases? '" + word + "== 'PiZzA' is " + word.equalsIgnoreCase("PiZzA"));
        System.out.println();

        // .substring() method
        int start = 7;
        int end = greeting.length() - 1;
        String strSection = greeting.substring(start);
        System.out.println("A portion of the 'greeting' string: " + strSection);

        // the second parameter takes substring up to, but not including, the specified index
        strSection = greeting.substring(start, end);
        System.out.println("Let's get rid of that pesky '!': " + strSection);
        System.out.println();

        // .toUpperCase() and .toLowerCase() methods
        System.out.println("Let's make '" + word + "' all caps!: " + word.toUpperCase());
        System.out.println("Or 'greeting' all lower case: " + greeting.toLowerCase());

        // to make individual characters all lower or upper case, use static methods of the Character class
        char letter = greeting.charAt(0); 
        System.out.println("The letter '" + letter + "' is now lower case: '" + Character.toLowerCase(letter) + "'");
        System.out.println();

        // .replace() method
        String partNumber = "BK 761 98";
        System.out.println("Part Number: " + partNumber);
        partNumber = partNumber.replace(' ', '-'); 
        System.out.println("Change ' ' to '-' : " + partNumber);   
        System.out.println();

        // Let's combine what we've learned
        ArrayList<Character> firstLetters = new ArrayList<>();
        // iterate through each character of the string with a for loop
        for(int i = 0; i < sentence.length(); i++) {
            // if i is the first character of the string, or if the previous character is a space
            if(i == 0 || sentence.charAt(i - 1) == ' ')
                // add that character to the ArrayList and make it lower case
                firstLetters.add(Character.toLowerCase(sentence.charAt(i)));
        } 
        System.out.print("The first letters of all the words in the 'sentence' string are:\n\t");
        // use a for loop to iterate each element of the ArrayList
        for(char ch : firstLetters) {
            System.out.print(ch + ", ");
        }
        System.out.println();
    }

}
