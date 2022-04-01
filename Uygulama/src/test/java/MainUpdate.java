import Model.Book;
import Repository.BookRepository;
import Repository.Impl.BookRepositoryImpl;

public class MainUpdate {
    public static void main(String[] args) {
        BookRepository bookRepository = new BookRepositoryImpl();
        Book book = bookRepository.find(100);
        book.setTopic("Bilim kurgu");
        bookRepository.update(book);
    }

}
