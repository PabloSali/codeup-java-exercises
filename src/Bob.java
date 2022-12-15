import java.util.Scanner;
public class Bob {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        System.out.print("This is Bob! Feel free to converse: ");
        String userInput = user.next();

        if(userInput.endsWith("?")){
            System.out.print("Sure.");
        } else if(userInput.endsWith("!")){
            System.out.print("Whoa, chill out!");
        }else if (userInput.equals("")){
            System.out.print("Fine be that way");
        }else{
            System.out.println("Whatever");
        }
    }
}
