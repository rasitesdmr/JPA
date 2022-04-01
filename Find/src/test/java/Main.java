import Model.Product;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("persistence-unit");

        EntityManager entityManager = entityManagerFactory.createEntityManager();

        Product product  = entityManager.find(Product.class,101);

        if (product != null){
            System.out.println("Ürün bilgileri : ");
            System.out.println("Ürün id : " + product.getProductId());
            System.out.println("Name : " + product.getName());
            System.out.println("Fiyat : " + product.getUnitPrice());
            System.out.println("Mevcut : " + product.getAvailable());
            System.out.println("ürün ekleme tarihi :" + product.getAddDate());
            System.out.println("Güncelleme tarihi : " + product.getUpdateDate());
        }else {
            System.out.println("Ürün bulunamadı");
        }
    }
}
