package services.factories;
import models.animals.Animal;
import models.animals.Lizard;
import models.animals.Snake;
import models.animals.Turtle;

public class ReptileFactory extends Speciesfactory {
	public Animal getAnimal(String type) {
		Animal r = null;
		double b = 3;
		double c = 0.9;
		double d = 4.3;
		double e = 0.4;
		double f = 3;
		double g = 0.1;
		if (Constants.Animals.Reptile.Snake.equals(type)) {
			r = new Snake(b, c); // leave empty constructor, for now!
		} else if (Constants.Animals.Reptile.Lizard.equals(type)) {
			r = new Lizard(d, e);
		} else if (Constants.Animals.Reptile.Turtle.equals(type)) {
			r = new Turtle(f, g);
		} 
		return r;
	}

}
