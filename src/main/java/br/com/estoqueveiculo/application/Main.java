package br.com.estoqueveiculo.application;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import br.com.estoqueveiculo.fatory.ConnectionFactory;
import br.com.estoqueveiculo.model.Veiculo;

public class Main {

	public static void main(String[] args) {

		// Persistencia
		/*
		 * EntityManager em = ConnectionFactory.getConnection(); EntityTransaction et =
		 * em.getTransaction(); et.begin();
		 * 
		 * Veiculo veiculo = new Veiculo();
		 * 
		 * veiculo.setAnoFabricacao(2010); veiculo.setAnoLancamento(2008);
		 * veiculo.setFabricante("VW"); veiculo.setModelo("CrossFox 2 Portas");
		 * veiculo.setValor(new BigDecimal(39000));
		 * 
		 * em.persist(veiculo); et.commit();
		 * 
		 * em.close(); ConnectionFactory.close();
		 */

		// Busca por Codigo
		/*
		 * EntityManager em = ConnectionFactory.getConnection();
		 * 
		 * Veiculo veiculo = em.find(Veiculo.class, 52L);
		 * 
		 * System.out.println("Modelo do veículo procurado: " + veiculo.getModelo());
		 * 
		 * em.close(); ConnectionFactory.close();
		 */

		// Busca de todos Veiculos
		/*
		 * EntityManager em = ConnectionFactory.getConnection();
		 * 
		 * Query query = em.createQuery("select v from Veiculo v");
		 * 
		 * List<Veiculo> veiculos = query.getResultList();
		 * 
		 * for(Veiculo veiculo : veiculos) { System.out.println("Modelo " +
		 * veiculo.getModelo() + ", Fabricante " + veiculo.getFabricante() +
		 * ", Ano Lançamento " + veiculo.getAnoLancamento() + ", Ano Fabricação " +
		 * veiculo.getAnoLancamento() + ", Valor: " + veiculo.getValor());
		 * 
		 * em.close(); ConnectionFactory.close(); }
		 */

		// Update
		/*
		 * EntityManager em = ConnectionFactory.getConnection(); EntityTransaction et =
		 * em.getTransaction();
		 * 
		 * et.begin();
		 * 
		 * Veiculo veiculo = em.find(Veiculo.class, 52L);
		 * 
		 * veiculo.setFabricante("Volkswagen");
		 * 
		 * em.persist(veiculo); et.commit();
		 * 
		 * em.close(); ConnectionFactory.close();
		 */

		// Remove
		/*
		 * EntityManager em = ConnectionFactory.getConnection(); EntityTransaction et =
		 * em.getTransaction();
		 * 
		 * et.begin();
		 * 
		 * Veiculo veiculo = em.find(Veiculo.class, 52L);
		 * 
		 * em.remove(veiculo); et.commit();
		 * 
		 * em.close(); ConnectionFactory.close();
		 */

	}

}
