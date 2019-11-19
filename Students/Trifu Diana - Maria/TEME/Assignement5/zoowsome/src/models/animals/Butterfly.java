package models.animals;

public class Butterfly extends Insect {
	public Butterfly(double a, double b){
		super(a, b);
		this.nrOfLegs = 8;
    	this.canFly = true;
    	this.name = "fluture";
    	this.isDangerous = false;
    }
}
