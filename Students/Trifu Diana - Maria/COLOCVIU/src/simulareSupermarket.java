
public class simulareSupermarket {

	public static void main(String[] args) {
		Angajat[]  a= new Angajat[3];
		Client[] c = new Client[3];
		ClientFidel[] cf = new ClientFidel[3];
		Produs[] p = new Produs[3];
		
		Supermarket magazin = new Supermarket(a, cf, c, p, 0, 0, 0);
		Produs[] produseDiana = new Produs[3];
		ClientFidel cf1 = new ClientFidel("Diana", 2, 2, produseDiana);
		Angajat a1 = new Angajat("Miruna", 3, 0);
		Produs p1 = new Produs("paine", 3, 1);
		
		magazin.addClientFidel(cf1);
		magazin.addAngajat(a1);
		magazin.addProdus(p1);
		
		magazin.listAngajati();
		magazin.listClientiFideli();
	}

}
