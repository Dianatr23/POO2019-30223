package services.factories;
import models.animals.Animal;
import models.animals.peacock;
import models.animals.Flamingo;
import models.animals.Owl;

public class BirdFactory extends Speciesfactory {
	public Animal getAnimal(String type) {
		Animal b = null;
		if (Constants.Animals.Bird.Flamingo.equals(type)) {
			b = new Flamingo(); // leave empty constructor, for now!
		} else if (Constants.Animals.Bird.Owl.equals(type)) {
			b = new Owl();
		} else if (Constants.Animals.Bird.peacock.equals(type)) {
			b = new peacock();
		}
		return b;
		}
	}

