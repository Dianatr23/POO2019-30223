
public class Client extends Persoana{
	private int nrProduseCumparate;
	private Produs[] produse;
	
	public Client(String nume, int id, int nrProd, Produs[] prod) {
		super(nume, id);
		this.nrProduseCumparate = nrProd;
		this.produse = prod;
	}
	
	
	public int getNrProd() {
		return nrProduseCumparate;
	}
	

	public Produs getProduse(int i) {
			return produse[i];
	}
	
	public Produs[] getLista() {
		return produse;
	}

	public void setProduse(Produs[] produse) {
		this.produse = produse;
	}
	
	@Override
	public void showDetails() {
		System.out.println("Acesta este clientul cu id-ul " +  getID() + "si se numeste " + getNume());
	}

}
