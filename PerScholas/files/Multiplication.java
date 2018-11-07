//Your Name:
//Today's Date:

/*
  Please comment above each line of code
  saying what you believe that line does.

  This includes any imports.
*/

import java.util.Scanner;

public class Multiplication {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter first number: ");

        int num1 = scan.nextInt();

        System.out.print("Enter second number: ");
        int num2 = scan.nextInt();

        scan.close();

        int product = num1*num2;

        System.out.println("Output: "+product);
    }
}
