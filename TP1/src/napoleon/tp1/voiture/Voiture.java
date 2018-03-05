package napoleon.tp1.voiture;

public class Voiture {
	public Marque nomMarque;
	public Modele nomModele;
	public int prix;
	public Roue r1,r2,r3,r4;
	public Moteur moteur;
	
	public Voiture(Marque nomMarque, Modele nomModele, int prix, Roue r1, Roue r2, Roue r3, Roue r4, Moteur moteur) {
		super();
		this.nomMarque = nomMarque;
		this.nomModele = nomModele;
		this.prix = prix;
		this.r1 = r1;
		this.r2 = r2;
		this.r3 = r3;
		this.r4 = r4;
		this.moteur = moteur;
	}
	
	
}
