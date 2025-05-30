public class Book {
    private String title;
    private String author;
    private int publicationYear;
    private boolean isAvailable;

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.publicationYear = year;
        this.isAvailable = true; 
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int year) {
        this.publicationYear = year;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("You borrowed the book: " + title);
        } else {
            System.out.println("Sorry, the book is already borrowed.");
        }
    }

    public void returnBook() {
        isAvailable = true;
        System.out.println("You returned the book: " + title);
    }

    public void displayBookInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Year: " + publicationYear);
        System.out.println("Available: " + (isAvailable ? "Yes" : "No"));
    }

    public static void main(String[] args) {
        Book book1 = new Book("Fourth Wing", "Rebecca Yarros", 2023);
        book1.displayBookInfo();

        book1.borrowBook();  
        book1.borrowBook();  

        book1.returnBook();  
        book1.borrowBook();  

        book1.displayBookInfo();
    }
}

    

