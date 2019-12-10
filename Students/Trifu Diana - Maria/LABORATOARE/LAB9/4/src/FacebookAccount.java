import java.util.*;

public class FacebookAccount {
	private String nume;
	private int age; 
	private String locatie;
	private List<FacebookAccount> listaPrieteni;
	
	public FacebookAccount(String nume, String locatie, int varsta) {
		this.age = varsta;
		this.nume = nume;
		this.locatie = locatie;
		this.listaPrieteni = new ArrayList();
	}
	
	public String getNume() {
		return this.nume;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public String getLocatie() {
		return this.locatie;
	}
	
	public void stergePrieten(FacebookAccount f) {
		listaPrieteni.remove(f);
	}
	
	public void adaugaPrieten(FacebookAccount f) {
		listaPrieteni.add(f);
	}
	
	public void afiseazaLista() {
		for(FacebookAccount a : listaPrieteni) {
			System.out.println(a.getNume() + " " + a.getAge() + " " + a.getLocatie());
		}
	}
	
	public void cautaPrieteni(String locatie) {
		for(FacebookAccount a : listaPrieteni) {
			if(locatie == a.getLocatie())
				System.out.println(a.getNume());
		}
	}

}
