
public class Clasa {
	 private int nrElevi;

	public int getNrElevi() {
		return nrElevi;
	}

	public void setNrElevi(int nrElevi) throws EcxeptieNumar {
		if(nrElevi < 14)
			throw new EcxeptieNumar("EXCEPTIE: numarul de elevi este prea mic");
		this.nrElevi = nrElevi;
	}
	 
	 
}
