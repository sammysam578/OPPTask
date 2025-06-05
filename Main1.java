class Vehicle {
    void drive() {
        System.out.println("Vehicle is driving");
    }
}

class Car extends Vehicle {
    void display() {
        System.out.println("This is a car");
    }
}

public class Main1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.drive();
        car.display();
    }
}
