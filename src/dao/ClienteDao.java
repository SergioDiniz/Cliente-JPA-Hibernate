package dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import beans.Cliente;

public class ClienteDao {

	private EntityManager em;
	
	public ClienteDao(){
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("clientePU");
		em = emf.createEntityManager();
	}
	
	public void addCliente(Cliente cliente){
		try {
			em.getTransaction().begin();
			em.persist(cliente);
			em.getTransaction().commit();
		} finally {
			em.close();
		}
	}
	
	public List<Cliente> listCliente(){
		
		Query query;
		List<Cliente> clientes = new ArrayList<Cliente>();
		
		try {
			query = em.createQuery("from cliente");
			clientes = query.getResultList();
		} finally {
			em.close();
		}
		
		return clientes;
		
	}
	
	public void removeCliente(Cliente cliente){
		try {
			em.getTransaction().begin();
			em.remove(em.getReference(Cliente.class, cliente).getId());
			em.getTransaction().commit();
		} finally {
			em.close();
		}
	}
	
	public void updateCliente(Cliente cliente){
		try {
			em.getTransaction().begin();
			em.merge(cliente);
			em.getTransaction().commit();
		} finally {
			em.close();
		}
	}
	
}
