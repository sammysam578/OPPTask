public class Car {

    private String make;
    private String model;
    private double rentalPricePerDay;
    private boolean isAvailable;

    
    public Car(String make, String model, double rentalPricePerDay) {
        this.make = make;
        this.model = model;
        this.rentalPricePerDay = rentalPricePerDay;
        this.isAvailable = true; 
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public double getRentalPricePerDay() {
        return rentalPricePerDay;
    }

    public void setRentalPricePerDay(double price) {
        if (price >= 0) {
            this.rentalPricePerDay = price;
        } else {
            System.out.println("Rental price must be non-negative.");
        }
    }

    public boolean isAvailable() {
        return isAvailable;
    }


    public void rentCar() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("Car rented successfully.");
        } else {
            System.out.println("Sorry, this car is already rented.");
        }
    }

    public void returnCar() {
        isAvailable = true;
        System.out.println("Car returned successfully.");
    }

    public void displayInfo() {
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Rental Price/Day: $" + rentalPricePerDay);
        System.out.println("Available: " + (isAvailable ? "Yes" : "No"));
    }
    public static void main(String[] args) {
        Car car1 = new Car("Toyota", "Corolla", 50.0);
        car1.displayInfo();

        car1.rentCar();   
        car1.rentCar();    

        car1.returnCar();  

        System.out.println("\nAfter updates:");
        car1.displayInfo();
    }
}

    

