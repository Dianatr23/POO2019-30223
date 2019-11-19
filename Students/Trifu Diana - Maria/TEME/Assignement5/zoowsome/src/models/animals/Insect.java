package models.animals;

public abstract class Insect extends Animal{
	public Boolean canFly;
	public Boolean isDangerous;
	public Insect(double a, double b) {
		super(a, b);
	}
}
