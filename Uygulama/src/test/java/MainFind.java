import Model.Book;
import Repository.BookRepository;
import Repository.Impl.BookRepositoryImpl;

public class MainFind {
    public static void main(String[] args) {
        BookRepository bookRepository = new BookRepositoryImpl();
        Book book = bookRepository.find(100);
        if (book!=null){
            System.out.println(book);
        }else {
            System.out.println("Ürün bulunamadı");
        }
    }
}
