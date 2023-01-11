package Contacts;
import java.util.Scanner; // Placed outside of main class

public class ContactManager {
    public static void main(String[] args) {
        //Constructor Test Code
        Contact test = new Contact("Test", 123457890);
        System.out.println(test.name);
        System.out.println(test.number);
    }
}
