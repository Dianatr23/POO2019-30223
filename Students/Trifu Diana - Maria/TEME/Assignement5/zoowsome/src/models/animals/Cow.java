package models.animals;

public class Cow extends Mammal {
	public Cow(double a, double b){
		super(a, b);
    	this.nrOfLegs = 4;
    	this.name = "vaca";
    	this.normalBodyTemperature = 40.1F;
    	this.percBodyHair= 96.2F;
	}
}
