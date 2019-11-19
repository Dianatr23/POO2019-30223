package models.animals;

public class Dolphin extends Aquatic {
	public Dolphin(double a, double b){
		super(a, b);
    	this.nrOfLegs = 0;
    	this.name = "delfin";
    	this.avgSwimDepth = 14;
    	this.waterType= water.Saltywater;
    }
}
