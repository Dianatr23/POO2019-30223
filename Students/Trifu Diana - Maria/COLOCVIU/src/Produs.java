
public class Produs {
	private String nume;
	private int pret;
	private int exemplare;
	
	public String getNume() {
		return nume;
	}
	public Produs(String nume, int a, int e) {
		this.nume = nume;
		this.exemplare = e;
		this.pret = a;
	}
	
	public int getPret() {
		return pret;
	}
	
	public int getExemplare() {
		return exemplare;
	}
	
	public Boolean verificaStoc() {
		if(this.exemplare > 0)
			return true;
		else 
			return false;
	}
	
}
