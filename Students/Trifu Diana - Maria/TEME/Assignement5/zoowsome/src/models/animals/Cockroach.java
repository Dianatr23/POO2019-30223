package models.animals;

public class Cockroach extends Insect {
	public Cockroach(double a, double b){
		super(a, b);
    	this.nrOfLegs = 12;
    	this.name = "gandac";
    	this.canFly = false;
    	this.isDangerous = false;
    }
}
