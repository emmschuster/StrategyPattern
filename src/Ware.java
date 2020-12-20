public abstract class Ware { 

	Steuerklasse sk20 = new Pro20();	//Normalsteuersatz
	
//	public String name;
//	public double preis;
//	public int steuer;
	
	public void setSteuer(Steuerklasse steuerk) {
		this.sk20 = steuerk;
	}
	
	public double steuer () {
		return sk20.steuer();
	}
 
}