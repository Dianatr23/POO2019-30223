package services.factories;
import models.animals.Animal;
import models.animals.Shark;
import models.animals.Fish;
import models.animals.Dolphin;

public class AquaticFactory extends Speciesfactory {
	public Animal getAnimal(String type) {
		Animal a = null;
		double b = 3.5;
		double c = 0;
		double d = 4;
		double e = 0.99;
		double f = 5;
		double g = 0.1;
		if (Constants.Animals. Aquatic.Fish.equals(type)) {
		    a= new Fish(b, c); // leave empty constructor, for now!
		} else if (Constants.Animals. Aquatic.Shark.equals(type)) {
			a = new Shark(d, e);
		} else if (Constants.Animals. Aquatic.Dolphin.equals(type)) {
			a = new Dolphin(f, g);
		} 
		return a;
	}

}

