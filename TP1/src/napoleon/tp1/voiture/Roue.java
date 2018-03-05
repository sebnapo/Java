package napoleon.tp1.voiture;

public class Roue {
	public MarqueRoue marque;
	public ModeleRoue modele;
	
	public Roue(MarqueRoue marque, ModeleRoue modele) {
		super();
		this.marque = marque;
		this.modele = modele;
	}

	public MarqueRoue getMarque() {
		return marque;
	}

	public void setMarque(MarqueRoue marque) {
		this.marque = marque;
	}

	public ModeleRoue getModele() {
		return modele;
	}

	public void setModele(ModeleRoue modele) {
		this.modele = modele;
	}
	
	
}
