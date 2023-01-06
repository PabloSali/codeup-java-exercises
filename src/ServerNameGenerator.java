import java.util.Random;

public class ServerNameGenerator {
    public static void main(String[] args) {
        String[] adjectives = {"Red", "Blue", "Green", "Yellow", "Big", "Small", "Fast", "Slow", "Clean", "Dirty"};
        String[] nouns = {"Dog", "Cat", "Car", "Truck", "Bike", "Bird", "Fork", "Spoon", "Chair", "Floor", };

        Random rand = new Random();
        int rand_int1 = rand.nextInt(10);
        int rand_int2 = rand.nextInt(10);
        System.out.println("Your Server Name is: " + adjectives[rand_int1] + "-" + nouns[rand_int2]);
    }

}
