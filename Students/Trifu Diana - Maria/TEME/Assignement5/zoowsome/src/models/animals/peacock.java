package models.animals;

public class peacock extends Bird {
	public peacock(double a, double b){
		super(a, b);
    	this.nrOfLegs = 2;
    	this.name = "paun";
    	this.migrates = false;
    	this.avgFlightAltitude= 0;
    }
}
