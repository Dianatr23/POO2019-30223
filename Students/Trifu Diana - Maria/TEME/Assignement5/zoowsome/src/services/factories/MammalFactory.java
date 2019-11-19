package services.factories;
import models.animals.Animal;
import models.animals.Cow;
import models.animals.Monkey;
import models.animals.Tiger;

public class MammalFactory extends Speciesfactory {
	public Animal getAnimal(String type){
		Animal m = null;
		double b = 7;
		double c = 0.2;
		double d = 5;
		double e = 0.3;
		double f = 4;
		double g = 0.95;
		if (Constants.Animals.Mammal.Cow.equals(type)) {
			m = new Cow(b, c);
		} else if (Constants.Animals.Mammal.Monkey.equals(type)) {
			m = new Monkey(d, e);
		} else if (Constants.Animals.Mammal.Tiger.equals(type)) {
			m = new Tiger(f, g);
		}
		return m;
	}
}

