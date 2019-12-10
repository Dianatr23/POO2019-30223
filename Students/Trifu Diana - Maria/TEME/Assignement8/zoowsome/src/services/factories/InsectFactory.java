package services.factories;
import models.animals.Animal;
import models.animals.Cockroach;
import models.animals.Butterfly;
import models.animals.Spider;

public class InsectFactory extends Speciesfactory {
	public Animal getAnimal(String type) {
		Animal i = null;
		double b = 1.45;
		double c = 0.8;
		double d = 1;
		double e = 0;
		double f = 2;
		double g = 0;
		if (Constants.Animals.Insect.Spider.equals(type)) {
			i = new Spider(b, c); // leave empty constructor, for now!
		} else if (Constants.Animals.Insect.Cockroach.equals(type)) {
			i = new Cockroach(d, e);
		} else if (Constants.Animals.Insect.Butterfly.equals(type)) {
			i =  new Butterfly(f, g);
		} 
		  return i;
		}
}
