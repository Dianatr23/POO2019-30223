package models.animals;

public class Owl extends Bird {
	public Owl(double a, double b){
		super(a, b);
    	this.nrOfLegs = 2;
    	this.name = "bufnita";
    	this.migrates = true;
    	this.avgFlightAltitude= 10;
    }
}
