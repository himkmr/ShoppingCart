package UtilPackage;



import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;



public class DBUtil {
	
private static final EntityManagerFactory emf =
Persistence.createEntityManagerFactory("Shopping_Cart");


 public static EntityManagerFactory getEmFactory()
 {  
	 return emf; 
} 
}
