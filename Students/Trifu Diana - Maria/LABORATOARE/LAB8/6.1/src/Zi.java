
public class Zi {
	private String nume;
	private String proprietate;
	
	public Zi(String n, String p) {
		this.nume = n;
		this.setProprietate(p);
	}
	
	public String getNume() {
		return nume;
	}
	public void setNume(String nume) {
		this.nume = nume;
	}

	public String getProprietate() {
		return proprietate;
	}

	public void setProprietate(String proprietate) {
		this.proprietate = proprietate;
	}
	
	
}
