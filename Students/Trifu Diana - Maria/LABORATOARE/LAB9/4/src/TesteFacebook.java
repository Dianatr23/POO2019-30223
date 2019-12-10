
public class TesteFacebook {

	public static void main(String[] args) {
		FacebookAccount d = new FacebookAccount("Diana", "Cluj", 20);
		FacebookAccount z = new FacebookAccount("Zoican", "Cluj", 20);
		FacebookAccount m = new FacebookAccount("Malin", "Cluj", 20);
		FacebookAccount g = new FacebookAccount("Gabi", "Gherla", 20);
		
		d.adaugaPrieten(z);
		d.adaugaPrieten(g);
		d.adaugaPrieten(m);
		
		//d.afiseazaLista();
		
		//d.stergePrieten(z);
		
		//d.afiseazaLista();
		
		//d.cautaPrieteni("Gherla");
		
		d.cautaPrieteni("Cluj");
	}

}
