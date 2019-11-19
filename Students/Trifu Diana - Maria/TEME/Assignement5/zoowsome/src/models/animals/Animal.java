package models.animals;
import java.util.Random;


public abstract class Animal implements Killer{
	public Integer nrOfLegs;
	public String name;
	final double maintainanceCost;
	final double dangerPerc;
	private boolean takenCareOf = false;
	
	public Animal(double val, double vall) {
		maintainanceCost = val;
		dangerPerc = vall;
	}
	
	public double getMaintainanceCost() {
		return this.maintainanceCost;
	}
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
	public boolean kill(){
		Random rand = new Random();
		double i = rand.nextDouble();
		if(this.dangerPerc > i)
			return true;
		else 
			return false;	
	}

	public boolean isTakenCareOf() {
		return takenCareOf;
	}

	public void setTakenCareOf(boolean takenCareOf) {
		this.takenCareOf = takenCareOf;
	}
}

	