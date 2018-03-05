package napoleon.tp1.personne;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Personne p = new Personne("Marielle","Gerard",60);
		Personne p1 = new Personne("Pf","Gouineau",60);
		Personne p2 = new Personne("Marielle","Gerard",60,p,p1);
		Personne p3 = new Personne();
		
		GestionPersonne gp = new GestionPersonne();
		gp.addPersonne(p);
		gp.addPersonne(p1);
		gp.addPersonne(p2);
		gp.addPersonne(p3);
		gp.printPersonne();
		System.out.println(gp.getAgeMoyen());
		System.out.println(gp.findPersonne("Marielle"));
	}

}
