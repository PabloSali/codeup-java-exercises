package Contacts;
import java.util.Scanner;

public class MainMenu {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Choose an option: \n"  +
                "1. View contacts. \n" +
                "2. Add a new contact. \n" +
                "3. Search a contact by name. \n" +
                "4. Delete an existing contact. \n" +
                "5. Exit. \n" +
                "Enter an option (1, 2, 3, 4 or 5): \n");
        int userInput = scanner.nextInt();
        System.out.println("You chose: " + userInput);

}
