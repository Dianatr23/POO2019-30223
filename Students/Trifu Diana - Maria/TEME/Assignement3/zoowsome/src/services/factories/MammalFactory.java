package services.factories;
import models.animals.Animal;
import models.animals.Cow;
import models.animals.Monkey;
import models.animals.Tiger;

public class MammalFactory extends Speciesfactory {
	public Animal getAnimal(String type){
		Animal m = null;
		if (Constants.Animals.Mammal.Cow.equals(type)) {
			m = new Cow();
		} else if (Constants.Animals.Mammal.Monkey.equals(type)) {
			m = new Monkey();
		} else if (Constants.Animals.Mammal.Tiger.equals(type)) {
			m = new Tiger();
		}
		return m;
	}
}

