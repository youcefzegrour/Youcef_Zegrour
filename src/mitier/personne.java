package mitier;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class personne {
	public personne() {
		super();
		// TODO Auto-generated constructor stub
	}
	public personne(int personneId, String nom, String prenom, String login, String motDePasse, Date dateNaissance,
			List personne) {
		super();
		this.personneId = personneId;
		this.nom = nom;
		this.prenom = prenom;
		this.login = login;
		this.motDePasse = motDePasse;
		DateNaissance = dateNaissance;
		this.personne = personne;
	}
	int personneId;
	String nom;
	String prenom;
	String login;
	String motDePasse;
	Date DateNaissance;
	private List personne = new ArrayList<personne>();
	public int getPersonneId() {
		return personneId;
	}
	public void setPersonneId(int personneId) {
		this.personneId = personneId;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getMotDePasse() {
		return motDePasse;
	}
	public void setMotDePasse(String motDePasse) {
		this.motDePasse = motDePasse;
	}
	public Date getDateNaissance() {
		return DateNaissance;
	}
	public void setDateNaissance(Date dateNaissance) {
		DateNaissance = dateNaissance;
	}
	@Override
	public String toString() {
		return "personne [personneId=" + personneId + ", nom=" + nom + ", prenom=" + prenom + ", login=" + login
				+ ", motDePasse=" + motDePasse + ", DateNaissance=" + DateNaissance + "]";
	}

}

