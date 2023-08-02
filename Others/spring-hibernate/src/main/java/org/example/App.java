package org.example;

import java.util.UUID;

import org.example.config.SpringConfig;
import org.example.dao.ProductDao;
import org.example.entity.Product;
import org.example.service.ProductService;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        try {
			ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
			SessionFactory sessionFactory = context.getBean("sessionFactory", SessionFactory.class);
			Session session = sessionFactory.openSession();
			session.getTransaction().begin();
			session.save(new Product(UUID.randomUUID().toString(), "Laptop"));
			session.getTransaction().commit();
			System.out.println("one product created...");
			
//			productDao
            System.out.println("\nProductDao\n");

            ProductDao productDao = context.getBean(ProductDao.class);
            
            Product product1 = new Product(UUID.randomUUID().toString(), "Table");
            productDao.createProduct(product1);
            
            System.out.println("Product created");
            
            System.out.println("Products:");
            for (Product product : productDao.getAllProducts()) {
                System.out.println(product);
            }

            String productId1 = product1.getProductId();
            System.out.println(productDao.findById(productId1));

            String newName1 = "Glove";
            product1.setProductName(newName1);
            productDao.updateProduct(product1);

            for (Product product : productDao.getAllProducts()) {
                System.out.println(product);
            }

            productDao.deleteById(productId1);
            
//            productService
            System.out.println("\nProductService\n");
            ProductService productService = context.getBean(ProductService.class);

            Product product2 = new Product(UUID.randomUUID().toString(), "Car");
            productService.createProduct(product2);

            System.out.println("Product created");
            
            System.out.println("Products:");
            for (Product product : productService.getAllProducts()) {
                System.out.println(product);
            }

            String productId2 = product1.getProductId();
            System.out.println(productService.findById(productId2));

            String newName2 = "Ink";
            product1.setProductName(newName2);
            productService.updateProduct(product1);

            for (Product product : productService.getAllProducts()) {
                System.out.println(product);
            }

            productService.deleteById(productId2);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
    }
}
