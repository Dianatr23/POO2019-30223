
public class Lucrator {
	private String nume;
	private CalendarLucru calendar;
	
	public Lucrator(String nume, CalendarLucru calendar) {
		this.nume = nume;
		this.calendar = calendar;
	}
	
	public String getNume() {
		return this.nume;
	}
	
	public void lucreaza(String zi) throws ExceptieZiNelucratoare {
		int c = 0;
		for(int i=0; i<7; i++) {
			if(this.calendar.getZile()[i].getNume() == zi) {
				c++;
				if(this.calendar.getZile()[i].getProprietate() == "lucratoare") {
					System.out.println("Lucratorul " + this.getNume() + " lucreaza " + zi);
				}
				else {
					throw new ExceptieZiNelucratoare("lucru in zi nelucratoare");	
				}
			}
		}
		if(c == 0) {
			throw new ExceptieZiNelucratoare("aceasta nu este o zi a saptamanii");}
	}
}
