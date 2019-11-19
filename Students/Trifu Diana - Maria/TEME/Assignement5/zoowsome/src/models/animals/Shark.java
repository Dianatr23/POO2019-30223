package models.animals;

public class Shark extends Aquatic {
	public Shark(double a, double b){
		super(a, b);
    	this.nrOfLegs = 0;
    	this.name = "rechin";
    	this.waterType = water.Saltywater;
    	this.avgSwimDepth= 40;
    }
}
