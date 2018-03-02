package controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import model.Player;


public class PlayerHelper {

	
EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("BowlingLeagueRunyan");
	
	
	public void insertPlayer(Player toAdd) {
		// TODO Auto-generated method stub
		
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		em.persist(toAdd);
		em.getTransaction().commit();
		em.close();
	}
	public List<Player> viewAllPlayers() {
		// TODO Auto-generated method stub
		EntityManager em = emfactory.createEntityManager();
		TypedQuery<Player> allResults = em.createQuery("select li from Player li", Player.class);
		List<Player> allItems = allResults.getResultList();
		em.close();
		return allItems;
	}
	public Player searchForTeamById(Integer tempId) {
		
		return null;
	}
	public void deleteItem(Player teamToDelete) {
		
		
	}
}
