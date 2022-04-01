import Model.Product;

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

        Product product  = entityManager.find(Product.class,101);

        product.setUnitPrice(3000);
        product.setUpdateDate(new Date());

        entityTransaction.begin();

        //merge : güncellediğimiz ögeyi geri veriyor
        entityManager.merge(product);

        // remove : ürün silme işlemidir
        // entityManager.remove(product);

        entityTransaction.commit();

    }
}
