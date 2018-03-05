package napoleon.tp1.voiture;

public class FactoryVoiture {
	public static Voiture CreateVoiture(Marque marque, Modele modele) {
		switch (marque) {
		case Polygeot:
			switch (modele) {
				case A:
					break;
				case AA:
					break;
				case AAA:
					break;
				default:
					return null;
			}
			break;
		case Polynault:
			switch (modele) {
				case A:
					break;
				case AA:
					break;
				case AAA:
					break;
				default:
					return null;
			}
			break;
		case Polyniat:
				switch (modele) {
				case A:
					break;
				case AA:
					break;
				case AAA:
					break;
				default:
					return null;
			}
			break;
		default:
			return null;
		}
		return null;
	}
}
