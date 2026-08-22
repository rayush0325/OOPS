import java.util.List;
public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("maths", "R.D. Sharma", "10");
        Book book2 = new Book("maths", "R.D. Sharma", "10");
        System.out.printf("\nare references equal %b\n", book1 == book2);
        System.out.printf("\nare books equal %b\n", book1.equals(book2));

        Library library = new Library();
        library.addBook(new Book("T1", "A1", "I1"));
        library.addBook(new Book("T1", "A1", "I1"));
        library.removeBook("I2");
        library.removeBook("I1");

        library.addBook(new Book("ABC", "A1", "I1"));
        library.addBook(new Book("abc", "A1", "I2"));
        library.addBook(new Book("AbC", "A2", "I3"));
        library.addBook(new Book("Adc", "A1", "I4"));

        List<Book> bookList = library.findByTitle("aBc");
        System.out.printf("\nreturned books for title = %s \n","aBc");
        for(Book book : bookList){
            System.out.printf("\ntitle = %s, author = %s, ISBN = %s\n", book.getTitle(), book.getAuthor(), book.getISBN());
            book.setTitle("ayush");//trying to change content of original books
        }
        List<Book> bookList1 = library.findByTitle("ayush");
        System.out.printf("\nreturned books for title = %s \n","ayush");
        for(Book book : bookList1){
            System.out.printf("\ntitle = %s, author = %s, ISBN = %s\n", book.getTitle(), book.getAuthor(), book.getISBN());
        }


    }
}