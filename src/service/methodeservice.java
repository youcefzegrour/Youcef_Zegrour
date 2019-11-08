package service;

import java.util.Date;
import java.util.List;

import mitier.annonce;
import mitier.personne;

public class methodeservice implements Iservice {

	@Override
	public int creerPersonne(List<personne> list, personne personne) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public personne getPersonne(List<personne> list, int idPersonne) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deletePersonne(List<personne> list, int idPersonne) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updatePersonne(List<personne> list, personne p, String nom, String prenom, Date dateNaissance) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<personne> findAllPersonnes() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getPersonneId(List<personne> list, personne p) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void affichePersonnes() {
		// TODO Auto-generated method stub

	}

	@Override
	public void afficheAnnoncesPersonne(personne p) {
		// TODO Auto-generated method stub

	}

	@Override
	public int creerAnnonce(personne personne, annonce a) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public annonce getAnnonce(personne personne, int idAnnonce) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteAnnonce(personne personne, int idAnnonce) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateAnnonce(personne personne, annonce a) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<annonce> findAllAnnonce(personne personne) {
		// TODO Auto-generated method stub
		return null;
	}

}
