package services.factories;
import models.animals.Animal;
import models.animals.Cockroach;
import models.animals.Butterfly;
import models.animals.Spider;

public class InsectFactory extends Speciesfactory {
	public Animal getAnimal(String type) {
		Animal i = null;
		if (Constants.Animals.Insect.Spider.equals(type)) {
			i = new Spider(); // leave empty constructor, for now!
		} else if (Constants.Animals.Insect.Cockroach.equals(type)) {
			i = new Cockroach();
		} else if (Constants.Animals.Insect.Butterfly.equals(type)) {
			i =  new Butterfly();
		} 
		  return i;
		}
}
