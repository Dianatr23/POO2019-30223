package obiecte;


public abstract class Rechizita {
	private String eticheta = "RECHIZITA ";
	
	public abstract String getNume();
	
	public void setEticheta(String s) {
		this.eticheta = s;
	}
	
	public String getEticheta() {
		return this.eticheta;
	}
}
