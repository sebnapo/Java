package napoleon.tp1.personne;

public class Personne {
	public String nom;
	public String prenom;
	public int age;
	public Personne pere;
	public Personne mere;
	
	public Personne(String nom, String prenom, int age, Personne pere, Personne mere) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
		this.pere = pere;
		this.mere = mere;
	}

	public Personne(String nom, String prenom, int age) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
	}
	
	public Personne() {
		super();
		this.nom = "Doe";
		this.prenom = "Jhon";
		this.age = 25;
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Personne getPere() {
		return pere;
	}

	public void setPere(Personne pere) {
		this.pere = pere;
	}

	public Personne getMere() {
		return mere;
	}

	public void setMere(Personne mere) {
		this.mere = mere;
	}
	
	public String toString() {
		return this.nom + "/" + this.prenom + "/" + this.age;
	}
}
