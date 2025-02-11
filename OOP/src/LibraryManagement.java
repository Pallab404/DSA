import java.util.*;

class Book{
    private final String Title;
    private final String Author;
    private final String Isbn;

    public Book(String Title,String Author,String Isbn){
        this.Title = Title;
        this.Author = Author;
        this.Isbn = Isbn;
    }

    public String getTitle() {
        return Title;
    }

    public String getAuthor(){
        return Author;
    }

    public String getIsbn(){
        return Isbn;
    }

    public void display(){
        System.out.println("Name : "+Title +"\nAuthor : "+Author +"\nIsbn : "+Isbn);
    }
}

class Library{
    private final List<Book> books = new ArrayList<>();

    public void addBook(Book book){
        books.add(book);
        System.out.println("book added successfully" + book.getTitle());
    }

    public void SearchBook(String Title){
        boolean found = false;
        for(Book i:books){
            if(i.getTitle().equalsIgnoreCase(Title)){
                i.display();
                found = true;
            }
        }
        if (!found){
            System.out.println("Book not found");
        }
    }

    public void SearchByAuthor(String Author){
        boolean found = false;
        for(Book i:books){
            if(i.getAuthor().equalsIgnoreCase(Author)){
                i.display();
                found = true;
            }
        }
        if (!found){
            System.out.println("Book not found");
        }
    }

    public void SearchByIsbn(String Isbn){
        boolean found = false;
        for(Book i:books){
            if(i.getIsbn().equalsIgnoreCase(Isbn)){
                i.display();
                found = true;
            }
        }
        if (!found){
            System.out.println("Book not found");
        }
    }

    public void displayAllBooks(){
        if (books.isEmpty()){
            System.out.println("No books in the library");
            
        }
        else{
            System.out.println("Books in the library are : ");
            for(Book i:books){
                i.display();
            }
        }
    }

}


public class LibraryManagement {
    public static void main(String[] args) {
        Library L = new Library();
        L.addBook(new Book("Java","James Gosling","1234"));
        L.addBook(new Book("Python","Guido Van Rossum","5678"));
        L.addBook(new Book("C++","Bjarne Stroustrup","91011"));

        System.out.println("Searching by Title : ");
        L.SearchBook("C++");

        System.out.println("Searching by Author : ");
        L.SearchByAuthor("Guido Van Rossum");


        System.out.println("displaying all books : ");
        L.displayAllBooks();
    }
}
