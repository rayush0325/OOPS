import java.util.*;

class Library{
    private Map<String, Book> bookMap = new HashMap<>();

    public void addBook(Book book){
        if(bookMap.containsKey(book.getISBN())){
            System.out.printf("\nbook with ISBN %s already exists\n", book.getISBN());
        }
        else{
            bookMap.put(book.getISBN(), book);
            System.out.printf("\nbook with ISBN %s added\n", book.getISBN());
        }
    }
    public void removeBook(String ISBN){
        if(bookMap.containsKey(ISBN)){
            bookMap.remove(ISBN);
            System.out.printf("\nbook with ISBN %s removed\n", ISBN);
        }
        else{
            System.out.printf("\nbook with ISBN %s don't exists\n", ISBN);
        }
    }
    public List<Book>  findByTitle(String title){
        List<Book> bookList = new ArrayList<>();

        for(Map.Entry<String, Book> entry : bookMap.entrySet()){
            Book book = entry.getValue();

            if( book.getTitle().toLowerCase().equals(title.toLowerCase()) ){
                Book bookCopy = new Book(book.getTitle(), book.getAuthor(), book.getISBN());
                bookList.add(bookCopy);
            }
        }
        return bookList;
    }
}