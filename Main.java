import java.util.Scanner;
abstract class CircleOperations
{
    double radius;

    CircleOperations(double radius)
    {
        this.radius = radius;
    }

    double calculateArea()
    {
        return Math.PI * radius * radius;
    }

    double calculateCircumference()
    {
        return 2 * Math.PI * radius;
    }
}
class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter radius of the circle: ");
        double radius = scanner.nextDouble();

        CircleOperations circle = new CircleOperations(radius) { };

        System.out.println("Area of the circle: " + circle.calculateArea());
        System.out.println("Circumference of the circle: " + circle.calculateCircumference());
    }
}
