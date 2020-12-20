
public class Client {

	public static void main(String[] args) {
		Medikament kopfwehtablette = new Medikament();
		kopfwehtablette.steuer();  //10%
		System.out.println(kopfwehtablette.steuer()+"% auf Medikamente");
		Friseurbesuch normalF = new Friseurbesuch();
		normalF.steuer();  //20%
		System.out.println(normalF.steuer()+"% auf Friseurbesuche in normalen Zeiten");
		normalF.setSteuer(new Pro5());
		System.out.println(normalF.steuer()+"% auf Friseurbesuche in Corona Zeiten (01.07.-31.12.2020)");

	}

}
