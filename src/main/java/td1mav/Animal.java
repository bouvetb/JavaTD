package td1mav;

public class Animal {
	public Animal(String nom, String espece) {
		super();
		this.nom = nom;
		this.espece = espece;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getEspece() {
		return espece;
	}
	public void setEspece(String espece) {
		this.espece = espece;
	}
	private String nom;
	private String espece;
	@Override
	public String toString() {
		return "Animal [nom=" + nom + ", espece=" + espece + "]";
	}
}
