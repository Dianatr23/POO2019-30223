
public class ClientFidel extends Client {
	private int nrPuncte;
	private int discount;
	
	public ClientFidel(String nume, int id, int nrProd, Produs[] prod) {
		super(nume, id, nrProd, prod);
	}
	
	public int calculeazaPuncte(Produs[] produse) {
		int puncte = 0;
		for(int i=0; i<produse.length; i++) {
			if(getProduse(i).getPret() > 10)
				puncte = puncte + (getProduse(i).getPret() / 10) * 3;
		}
		return puncte;
	}
	
	public int calculeazaDiscount() {
		int d = 0;
		if(this.calculeazaPuncte(this.getLista()) >= 10 && this.calculeazaPuncte(this.getLista()) < 30)
			d = 5;
		if(this.calculeazaPuncte(this.getLista()) >= 30 && this.calculeazaPuncte(this.getLista()) <50)
			d = 10;
		if(this.calculeazaPuncte(this.getLista()) >= 50)
			d = 15;
		return d;
	}
	
	public double calculeazaPlata() {
		double plata = 0;
		for(int i=0; i<getNrProd(); i++)
			plata = plata + getProduse(i).getPret();
		plata = plata - (plata * (double)(this.calculeazaDiscount()/100));
		return plata;
	}
	
	public int compareTo(ClientFidel x) {
		if(this.calculeazaPlata() > x.calculeazaPlata())
			return 1;
		else if(this.calculeazaPlata() == x.calculeazaPlata())
			return 0;
		else 
			return -1;
	}
	
	@Override
	public void showDetails() {
		System.out.println("Acesta este clientul fidel cu id-ul " +  getID() + "si se numeste " + getNume());
	}
}
