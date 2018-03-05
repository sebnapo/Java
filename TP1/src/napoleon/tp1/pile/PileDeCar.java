package napoleon.tp1.pile;

public class PileDeCar {
	static int TAILLE_MAX = 100;
	private char[] tableau = new char[TAILLE_MAX];
	private int last = 0;
	
	public PileDeCar() {
		
	}
	
	public PileDeCar(String s) {
		for(char ch: s.toCharArray()) {
			this.empiler(ch);
		}
	}
	public static int getTAILLE_MAX() {
		return TAILLE_MAX;
	}

	public static void setTAILLE_MAX(int tAILLE_MAX) {
		TAILLE_MAX = tAILLE_MAX;
	}

	public int getLast() {
		return last;
	}
	
	public char getLastValue() {
		return tableau[last];
	}
	
	private boolean estVide() {
		if(tableau.length == 0)
			return true;
		else return false;
	}
	
	private boolean estPleine() {
		if(this.estVide())
			return false;
		else 
			return true;
	}
	
	private void empiler(char c) {
		tableau[last] = c;
		last++;
	}
	
	private char depiler() {
		char res = tableau[last];
		last--;
		return res;
	}
	
	public String mirroir(String s) {
		for(char ch: s.toCharArray()) {
			this.empiler(ch);
		}
		StringBuilder sBuilder = new StringBuilder();
		if(this.estVide()) {
			System.out.println("Erreur la string passé en parametre est VIDE");
			return null;
		} else {
			for(int i =last; i >= 0; i--) {
				sBuilder.append(this.depiler());
			}
			return sBuilder.toString();
		}
	}
}
