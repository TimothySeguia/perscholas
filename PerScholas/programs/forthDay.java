import java.util.*;

public class forthDay {
    public static Scanner input = new Scanner(System.in);
    public static void print(String input) {
        System.out.print(input);
    }
    public static void newLine(){
        System.out.print("\n");
    }
    public static void weekday(int day){
        if (day == 1){
            print("Weekday 1 is Monday!");
            newLine();
        }
        else if (day == 2){
            print("Weekday 2 is Tuesday!");
            newLine();
        }
        else if (day == 3){
            print("Weekday 3 is Wednesday!");
            newLine();
        }
        else if (day == 4){
            print("Weekday 4 is Thursday!");
            newLine();
        }
        else if (day == 5){
            print("Weekday 5 is Friday!");
            newLine();
        }
        else if (day == 6){
            print("Weekday 6 is Saturday!");
            newLine();
        }
        else if (day == 7){
            print("Weekday 7 is Sunday!");
            newLine();
        }
        else {
            print("Enter a number (1 - 7)");
        }
    }
    public static Integer intCheck(String prompt){
        Scanner inputScanner = new Scanner(System.in);
        int integer = 0;
        boolean flag = true;
        while (flag == true){
            try {
                print(prompt);
                integer = Integer.parseInt(inputScanner.nextLine());
                flag = false;
            }
            catch (Exception e){
                print("Enter a number please.\n");
            }
        }
        return integer;

    }
    public static void main(String[] args){

//        1. What if...
//
//        Create three integers: [people], [cats] and [dogs].
//
//                Set these variable to whatever you see fit.
//
//                Change the following arguments into code:
//        If there are less people than cats, then print "Too many cats! The world is doomed!"
//        If there are more people than cats, then print "Too few cats! The world is saved for another day!"
//
//        If there are less people than dogs, then print "The world is drooled on!"
//        If there are more people than dogs, then print "The world is dry!"
//
//        WHAT YOU SHOULD DO
//
//        1. Comment above each if statement, saying what you think the purpose of that code is
//        2. Change your values so that your output is completely different than what you first saw
//        3. Change your values so that no output is given.
        int people = 16, cats = 16, dogs = 16;
        if (people < cats){
            System.out.println("There are too many cats!");
        }
        if (people > cats){
            System.out.println("Too few cats! The world is saved for another day!");
        }
        if (people < dogs){
            System.out.println("The world is drooled on!");
        }
        if (people > dogs){
            System.out.println("The world is dry!");
        }
        System.out.println();

//        2. Legal problems
//
//        Make a program which displays a different message depending on the age given.
//
//                Here are the possible responses:
//        age is less than 16, say "You can't drive."
//        age is less than 18, say "You can't vote."
//        age is less than 25, say "You can't rent a car."
//        age is 25 or over, say "You can do anything that's legal."
//
//        Your output could be the following:
//        Hey, what's your name?
//         >Mike
//        Ok, Mike, how old are you?
//         >17
//        You can't vote, Mike.
//        You can't rent a car, Mike.
        int age = 0;
        String name = " ";
        System.out.print("Hey, what's your name?: \n > ");
        name = input.nextLine();
        System.out.printf("OK, %s, how old are you?: \n > ", name);
        age = Integer.parseInt(input.nextLine());
        if (age < 16){
            System.out.printf("You can't drive, %s.\n", name);
        }
        if (age < 18){
            System.out.printf("You can't vote, %s.\n", name);
        }
        if (age < 25){
            System.out.printf("You can't rent a car, %s.\n", name);
        }
        if (age >= 25){
            System.out.printf("You can do anything that's legal, %s.\n", name);
        }
        newLine();

//        3. Cars or Buses
//
//        Create three integers named [people], [cars], and [buses].
//
//                Change the following arguments into code:
//        If there are more cars than people, then print "We should take the cars"
//        Else If there are less cars than people, then print "We should not take the cars."
//        Else, print "We can't decide."
//
//        If there are more buses than cars, then print "That's too many buses."
//        Else If there are less buses than cars, then print "Maybe we should take the buses."
//        Else, print "We still can't decide."
//
//        If there are more people than buses, then print "Alright, let's just take the buses"
//        Else, print "Let's just take the cars."
//
//        WHAT YOU SHOULD DO ON YOUR OWN
//        1. What do you think else if and else are doing? Answer in a comment.
//        2. Remove the else from one of your else if statements. What differences does that make? Why?
        int cars = 0, buses = 0;
        people = 0;

        if (cars > people){
            print("We should take the cars.");
            newLine();
        }
        else if (cars < people){
            print("We should not take the cars.");
            newLine();
        }
        else {
            print("We can't decide.");
            newLine();
        }

        if (buses > cars) {
            print("That's too many buses.");
            newLine();
        }
        else if (buses < cars) {
            print("Maybe we should take the buses.");
            newLine();
        }
        else {
            print("We still can't decide.");
            newLine();
        }

        if (people > buses){
            print("Let's just take the buses.");
            newLine();
        }
        else {
            print("Let's just take the cars.");
            newLine();
        }
        newLine();

//        4. Specific legal problems
//
//        Make a program which displays a different message depending on the age given.
//
//                Here are the possible responses:
//        age is less than 16, say "You can't drive."
//        age is less than 18, say "You can't vote."
//        age is less than 25, say "You can't rent a car."
//        age is 25 or over, say "You can do anything that's legal."
//
//        NOTE: Unlike the original legal problems, this program must ONLY display exactly ONE message based on age.
        System.out.printf("How old are you?: \n > ", name);
        age = Integer.parseInt(input.nextLine());
        if (age < 16){
            System.out.printf("You can't drive, %s.\n", name);
        }
        else if (age < 18){
            System.out.printf("You can't vote, %s.\n", name);
        }
        else if (age < 25){
            System.out.printf("You can't rent a car, %s.\n", name);
        }
        else if (age >= 25){
            System.out.printf("You can do anything that's legal, %s.\n", name);
        }
        newLine();

//        5. Day of the week
//
//        Create a method that accepts an integer and returns a string with the corresponding day of the week.
//
//        1 -> Monday
//        2 -> Tuesday
//        3 -> Wednesday
//        4 -> Thursday
//        5 -> Friday
//        6 -> Saturday
//        7 -> Sunday
//        Anything Else -> Error
//          /Users/seguia.timothy/eclipse-workspace/DayFour/src/forthDay.java
//        Create a main that prompts the user to enter a number between 1-7, passes that number to
//        your method in order to get the weekday, and then outputs that weekday.
//
//        Your output could be the following:
//        Please enter an integer (1-7):
//          >2
//
//        Weekday 2 is Tuesday!
        int num = 0;
        System.out.printf("Please enter an integer (1 - 7): \n > ");
        num = Integer.parseInt(input.nextLine());

        switch(num){
            case 1:
                weekday(num);
                break;
            case 2:
                weekday(num);
                break;
            case 3:
                weekday(num);
                break;
            case 4:
                weekday(num);
                break;
            case 5:
                weekday(num);
                break;
            case 6:
                weekday(num);
                break;
            case 7:
                weekday(num);
                break;
            default:
                print("Input a number: (1 - 7)\n");
        }
        newLine();

        // 6. Space Weight
        double weight = 0;
        int planet = 0;
        print("Please enter your current earth weight: \n >");
        weight = Double.parseDouble(input.nextLine());
        System.out.print("I have information for the following planets: \n" +
                "1. Venus\n" +
                "2. Mars\n" +
                "3. Jupiter\n" +
                "4. Saturn\n" +
                "5. Uranus\n" +
                "6. Neptune\n" +
                "Which planet are you visiting?\n >");
        planet = Integer.parseInt(input.nextLine());

        switch(planet) {
            case 1:
                System.out.printf("Your weight would be %.2f pounds on this planet.\n", .78 * weight);
                break;
            case 2:
                System.out.printf("Your weight would be %.2f pounds on this planet.\n", .39 * weight);
                break;
            case 3:
                System.out.printf("Your weight would be %.2f pounds on this planet.\n", 2.65 * weight);
                break;
            case 4:
                System.out.printf("Your weight would be %.2f pounds on this planet.\n", 1.17 * weight);
                break;
            case 5:
                System.out.printf("Your weight would be %.2f pounds on this planet.\n", 1.05 * weight);
                break;
            case 6:
                System.out.printf("Your weight would be %.2f pounds on this planet.\n", 1.23 * weight);
                break;
            default:
                print("Input a number: (1 - 6)\n");

        }


        // Conditionals II

        // 7. Positive or negative?
        /*
        int inputNumber = 0;
        print("Input Number: ");
        inputNumber = Integer.parseInt(input.nextLine());
        if (inputNumber < 0) {
            print("Number is negative.\n");
        }
        else {
            print("Number is positive.\n");
        }
        */

        // 8. Take three numbers from the user and print the greatest number.
        /*
        double numOne = 0;
        double numTwo = 0;
        double numThree = 0;

        print("Input the first number: ");
        numOne = Double.parseDouble(input.nextLine());
        print("Input the second number: ");
        numTwo = Double.parseDouble(input.nextLine());
        print("Input the third number: ");
        numThree = Double.parseDouble(input.nextLine());

        if (numOne > numTwo && numOne > numThree){
            System.out.printf("The greatest: %.2f", numOne);
        }
        else if (numTwo > numOne && numTwo > numThree){
            System.out.printf("The greatest: %.2f", numTwo);
        }
        else {
            System.out.printf("The greatest: %.2f", numThree);
        }
        */

        // 9. positive or negative with decimals
        /*
        double inputDouble = 0;
        print("Input Value: \n > ");
        inputDouble = Double.parseDouble(input.nextLine());
        if (inputDouble < 0) {
            print("Negative Number\n");
        }
        else if (inputDouble == 0){
            print("0\n");
        }
        else {
            print("Positive Number\n");
        }
        */

        // 10. Write a Java program that takes the user to provide a single character
        /*
        //String help = "e";
        //System.out.println(help.length());
        String userLetter = " ";
        print("Input an alphabet: ");
        userLetter = input.nextLine();

        if (Character.isDigit(userLetter.charAt(0))){
            print("NO NUMBERS ALLOWED!!!\n");
        }
        else if(userLetter.length() > 1){
            System.out.println("Cannot use more than one character!\n");
        }
        else {
            Character.toLowerCase(userLetter.charAt(0));
            if (userLetter.charAt(0) == 'a' || userLetter.charAt(0) == 'e' || userLetter.charAt(0) == 'i' || userLetter.charAt(0) == 'o' || userLetter.charAt(0) == 'u'){
                print("Input letter is Vowel\n");
            }
            else {
                print("Input letter is Consonant.\n");
            }
        }
        */

        // 11. Name that shape

        int sides;
        boolean flag = false;
        print("Input a number of sides: ");
        while (flag == false) {
            try {
                sides = Integer.parseInt(input.nextLine());
                if ( sides == 3 ){
                    print("Triangle\n");
                }
                else if ( sides == 4){
                    print("Quadrilateral\n");
                }
                else if (sides == 5) {
                    print("Pentagon\n");
                }
                else if (sides == 6){
                    print("Hexagon\n");
                }
                else if (sides == 7) {
                    print("Heptagon\n");
                }
                else if (sides == 8) {
                    print("Octagon\n");
                }
                else if (sides == 8) {
                    print("Nonagon\n");
                }
                else if (sides == 10) {
                    print("Decagon\n");
                }
                else {
                    throw new Exception();
                }
                /*
                switch (sides) {
                    case 3:
                        print("Triangle\n");
                        break;
                    case 4:
                        print("Quadrilateral\n");
                        break;
                    case 5:
                        print("Pentagon\n");
                        break;
                    case 6:
                        print("Hexagon\n");
                        break;
                    case 7:
                        print("Heptagon\n");
                        break;
                    case 8:
                        print("Octagon\n");
                        break;
                    case 9:
                        print("Nonagon\n");
                        break;
                    case 10:
                        print("Decagon\n");
                        break;
                    default:
                        throw new Exception();
                }
                */
                flag = true;
            } catch (Exception InputMismatch) {
                System.out.print("Please input a number 3 - 10: ");
            }

        }

        // 12. Month Name to number of days
        /*
        String month = " ";
        boolean trap = true;
        while(trap){
            try {
                print("Input a month: ");
                month = input.nextLine();
                switch(month){
                    case "January":
                        print("31 Days\n");
                        trap = false;
                        break;
                    case "February":
                        print("28 or 29 Days\n");
                        trap = false;
                        break;
                    case "March":
                        print("31 Days\n");
                        trap = false;
                        break;
                    case "April":
                        print("30 Days\n");
                        trap = false;
                        break;
                    case "May":
                        print("31 Days\n");
                        trap = false;
                        break;
                    case "June":
                        print("30 Days\n");
                        trap = false;
                        break;
                    case "July":
                        print("31 Days\n");
                        trap = false;
                        break;
                    case "August":
                        print("31 Days\n");
                        trap = false;
                        break;
                    case "September":
                        print("30 Days\n");
                        trap = false;
                        break;
                    case "October":
                        print("31 Days\n");
                        trap = false;
                        break;
                    case "November":
                        print("30 Days\n");
                        trap = false;
                        break;
                    case "December":
                        print("31 Days\n");
                        trap = false;
                        break;
                    default:
                        print("Enter a month like such \"Febuary\"\n");
                }
            }
            catch (Exception e){
                print("Please input the name of a month.");
            }
        }
        */

        // 13. Name that Triangle
        /*
        int sideOne = 0;
        int sideTwo = 0;
        int sideThree = 0;
        String triangle = " ";


        sideOne = intCheck("Side 1: ");
        sideTwo = intCheck("Side 2: ");
        sideThree = intCheck("Side 3: ");

        if (sideOne == sideTwo && sideTwo == sideThree){
            System.out.print("Your Triangle is an Equilateral Triangle\n");
        }
        else if (sideOne == sideTwo || sideTwo == sideThree || sideOne == sideThree){
            System.out.print("Your Triangle is an Isosceles Triangle\n");
        }
        else {
            System.out.print("Your triangle is a Scalene Triangle\n");
        }
        */

        // 14. Season from Month and Day
        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        //iterate through array, if input matches something in array, if index >= something spit it out



    }
}
