package pl.cba.machocki.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import pl.cba.machocki.jpa.entity.AccType;
import pl.cba.machocki.jpa.entity.Account;
import pl.cba.machocki.jpa.entity.Client;
import pl.cba.machocki.jpa.interfaces.Management;
import pl.cba.machocki.jpa.interfaces.Registration;
import pl.cba.machocki.jpa.interfaces.Welcome;

public class Main {

	private static EntityManagerFactory entityManagerFactory;
	private static EntityManager entityManager;
	
	public static void main(String[] args) {
		
//		entityManagerFactory = Persistence.createEntityManagerFactory("lkbank");
		
		entityManagerFactory = Persistence.createEntityManagerFactory("mydatabase");
		entityManager = entityManagerFactory.createEntityManager();
		
//		new Welcome();
//		new Registration();
//		new Management();
		

		
//		Client client = new Client();
//		Account account = new Account();
//		AccType accType = new AccType();
//		
//		client.setFirstName("Jan");
//		client.setSecondName("Adam");
//		client.setLastName("Kowalski");
//		client.setGender("male");
//		client.setPeselNum(12345678901L);
//		client.setLogin("asd");
//		client.setPassword("zxc1");
//		client.setHint("aa");
//		client.setAccount(account);
//		
//		account.setAccNum(98765432101089L);
//		account.setBalance(12345567);
//		account.setAccType(accType);
//		
//		accType.setAccTypeName("Gold");
//		accType.setInterest(0.2);
		
		
		
/////////////////////////////////////////////////////		
		entityManager.getTransaction().begin();
//		Client client = entityManager.find(Client.class, );
//		System.out.println(client.getFirstName() );
//		Account account = client.getAccount();
//		System.out.println(account.getAccNum());
		
//		entityManager.persist(client);
//		entityManager.persist(account);
//		entityManager.persist(accType);
		entityManager.getTransaction().commit();

		
		entityManager.close();
		entityManagerFactory.close();
/////////////////////////////////////////////////////
	}
	

}
