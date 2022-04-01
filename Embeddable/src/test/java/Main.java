import Model.Contact;
import Model.User;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("persistence-unit");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();


        User user = new User("rasitesdmr","123",
                new Contact("05448892","sadgnsjf@gmail.com","rasit.com"),new Date());


        entityTransaction.begin();
        entityManager.persist(user);
        entityTransaction.commit();

    }
}
