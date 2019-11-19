package models.animals;

public class Fish extends Aquatic {
	public Fish(double a, double b){
		super(a, b);
    	this.nrOfLegs = 0;
    	this.name = "peste";
    	this.waterType = water.Freshwater;
    	this.avgSwimDepth= 11;
    }
}
