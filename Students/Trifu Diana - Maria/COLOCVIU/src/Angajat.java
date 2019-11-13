
public class Angajat extends Persoana {
	private String dataAngajare;
	private int nrClienti;
	private Client[] clienti;
	
	
	public Angajat(String nume, int id, int nrClienti) { 
        super(nume, id);
        this.nrClienti = nrClienti;
	}
	
	public double calculeazaSumaPlata(Client x) {
		double plata = 0.0F;
		this.nrClienti++;
		for(int i=0; i<x.getNrProd(); i++)
			plata = plata + x.getProduse(i).getPret();
		return plata;
	}
	
	@Override
	public void showDetails() {
		System.out.println("Acesta este angajatul cu id-ul " +  getID() + "si se numeste " + getNume());
	}
	
	public int compareTo(Angajat a){
		if(this.nrClienti > a.nrClienti)
			return 1;
		else if(this.nrClienti == a.nrClienti)
			return 0;
		else 
			return -1;
	}
}
