package pl.sdacademy.simple.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public final class DatabaseUtil {
	private static EntityManager entityManager;

	private DatabaseUtil() {
		// utility class
	}

	private static void buildSessionFactory() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("CarService");
		entityManager = emf.createEntityManager();
	}

	public static EntityManager getEntityManager() {
		if (entityManager == null) {
			buildSessionFactory();
		}
		return entityManager;
	}
}
