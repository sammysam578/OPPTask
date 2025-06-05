class Shape {
    double calculateArea() {
        return 0;
    }
}

class ShapeRectangle extends Shape {
    double length, width;
    
    ShapeRectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    
    @Override
    double calculateArea() {
        return length * width;
    }
    
    double calculatePerimeter() {
        return 2 * (length + width);
    }
}

class Circle extends Shape {
    double radius;
    
    Circle(double radius) {
        this.radius = radius;
    }
    
    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }
    
    double calculateCircumference() {
        return 2 * Math.PI * radius;
    }
}

public class Main5 {
    public static void main(String[] args) {
        ShapeRectangle rect = new ShapeRectangle(7, 4);
        System.out.println("Rectangle Area: " + rect.calculateArea());
        System.out.println("Rectangle Perimeter: " + rect.calculatePerimeter());
        
        Circle circle = new Circle(5);
        System.out.println("Circle Area: " + circle.calculateArea());
        System.out.println("Circle Circumference: " + circle.calculateCircumference());
    }
}
