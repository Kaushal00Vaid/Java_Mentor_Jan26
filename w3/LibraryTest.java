import java.util.Arrays;
import java.util.Scanner;

class Book {
    
    private String title;
    private double price;
    private String[] authors;
   
    // Standard Constructor
    public Book(String title, double price, String[] authors) {
        this.title = title;
        this.price = price;
        this.authors = authors;
    }
    
    public Book(Book source) {
        title = source.title;
        price = source.price;
        
        int idx = 0;
        for(String i : source.authors) {
            authors[idx++] = i;
        }
    }
    
    // Method to modify an author (Useful for testing deep copy)
    public void setAuthor(int index, String newAuthorName) {
        if (index >= 0 && index < authors.length) {
            this.authors[index] = newAuthorName;
        }
    }
   
    public double calculateDiscount(float discountPercent) {
        return (discountPercent / 100.0) * price;
    }
   
    void displayInfo() {
        System.out.println();
        System.out.println();
    }
    
    
    // TODO: Overload method displayInfo(boolean showAuthors) 
    void displayInfo(boolean flag) {
        displayInfo();

        if(flag) {
            // print the list of authors --> for loop
        }
    }
    
}

class EBook extends Book {
    private double fileSizeMB;
   
    EBook(String title, double price, String[] authors, double file) {
        super(title, price, authors);
        fileSizeMB = file;
    }
    
    
    EBook(EBook source) {
        super(source);
        fileSizeMB = source.fileSizeMB;
    }
    
    
    // TODO: Override method calculateDiscount(float discountPercent)
    // Hint: Use super.calculateDiscount(...) and add 5.0
    
    
    // TODO: Override method displayInfo()
    
    
    // TODO: Override method displayInfo(boolean showAuthors)
    
}

public class LibraryTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Setup initial array of authors
        String[] bookAuthors = {"John Doe", "Jane Smith"};
        
        // Create original physical book
        Book book1 = new Book("Java Programming", 50.00, bookAuthors);
        
        Book book2 = new Book(book1);
        
        
        // TODO: Modify the first author of book1 to "Johnathan Doe" using setAuthor()
        
        
        // TODO: Print displayInfo(true) for both book1 and book2.
        // If the deep copy worked, book1 should say "Johnathan Doe", but book2 should still say "John Doe".
        
        
        // TODO: Create an EBook object and test its overridden calculateDiscount and displayInfo methods
        
        
        sc.close();
    }
}
