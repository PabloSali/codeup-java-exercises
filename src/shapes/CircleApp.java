package shapes;
import util.Input;

public class CircleApp {
    public static void main(String[] args) {
        System.out.print("Input a radius: ");
        double radiusInput = Input.getDouble();
        Circle circle = new Circle(radiusInput);
        double area = circle.getArea();
        double circumference = circle.getCircumference();
        System.out.printf("Your Circle has an area of %s, and a circumference of %s", area, circumference);
    }
}
