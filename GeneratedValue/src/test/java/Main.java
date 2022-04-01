import Model.Student;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.Date;

public class Main   {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("persistence-unit");
        EntityManager entityManager  =entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();

        Student student = new Student("Raşit","Eşdemir",new Date());
        Student student1 = new Student("Ömer","Eşdemir",new Date());

        entityTransaction.begin();
        entityManager.persist(student);
        entityManager.persist(student1);
        entityTransaction.commit();
    }
}
