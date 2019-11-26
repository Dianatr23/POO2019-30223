
public class Persoana {
	private String nume;
	private int varsta;
	
	@Override
	public String toString() {
		return "Aceasta persoana pe nume " + getNume() + " are " + getVarsta() + " ani";
	}

	public int getVarsta() {
		return varsta;
	}

	public void setVarsta(int varsta) {
		this.varsta = varsta;
	}

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}
}
