package jpa;

import kanban.Fiche;
import kanban.Utilisateur;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

public class JpaTest {
	private EntityManager manager;

	public JpaTest(EntityManager manager) {
		this.manager = manager;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		EntityManagerFactory factory =
				Persistence.createEntityManagerFactory("mysql");
		EntityManager manager = factory.createEntityManager();
		JpaTest test = new JpaTest(manager);

		EntityTransaction tx = manager.getTransaction();
		tx.begin();
		try {
			test.createUser();
			test.listUser();
			/*ArrayList<Tag> tagList1 = new ArrayList<Tag>();
			ArrayList<Fiche> ficheList1 = new ArrayList<Fiche>();
			Tag tag1 = new Tag("tag1",ficheList1);
			Tag tag2 = new Tag("tag2",ficheList1);
			Tag tag3 = new Tag("tag3",ficheList1);
			tagList1.add(tag1);
			tagList1.add(tag2);
			tagList1.add(tag3);
			manager.persist(tag1);
			manager.persist(tag2);
			manager.persist(tag3);
			Utilisateur user1 = new Utilisateur();
			user1.setNom("Emma");
			user1.setPrenom("Carena");
			manager.persist(user1);
			Fiche fiche1 = new Fiche("fiche 1", "01-01-2022", user1,200,tagList1,"Laval","URL","Note");
			Fiche fiche2 = new Fiche();
			fiche2.setLibelle("fiche 2");
			fiche2.setDate_butoire("02-02-2022");
			manager.persist(fiche1);
			manager.persist(fiche2);*/

		} catch (Exception e) {
			e.printStackTrace();
		}
		tx.commit();

		test.listUser();

		manager.close();
		EntityManagerHelper.closeEntityManagerFactory();
		//		factory.close();
	}

	private void createUser() {
		List<Fiche> ficheList1 = new ArrayList<Fiche>();
		List<Fiche> ficheList2 = new ArrayList<Fiche>();
		List<Fiche> ficheList3 = new ArrayList<Fiche>();
		List<Fiche> ficheList4 = new ArrayList<Fiche>();

		//int numOfUser = manager.createQuery("Select a From Utilisateur a", Utilisateur.class).getResultList().size();
		manager.persist(new Utilisateur(1, "Jakab", "Gipsz",ficheList1));
		manager.persist(new Utilisateur(2,"Captain", "Nemo",ficheList2));
		manager.persist(new Utilisateur(3, "Jakab", "Gipsz",ficheList3));
		manager.persist(new Utilisateur(4,"Captain", "Nemo",ficheList4));
	}

	private void listUser() {
		List<Utilisateur> resultList = manager.createQuery("Select a From Utilisateur a", Utilisateur.class).getResultList();
		System.out.println("num of users:" + resultList.size());
		for (Utilisateur next : resultList) {
			String next2 = next.toString();
			System.out.println("next employee: " + next2);
		}
	}
}
