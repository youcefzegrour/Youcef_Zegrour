package service;

import java.util.Date;
import java.util.List;

import mitier.annonce;
import mitier.personne;

public interface Iservice {
	public int creerPersonne(List<personne> list, personne personne);
	 public personne getPersonne(List<personne> list,int idPersonne);
	 public void deletePersonne(List<personne> list,int idPersonne);
	 public void updatePersonne(List<personne> list,personne p, String nom, String prenom, Date dateNaissance);
	 public List<personne> findAllPersonnes();
	 public int getPersonneId(List<personne> list,personne p);
	 public void affichePersonnes();
	 public void afficheAnnoncesPersonne(personne p);
	 public int creerAnnonce(personne personne, annonce a);
	 public annonce getAnnonce(personne personne,int idAnnonce);
	 public void deleteAnnonce(personne personne,int idAnnonce);
	 public void updateAnnonce(personne personne,annonce a);
	 public List<annonce> findAllAnnonce(personne personne);

}
