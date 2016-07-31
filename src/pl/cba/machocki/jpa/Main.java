package pl.cba.machocki.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import pl.cba.machocki.jpa.entity.AccType;
import pl.cba.machocki.jpa.entity.Account;
import pl.cba.machocki.jpa.entity.ClassicAcc;
import pl.cba.machocki.jpa.entity.Client;
import pl.cba.machocki.jpa.entity.GoldAcc;
import pl.cba.machocki.jpa.entity.SilverAcc;
import pl.cba.machocki.jpa.interfaces.Management;
import pl.cba.machocki.jpa.interfaces.Registration;
import pl.cba.machocki.jpa.interfaces.Welcome;

public class Main {

	private static EntityManagerFactory entityManagerFactory;
	private static EntityManager entityManager;

	public static void main(String[] args) {

		// entityManagerFactory =
		// Persistence.createEntityManagerFactory("lkbank");

		entityManagerFactory = Persistence
				.createEntityManagerFactory("mydatabase");
		entityManager = entityManagerFactory.createEntityManager();

//		 new Welcome();
//		 new Registration();
//		 new Management();

///////vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv////////			
		
//		Client c = entityManager
//				.createNamedQuery("Client.getClientByLogin", Client.class)
//				.setParameter(1, "asd").getSingleResult();
//		
//		System.out.println(c.getFirstName());
//		Account a = c.getAccount();
//		AccType t = a.getAccType();
//		System.out.println(t.getInterest());
		
///////^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^////////		

		 Client client = new Client();
		 AccType accType = new ClassicAcc();
		 Account account = new Account();
		 
		 client.setFirstName("Jan");
		 client.setSecondName("Adam");
		 client.setLastName("Kowalski");
		 client.setGender("male");
		 client.setPeselNum("12345678901");
		 client.setLogin("asd");
		 client.setPassword("zxc1");
		 client.setHint("aa");
		 client.setAccount(account);
		 client.setAccType(accType);
		 account.setAccNum("9876543210");
		 account.setBalance(12345567);
		 
		 
		 
		 Client client1 = new Client();
		 AccType accType1 = new GoldAcc();
		 Account account1 = new Account();

		 client1.setFirstName("£ukasz");
		 client1.setSecondName("Micha³");
		 client1.setLastName("Pi³ka");
		 client1.setGender("male");
		 client1.setPeselNum("12345678901");
		 client1.setLogin("qqw");
		 client1.setPassword("pass1");
		 client1.setHint("bb");
		 client1.setAccount(account1);
		 client1.setAccType(accType1);
		 account1.setAccNum("9120898987978");
		 account1.setBalance(1111111);
		 
		 
		 Client client2 = new Client();
		 AccType accType2 = new SilverAcc();
		 Account account2 = new Account();

		 client2.setFirstName("Marta");
		 client2.setSecondName("Katarzyna");
		 client2.setLastName("Caryca");
		 client2.setGender("female");
		 client2.setPeselNum("1221212121");
		 client2.setLogin("ccvv");
		 client2.setPassword("fdssf1");
		 client2.setHint("cc");
		 client2.setAccount(account2);
		 client2.setAccType(accType2);
		 account2.setAccNum("11222089");
		 account2.setBalance(999999);
		 
		 
		 Client client3 = new Client();
		 Account account3 = new Account();
		 client3.setFirstName("Andrzej");
		 client3.setSecondName("Kazimierz");
		 client3.setLastName("Wielki");
		 client3.setGender("male");
		 client3.setPeselNum("71830111111");
		 client3.setLogin("Andy");
		 client3.setPassword("and");
		 client3.setHint("an");
		 client3.setAccount(account3);
		 client3.setAccType(accType);
		 account3.setAccNum("100000001");
		 account3.setBalance(1000001);

		// ///////////////////////////////////////////////////
		entityManager.getTransaction().begin();
//		 Client client = entityManager.find(Client.class, 1L);
//		 System.out.println(client.getFirstName() );
//		 Account account = client.getAccount();
//		 System.out.println(account.getAccNum());

		 entityManager.persist(client);
		 entityManager.persist(account);
		 entityManager.persist(accType);
		 
		 entityManager.persist(client1);
		 entityManager.persist(account1);
		 entityManager.persist(accType1);
		 entityManager.persist(client2);
		 entityManager.persist(account2);
		 entityManager.persist(accType2);
		 
		 entityManager.persist(client3);
		 entityManager.persist(account3);
		 
		entityManager.getTransaction().commit();

		entityManager.close();
		entityManagerFactory.close();
		// ///////////////////////////////////////////////////
	}

}
