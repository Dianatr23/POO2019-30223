package controllers;
import models.animals.Animal;
import services.factories.Speciesfactory;
import services.factories.AnimalFactory;
import services.factories.Constants;

public class MainController {

	public static void main(String[] args) {
		AnimalFactory abstractFactory = new AnimalFactory();
		Speciesfactory speciesFactory1 = abstractFactory.getSpeciesfactory(Constants.Species.Mammals);
		Animal a1 = speciesFactory1.getAnimal(Constants.Animals.Mammal.Cow);
		System.out.printf("We have an animal with " + a1.getNrOfLegs(a1) + " legs");
	}
}
