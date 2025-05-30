import java.util.Scanner;

public class question1 {
    private double radius;
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  
        question1 circle = new question1();            

        // Ask user for input
        System.out.print("Enter the radius of the circle: ");
        double inputRadius = sc.nextDouble();

        // Set radius
        circle.setRadius(inputRadius);

        // Display results
        System.out.println("Radius: " + circle.getRadius());
        System.out.println("Area: " + circle.calculateArea());
        System.out.println("Circumference: " + circle.calculateCircumference());

        sc.close(); 
    }
}
