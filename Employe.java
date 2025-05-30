public class Employe {
    private String name;
    private String employeeId;
    private double salary;

    
    public Employe(String name, String employeeId, double salary) {
        this.name = name;
        this.employeeId = employeeId;
        if (salary >= 0) {
            this.salary = salary;
        } else {
            this.salary = 0;
        }
    }

    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    
    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    
    public double getSalary() {
        return salary;
    }

    
    public void increaseSalary(double amount) {
        if (amount > 0) {
            salary = salary + amount;
            System.out.println("Salary increased by " + amount);
        } else {
            System.out.println("Increase amount must be positive.");
        }
    }

    
    public void decreaseSalary(double amount) {
        if (amount > 0) {
            if (salary - amount >= 0) {
                salary = salary - amount;
                System.out.println("Salary decreased by " + amount);
            } else {
                System.out.println("Cannot decrease below 0.");
            }
        } else {
            System.out.println("Decrease amount must be positive.");
        }
    }

    
    public void displayInfo() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Salary: $" + salary);
    }

    
    public static void main(String[] args) {
        Employe emp = new Employe("Alice", "EMP001", 5000);
        emp.displayInfo();

        emp.increaseSalary(1000);
        emp.decreaseSalary(2000);
        emp.decreaseSalary(5000);  // should not go below 0

        System.out.println("\nAfter salary updates:");
        emp.displayInfo();
    }
}

    

