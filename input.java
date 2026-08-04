// In Java, Scanner is used to take input from the user.
// Just like scanf is used in the C language, Scanner is used in Java.
// Java provides many ready-made classes, and Scanner is one of them.
// Scanner is stored inside the java.util package.
// Therefore, before using Scanner, we must import it so that Java knows we want to use the Scanner class.

import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);

        // Created an object of the Scanner class named Sc.
        // The 'new' keyword creates a new object in memory.
        // System.in means input will be taken from the keyboard.
        // Here, we are telling the Scanner where to read the input from.

        System.out.println("Enter your name");

        String name = Sc.nextLine();

        // Two things happen here:
        // 1. Sc.nextLine() reads a line of input from the keyboard.
        // 2. The input is stored in the variable 'name'.

        System.out.println("Welcome " + name);

        // The '+' operator is used to concatenate (join) strings.

        Sc.close();
    }
}
