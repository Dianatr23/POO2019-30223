package services.factories;
import models.animals.Animal;
import models.animals.peacock;
import models.animals.Flamingo;
import models.animals.Owl;

public class BirdFactory extends Speciesfactory {
	public Animal getAnimal(String type) {
		Animal b = null;
		double c = 3;
		double d = 0.15;
		double e = 3.7;
		double f = 0.1;
		double g = 7;
		double h = 0.2;
		if (Constants.Animals.Bird.Flamingo.equals(type)) {
			b = new Flamingo(c, d); // leave empty constructor, for now!
		} else if (Constants.Animals.Bird.Owl.equals(type)) {
			b = new Owl(e, f);
		} else if (Constants.Animals.Bird.peacock.equals(type)) {
			b = new peacock(g, h);
		}
		return b;
		}
	}

