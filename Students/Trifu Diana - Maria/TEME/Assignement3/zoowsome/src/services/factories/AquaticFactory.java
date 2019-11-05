package services.factories;
import models.animals.Animal;
import models.animals.Shark;
import models.animals.Fish;
import models.animals.Dolphin;

public class AquaticFactory extends Speciesfactory {
	public Animal getAnimal(String type) {
		Animal a = null;
		if (Constants.Animals. Aquatic.Fish.equals(type)) {
		    a= new Fish(); // leave empty constructor, for now!
		} else if (Constants.Animals. Aquatic.Shark.equals(type)) {
			a = new Shark();
		} else if (Constants.Animals. Aquatic.Dolphin.equals(type)) {
			a = new Dolphin();
		} 
		return a;
	}

}

