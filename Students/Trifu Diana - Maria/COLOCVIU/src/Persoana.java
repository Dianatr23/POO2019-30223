
public class Persoana {
	private int ID;
	private String nume;
	
	public Persoana(String nume, int id) {
		this.nume = nume;
		this.ID = id;
	}
	
	public String getNume() {
		return nume;
	}
	public int getID() {
		return ID;
	}
	
	
	public void showDetails() {
		System.out.println("Aceasta este persoana cu id-ul " +  getID() + "si se numeste " + getNume());
	}
}
