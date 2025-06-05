class Shape {
    double calculateArea() {
        return 0;
    }
}

class Rectangle extends Shape {
    double length, width;
    
    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    
    @Override
    double calculateArea() {
        return length * width;
    }
}

class Square extends Rectangle {
    Square(double side) {
        super(side, side);
    }
}

public class Main3 {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(5, 3);
        System.out.println("Rectangle area: " + rect.calculateArea());
        
        Square sq = new Square(4);
        System.out.println("Square area: " + sq.calculateArea());
    }
}
