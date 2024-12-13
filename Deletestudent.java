package student;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Deletestudent {
	public static void main (String [] args) {
		 EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("kiran");
		 EntityManager entityManager = entityManagerFactory.createEntityManager();
		 EntityTransaction entityTransaction = entityManager.getTransaction();
		 Student student = entityManager.find(Student.class,101);
		 entityTransaction.begin();
		 entityManager.remove(student);
		 entityTransaction.commit();
		 

}
	
}
