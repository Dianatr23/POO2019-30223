package models.animals;

public class Flamingo extends Bird {
	public Flamingo(double a, double b){
		super(a, b);
    	this.nrOfLegs = 2;
    	this.name = "flamingo";
    	this.migrates = false;
    	this.avgFlightAltitude= 2;
    }
}
