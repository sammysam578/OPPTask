public class Employee {
    private String name;
    private String jobTitle;
    private double salary;

    public Employee(String name, String jobTitle, double salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public double getSalary() {
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public double calculateNewSalary(double raisePercent) {
        return salary + (salary * raisePercent / 100);
    }

    public void updateSalary(double raisePercent) {
        salary = calculateNewSalary(raisePercent);
    }

    public void displayEmployee() {
        System.out.println("Employee Name: " + name);
        System.out.println("Job Title: " + jobTitle);
        System.out.printf("Salary: %.2f\n", salary);
    }

    public static void main(String[] args) {
        Employee emp = new Employee("Alice Johnson", "Software Engineer", 75000);
        emp.displayEmployee();

        System.out.println("\nApplying a 10% raise...");
        emp.updateSalary(10);
        emp.displayEmployee();
    }
}

    

