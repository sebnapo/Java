package napoleon.tp1.voiture;

public enum Puissance {
	First("80Ch"),
	Second("100Ch"),
	Third("120Ch");
	
	private String name = "";
	
	//Constructeur
	Puissance(String name){
	  this.name = name;
	}
	 
	public String toString(){
	  return name;
	}
}