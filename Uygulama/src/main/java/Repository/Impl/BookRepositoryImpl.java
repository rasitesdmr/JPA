package Repository.Impl;
import Model.Book;
import Repository.BookRepository;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class BookRepositoryImpl implements BookRepository {

    EntityManager entityManager = jpaFactory.getEntityManager();

    EntityTransaction entityTransaction = jpaFactory.getEntityTransaction();

    @Override
    public void save(Book book) {
        entityTransaction.begin();
        entityManager.persist(book);
        entityTransaction.commit();

    }

    @Override
    public void delete(Book book) {
        entityTransaction.begin();
        entityManager.remove(book);
        entityTransaction.commit();
    }

    @Override
    public Book find(int id) {
        Book book =entityManager.find(Book.class,id);
        if (book != null){
            return book;
        }
        return null;
    }

    @Override
    public Book update(Book book) {
       entityTransaction.begin();
        Book updateBook = entityManager.merge(book);
        entityTransaction.commit();
        return updateBook;
    }
}
