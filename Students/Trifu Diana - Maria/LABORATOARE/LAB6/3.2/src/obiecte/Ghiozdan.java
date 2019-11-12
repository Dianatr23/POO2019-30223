package obiecte;

public class Ghiozdan {
	private Rechizita[] rechizite;
	private int nrRechizite = 0;

	public Ghiozdan(Rechizita[] rechizite, int nr) {
		this.rechizite = rechizite;
		this.nrRechizite = nr;
	}
	
	public void add(Caiet caiet) {
		rechizite[nrRechizite] = caiet;
		nrRechizite++;
	}

	public void add(Manual manual) {
		rechizite[nrRechizite] = manual;
		nrRechizite++;
	}
	
	public void listItems() {
		for (int i = 0; i < this.nrRechizite; i++)
			System.out.println(this.rechizite[i].getNume());
		}
	
	public void listManual() {
		for (int i = 0; i < this.nrRechizite; i++)
			if (rechizite[i] instanceof Manual)
				System.out.println(rechizite[i].getNume());
	}
	
	public void listCaiet() {
			for (int i = 0; i < this.nrRechizite; i++)
				if (rechizite[i] instanceof Caiet)
					System.out.println(rechizite[i].getNume());
		}

	
	public int getNrManuale() {
		int count = 0;
		for (int i = 0; i < this.nrRechizite; i++)
			if (rechizite[i] instanceof Manual)
				count++;
		return count;	
	}
	
	public int getNrCaiete() {
		int count = 0;
		for (int i = 0; i < this.nrRechizite; i++)
			if (rechizite[i] instanceof Caiet)
				count++;
		return count;		
	}
	
	public int getNrRechizite() {
		return getNrCaiete() + getNrManuale();
	}
	
	
}
