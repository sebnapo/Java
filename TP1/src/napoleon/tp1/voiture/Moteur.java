package napoleon.tp1.voiture;

public class Moteur {
	public Puissance puissance;
	public int prix;
	
	public Moteur(Puissance puissance, int prix) {
		super();
		this.puissance = puissance;
		this.prix = prix;
	}

	public Puissance getPuissance() {
		return puissance;
	}

	public void setPuissance(Puissance puissance) {
		this.puissance = puissance;
	}

	public int getPrix() {
		return prix;
	}

	public void setPrix(int prix) {
		this.prix = prix;
	}
}
