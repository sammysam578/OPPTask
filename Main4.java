class Vehicles {
    void startEngine() {
        System.out.println("Engine started");
    }
    
    void stopEngine() {
        System.out.println("Engine stopped");
    }
}

class VehicleCar extends Vehicles {
    void drive() {
        System.out.println("Car is driving");
    }
}

class Motorcycle extends Vehicles {
    void ride() {
        System.out.println("Motorcycle is riding");
    }
}

public class Main4 {
    public static void main(String[] args) {
        VehicleCar car = new VehicleCar();
        car.startEngine();
        car.drive();
        car.stopEngine();
        
        Motorcycle moto = new Motorcycle();
        moto.startEngine();
        moto.ride();
        moto.stopEngine();
    }
}
