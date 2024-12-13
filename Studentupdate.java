package student;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Studentupdate {
	public static void main (String [] args) {
	
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("kiran");
	 EntityManager entityManager = entityManagerFactory.createEntityManager();
	 EntityTransaction entityTransaction = entityManager.getTransaction();
	 Student student = entityManager.find(Student.class,100);
	 student.setAge(17);
	
	 entityTransaction.begin();
	 entityManager.merge(student);
	 entityTransaction.commit();

}
}
