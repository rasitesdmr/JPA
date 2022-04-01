import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("persistence-unit");

        EntityManager entityManager = entityManagerFactory.createEntityManager();

        // Bir işlemin başarılı olup olmama durumu
        //Veri tabanına bir veri kaydedilecek kaydedilirken hata olması durumunda bütün işlemleri geri alma diyebiliz
        EntityTransaction entityTransaction = entityManager.getTransaction();

    }
}
