package services.factories;
import models.animals.Animal;

public abstract class Speciesfactory{
	public abstract Animal getAnimal(String type);
}
