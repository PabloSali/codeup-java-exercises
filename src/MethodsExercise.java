import java.util.Scanner;

public class MethodsExercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 1
        System.out.print("Enter first number: ");
        Double num1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        Double num2 = scanner.nextDouble();

        System.out.println("Addition: " + add(num1, num2));
        System.out.println("Subtraction: " + sub(num1, num2));
        System.out.println("Multiplication: " + mul(num1, num2));
        System.out.println("Remainder: " + mod(num1, num2));

        // 2
            getInteger();

        // 3


        // 4

    }

    // Q1
     public static double add(double int1, double int2){
        return int1 + int2;
     }
    public static double sub(double int1, double int2){
        return int1 - int2;
    }
    public static double mul(double int1, double int2){
        return int1 * int2;
    }
    public static double div(double int1, double int2){
        return int1 / int2;
    }
    public static double mod(double int1, double int2){
        return int1 % int2;
    }

    // Q2
    public static void getInteger() {
        Scanner scanner = new Scanner(System.in);
        boolean inRange = false;

        do {
            System.out.print("\nEnter an integer between 1-10 :");
            int userNum = scanner.nextInt();
            if (userNum >= 1 && userNum <= 10) {
                System.out.print(userNum + " is within the range!");
                inRange = false;
            } else {
                System.out.println(userNum + "is not between 1 - 10. Try again.");
                inRange = true;
            }
        } while (inRange);
    }
    // Q3
    public static void getFactorial() {
        Scanner scanner = new Scanner(System.in);
        boolean keepGoing = false;
        boolean numValid;

        do {
            System.out.print("Enter a number between 1 - 10 for factorial: ");
            long userInput = scanner.nextLong();

            if (userInput >= 1 & userInput <= 10) {
                numValid = true;

                long factorial = 1;
                for(int i = 1; i <= userInput; ++i) {
                    factorial *= i;
                }
                System.out.println("The factorial for " + userInput + " is " + factorial);

                scanner.nextLine();
                System.out.print("Would you like to continue? [y/n] ");
                String answer = scanner.nextLine();

                if (answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("y")) {
                    keepGoing = true;
                } else {
                    keepGoing = false;
                }
            } else {
                numValid = false;
            }

        } while (!numValid || keepGoing);

    }


    // Q4
    public static void diceRoll() {
            Scanner scanner = new Scanner(System.in);
            boolean keepGoing;
            do {
                System.out.print("\nHow many sides on your dice? ");
                int sides = scanner.nextInt();
                int randomSide1 = (int) Math.floor(Math.random() * sides + 1);
                int randomSide2 = (int) Math.floor(Math.random() * sides + 1);
                System.out.println("First die roll: " + randomSide1);
                System.out.println("Second die roll: " + randomSide2);

                System.out.print("Would you like to play again? [y/n] ");
                scanner.nextLine();
                String answer = scanner.nextLine();

                if (answer.equalsIgnoreCase("y")) {
                    keepGoing = true;
                } else {
                    keepGoing = false;
                }
            } while (keepGoing);

    }

}
