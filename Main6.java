class Book {
    String title;
    String author;
    
    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
    
    void displayDetails() {
        System.out.println("Title: " + title + ", Author: " + author);
    }
}

class FictionBook extends Book {
    FictionBook(String title, String author) {
        super(title, author);
    }
}

class NonFictionBook extends Book {
    NonFictionBook(String title, String author) {
        super(title, author);
    }
}

class TechnicalBook extends Book {
    TechnicalBook(String title, String author) {
        super(title, author);
    }
}

public class Main6 {
    public static void main(String[] args) {
        FictionBook fb = new FictionBook("Fourth Wing", "Rebecca Yarros");
        NonFictionBook nfb = new NonFictionBook("Twisted love", "Ana huang");
        TechnicalBook tb = new TechnicalBook("Introduction to Algorithms", "Cormen et al.");
        
        fb.displayDetails();
        nfb.displayDetails();
        tb.displayDetails();
    }
}
