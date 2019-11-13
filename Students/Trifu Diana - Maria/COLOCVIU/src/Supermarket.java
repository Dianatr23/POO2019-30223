
public class Supermarket{
		private Angajat[] angajati;
		private ClientFidel[] clientiFideli;
		private Client[] clienti;
		private Produs[] produse;
		private int n;
		private int a;
		private int x;
		
		
		public Supermarket(Angajat[] a, ClientFidel[] cf, Client[] c, Produs[] p, int n, int s, int x) {
			this.angajati = a;
			this.clientiFideli = cf;
			this.clienti = c;
			this.produse = p;
			this.n = n;
			this.a = s;
			this.x = x;
		}
		
		public void addProdus(Produs p) {
			produse[n] = p;
			n++;
		}
		
		public void addAngajat(Angajat ang) {
			angajati[a] = ang;
			a++;
		}
		
		public void addClientFidel(ClientFidel c) {
			clientiFideli[x] = c;
			x++;
		}
		
		public void listClientiFideli() {
			int sorted = 0;
			int count = 0;
			ClientFidel c1;
			while(sorted == 0) {
				count = 0;
				for(int i=0 ; i<clientiFideli.length; i++) {
					if(clientiFideli[i].compareTo(clientiFideli[i+1]) == 1) {
						count++;
						c1 = clientiFideli[i];
						clientiFideli[i] = clientiFideli[i+1];
						clientiFideli[i+1] = c1;
					}
				}
			    if(count == 0)
			    	sorted = 1;
			}
			for(int i=0; i<clientiFideli.length; i++)
				System.out.println(clientiFideli[i].getNume());
		}
		
		
		public void listAngajati() {
			int sorted = 0;
			int count = 0;
			Angajat a1;
			while(sorted == 0) {
				count = 0;
				for(int i=0 ; i<angajati.length; i++) {
					if(angajati[i].compareTo(angajati[i+1]) == 1) {
						count++;
						a1 = angajati[i];
						angajati[i] = angajati[i+1];
						angajati[i+1] = a1;
					}
				}
			    if(count == 0)
			    	sorted = 1;
			}
			for(int i=0; i<angajati.length; i++)
				System.out.println(angajati[i].getNume());
		}
		
		public void showStatistics() {
			int pc = 0;
			int pcf = 0;
			for(int i=0; i<clienti.length; i++)
				pc = pc + clienti[i].getNrProd();
			for(int i=0; i<clientiFideli.length; i++)
				pcf = pcf + clientiFideli[i].getNrProd();
			
			System.out.println("Numarul de produse vandute clientilor fideli este " + pcf);
			System.out.println("Numarul de produse vandute clientilor este " + pc);	
		}
}
