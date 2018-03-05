package napoleon.tp1.personne;

import java.util.ArrayList;

public class GestionPersonne {
	private ArrayList<Personne> listePersonnes;
	
	public GestionPersonne() {
		listePersonnes = new ArrayList<Personne>();
	}
	
	public void addPersonne(Personne p) {
		listePersonnes.add(p);
	}
	
	public void printPersonne() {
		for (Personne personne : listePersonnes) {
			System.out.println(personne);
		}
	}
	
	public Personne findPersonne(String nom) {
		for (Personne personne : listePersonnes) {
			if(personne.nom == nom)
				return personne;
		}
		return null;
	}
	
	public Personne findPersonne(String nom, String prenom) {
		for (Personne personne : listePersonnes) {
			if(personne.nom == nom && personne.prenom == prenom)
				return personne;
		}
		return null;
	}
	
	public double getAgeMoyen() {
		int sum = 0;
		for (Personne personne : listePersonnes) {
			sum += personne.age;
		}
		
		return (sum / listePersonnes.size());
	}
}
