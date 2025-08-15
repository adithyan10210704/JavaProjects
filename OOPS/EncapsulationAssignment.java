package OOPS;
/*
    Create a class Author with the following information. Member variables: name(String),email(String)
    and gender(char).
    Parameterised constructor; To initialise the variables.

    Create a class Book with the following information.
    Member variables: name(String), author(of the class Author you have just created), price(double), and
    qtyInStock(int).
    [Assumption: Each book will be written by exactly one Author]
    Parameterised constructor: To initialise the variable Getters and Setters for all the member variables.

    In the main method, create a book object and print all details of the book(including the
    author details).
 */
class Author {
    private String name;
    private String email;
    private char gender;
    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }
    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    public char getGender() {
        return gender;
    }
    @Override
    public String toString() {
        return "Author [Name: " + name + ", Email: " + email + ", Gender: " + gender + "]";
    }
}
class Book {
    private String name;
    private Author author; // Author object as a member variable
    private double price;
    private int qtyInStock;
    public Book(String name, Author author, double price, int qtyInStock) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.qtyInStock = qtyInStock;
    }
    public String getName() {
        return name;
    }
    public Author getAuthor() {
        return author;
    }
    public double getPrice() {
        return price;
    }
    public int getQtyInStock() {
        return qtyInStock;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setAuthor(Author author) {
        this.author = author;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public void setQtyInStock(int qtyInStock) {
        this.qtyInStock = qtyInStock;
    }
    @Override
    public String toString() {
        return "Book [Name: " + name + ", Price: $" + price + ", Quantity in Stock: " + qtyInStock + ", Author Details: " + author + "]";
    }
}
public class EncapsulationAssignment {
    public static void main(String[] args) {
        Author author = new Author("J.K. Rowling", "jkrowling@example.com", 'F');
        Book book = new Book("Harry Potter and the Philosopher's Stone", author, 29.99, 100);
        System.out.println("Book Details:");
        System.out.println(book);
    }
}
