
public class Cage {
	private int numar;
	private int greutatePermisa;
	private boolean disponibilitate;
	
	public Cage(int nr, int greutate) {
		this.numar = nr;
		this.greutatePermisa = greutate;
		this.disponibilitate = true;
	}

	public int getGreutatePermisa() {
		return greutatePermisa;
	}

	public int getNumar() {
		return numar;
	}
	
	public void setDisponibiltate() {
		this.disponibilitate = false;
	}
	
	public boolean ocupaCusca(int greutate) {
		boolean verdict = false;
		if(greutate > this.getGreutatePermisa())
			verdict = false;
		else if(greutate <= this.getGreutatePermisa()) 
			verdict = true;
		return verdict;		
	}
	
	public void elibereazaCusca() {
		if(this.disponibilitate == false)
			this.disponibilitate = true;
	}

	public boolean isDisponibilitate() {
		return disponibilitate;
	}
}

