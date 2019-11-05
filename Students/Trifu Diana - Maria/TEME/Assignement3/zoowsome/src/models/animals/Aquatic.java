package models.animals;
enum water{
	Saltywater, Freshwater;
}
public abstract class Aquatic extends Animal {
	public Integer avgSwimDepth;
	public Enum waterType;
}
