public class dog {
    private String name;
    private String breed;

    public dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }


    public void printDetails() {
        System.out.println("Name: " + name + ", Breed: " + breed);
    }


    public static void main(String[] args) {
    
        dog dog1 = new dog("Buddy", "Golden Retriever");
        dog dog2 = new dog("Max", "German Shepherd");

        
        System.out.println("Initial Dog Details:");
        dog1.printDetails();
        dog2.printDetails();
        dog1.setName("Charlie");
        dog1.setBreed("Labrador");
        dog2.setName("Rocky");
        dog2.setBreed("Bulldog");

        System.out.println("\nUpdated Dog Details:");
        dog1.printDetails();
        dog2.printDetails();
    }
}
