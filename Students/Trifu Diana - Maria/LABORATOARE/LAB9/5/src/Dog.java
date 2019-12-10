
public class Dog {
	private String nume;
	private String rasa;
	private int greutate;
	private boolean cazat;
	private int numar;
	
	public Dog(String nume, String rasa, int kg) {
		this.nume = nume;
		this.rasa = rasa;
		this.greutate = kg;
	}

	public String getNume() {
		return nume;
	}
	
	public int getGreutate() {
		return greutate;
	}

	public String getRasa() {
		return rasa;
	}
	 
	void cazeazaCaine(Cage c) {
		if(this.isCazat() == true)
			return;	
		if(c.ocupaCusca(this.getGreutate()) == false || c.isDisponibilitate() == false)
			this.cazat = false;
		else { 
			c.setDisponibiltate();
			this.setNumar(c.getNumar());
			this.setCazat();
			//System.out.println(this.getNume() + " a putut fi cazat/a in cusca cu numarul " + c.getNumar());
		}
	}

	public boolean isCazat() {
		return cazat;
	}

	public void setCazat() {
		this.cazat = true;
	}

	public int getNumar() {
		return numar;
	}

	public void setNumar(int numar) {
		this.numar = numar;
	}
}
