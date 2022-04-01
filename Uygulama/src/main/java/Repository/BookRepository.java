package Repository;

import JpaFactory.Impl.JpaFactoryImpl;
import JpaFactory.JpaFactory;
import Model.Book;

import javax.persistence.EntityManager;

public interface BookRepository {

    JpaFactory jpaFactory = new JpaFactoryImpl();

    void save(Book book);

    void delete(Book book);

    Book find(int id);

    Book update(Book book);
}
