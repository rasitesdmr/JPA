import Model.Product;

import javax.persistence.*;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("persistence-unit");

        EntityManager entityManager =entityManagerFactory.createEntityManager();

        EntityTransaction entityTransaction = entityManager.getTransaction();

        Product product1 = new Product(101,"Samsung A7",2900,2,new Date(),null);

        entityTransaction.begin(); //Başlat

        //Ürünü veri tabanına kaydetme işlemi
        entityManager.persist(product1);

        entityTransaction.commit(); //Kapat

    }
}
