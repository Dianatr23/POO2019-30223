package services.factories;
import models.animals.Animal;
import models.animals.Lizard;
import models.animals.Snake;
import models.animals.Turtle;

public class ReptileFactory extends Speciesfactory {
	public Animal getAnimal(String type) {
		Animal r = null;
		if (Constants.Animals.Reptile.Snake.equals(type)) {
			r = new Snake(); // leave empty constructor, for now!
		} else if (Constants.Animals.Reptile.Lizard.equals(type)) {
			r = new Lizard();
		} else if (Constants.Animals.Reptile.Turtle.equals(type)) {
			r = new Turtle();
		} 
		return r;
	}

}
