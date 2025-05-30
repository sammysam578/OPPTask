public class Student {
    private String name;
    private String idNumber;
    private double gpa;  

    
    public Student(String name, String idNumber, double gpa) {
        this.name = name;
        this.idNumber = idNumber;
        this.gpa = gpa;
    }

    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public double getGpa() {
        return gpa;
    }


    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("ID Number: " + idNumber);
        System.out.println("GPA: " + gpa);
    }


    public static void main(String[] args) {
        Student s = new Student("John Doe", "S12345", 3.8);
        s.displayInfo();

        s.setName("SAMM");
        s.setIdNumber("S67890");

        System.out.println("\nAfter update:");
        s.displayInfo();
    }
}

    

