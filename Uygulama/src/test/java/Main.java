import Model.Book;
import Repository.BookRepository;
import Repository.Impl.BookRepositoryImpl;

import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        BookRepository bookRepository =new BookRepositoryImpl();

        Book book =new Book(100,"Hary Pother" ,350,"Aksiyon-Macera","Raşit",createCustomDate(12,12,1999));
        bookRepository.save(book);

    }

    public static Date createCustomDate(int day , int month,int year){
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.DAY_OF_MONTH,day);
        calendar.set(Calendar.MONTH,month);
        calendar.set(Calendar.YEAR,year);
        return  calendar.getTime();
    }
}
