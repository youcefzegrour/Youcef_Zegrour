package mitier;

public class annonce {
	public annonce() {
		super();
		// TODO Auto-generated constructor stub
	}
	public annonce(int idAnnoce, String intitule, String detail, double prix) {
		super();
		this.idAnnoce = idAnnoce;
		this.intitule = intitule;
		this.detail = detail;
		this.prix = prix;
	}
	int idAnnoce;
	String intitule;
	String detail;
	double prix;
	public int getIdAnnoce() {
		return idAnnoce;
	}
	public void setIdAnnoce(int idAnnoce) {
		this.idAnnoce = idAnnoce;
	}
	public String getIntitule() {
		return intitule;
	}
	public void setIntitule(String intitule) {
		this.intitule = intitule;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	public double getPrix() {
		return prix;
	}
	public void setPrix(double prix) {
		this.prix = prix;
	}
	@Override
	public String toString() {
		return "annonce [idAnnoce=" + idAnnoce + ", intitule=" + intitule + ", detail=" + detail + ", prix=" + prix
				+ "]";
	}

}
