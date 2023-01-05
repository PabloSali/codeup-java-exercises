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
    public static void factorial(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose an integer between 1 - 10.");

    }

    // Q4
    public static void dice(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many sides does your dice have?: ");
        int userNum = scanner.nextInt();


    }

}
