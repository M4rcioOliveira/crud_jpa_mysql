package br.com.estoqueveiculo.fatory;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ConnectionFactory {
	
		private static EntityManagerFactory factory;
		
		static {
			factory = Persistence.createEntityManagerFactory("Concessionaria");
		}
		
		public static EntityManager getConnection() {
			return factory.createEntityManager();
		}
		
		public static void close(){
			factory.close();
		}

}
