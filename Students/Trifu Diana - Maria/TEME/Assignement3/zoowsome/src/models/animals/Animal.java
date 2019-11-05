package models.animals;

public abstract class Animal {
	public Integer nrOfLegs;
	public String name;
	
	public int getNrOfLegs(Animal a) {
		return this.nrOfLegs;
	}
	public void setNrOfLegs(Animal a, int nr) {
		this.nrOfLegs = nr;
	}
	public String getName(Animal a) {
		return this.name;
	}
	public void setName(Animal a, String nume) {
		this.name = nume;
	}
}

	