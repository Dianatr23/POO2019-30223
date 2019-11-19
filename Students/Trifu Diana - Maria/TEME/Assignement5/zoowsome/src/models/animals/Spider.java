package models.animals;

public class Spider extends Insect{
	public Spider(double a, double b){
		super(a, b);
    	this.nrOfLegs = 8;
    	this.name = "paianjen";
    	this.canFly = false;
    	this.isDangerous = true;
    }
}
