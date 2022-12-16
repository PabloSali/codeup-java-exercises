import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {

    }

    // Q1
//     public static double add(double int1, double int2){
//        return int1 + int2;
//     }
//    public static double sub(double int1, double int2){
//        return int1 - int2;
//    }
//    public static double mul(double int1, double int2){
//        return int1 * int2;
//    }
//    public static double div(double int1, double int2){
//        return int1 / int2;
//    }
//    public static double mod(double int1, double int2){
//        return int1 % int2;
//    }

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
}
