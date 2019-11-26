//3.4. Creați o clasă Persoana care să conțină nume, prenume, vârstă. Într-o metodă main creați un
//tablou de obiecte de tip Persoana. Ordonați elementele din tablou alfabetic în funcție de nume.
//Indicații implementare:
//- Folosiți metoda statică sort(...) din clasa predefinită Arrays
//- Implementați interfața Comparable în clasa Persoana pentru a specifica criteriul de sortare
//- Modificați apoi conținutul metodei compareTo(Object other) pentru a putea sorta vectorul de
//persoane în funcție de vârstă.
import java.util.Arrays;
public class Persoana implements Comparable<Persoana>{
	private String nume;
	private String prenume;
	private int varsta;
	
	
	public Persoana(String nume) {
		this.nume = nume;
	}
	
	public String getNume() {
		return nume;
	}
	public void setNume(String nume) {
		this.nume = nume;
	}
	
	public int getVarsta() {
		return varsta;
	}
	public void setVarsta(int varsta) {
		this.varsta = varsta;
	}
	
	public String getPrenume() {
		return prenume;
	}
	public void setPrenume(String prenume) {
		this.prenume = prenume;
	}
	
	@Override
	public int compareTo(Persoana p) {
		return this.nume.compareTo(p.nume);
	}
	
	public static void main(String args[]){
		
		Persoana[] persoane = new Persoana[5];
		
		persoane[0] = new Persoana("Trifu");
		persoane[1] = new Persoana("Zoican");
		persoane[2] = new Persoana("Mihut");
		persoane[3] = new Persoana("Ilies");
		persoane[4] = new Persoana("Apostol");
		
		Arrays.sort(persoane);
		
		for(int i=0; i<5; i++)
			System.out.println(persoane[i].nume);
}
	}

