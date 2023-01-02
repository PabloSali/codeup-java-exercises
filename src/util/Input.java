package util;
import java.util.Scanner;

public class Input {
    private static Scanner scanner = new Scanner(System.in);

    public static String getString(){
        return scanner.nextLine();
    }

    public static boolean yesNo(){
        System.out.print("select [y/n]: ");
        String userInput = scanner.nextLine();
        return userInput.equalsIgnoreCase("yes") || userInput.equalsIgnoreCase("y");
    }

    public static int getInt(int min, int max){
        System.out.println("Enter a number between " + min + "and " + max + ":");
        int enteredNum = scanner.nextInt();
        if(enteredNum > max || enteredNum < min){
            System.out.println(enteredNum + " is not between " + min + "and " + max + ".");
            getInt(min,max);
        }
        return enteredNum;
    }

    public static int getInt() {
        return scanner.nextInt();
    }

    double getDouble(double min, double max){
        System.out.println("Enter a number between " + min + "and " + max + ":");
        int enteredNum = scanner.nextInt();
        if(enteredNum > max || enteredNum < min){
            System.out.println(enteredNum + " is not between " + min + "and " + max + ".");
            getDouble(min,max);
        }
        return enteredNum;
    }

    public static int getDouble() {
        return scanner.nextInt();
    }
}
