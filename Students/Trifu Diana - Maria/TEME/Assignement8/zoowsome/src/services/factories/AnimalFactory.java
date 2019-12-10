package services.factories;
import services.factories.Speciesfactory;
import services.factories.AquaticFactory;
import services.factories.BirdFactory;
import services.factories.InsectFactory;
import services.factories.ReptileFactory;
import services.factories.MammalFactory;

public class AnimalFactory{
	public Speciesfactory getSpeciesfactory(String type) {
		if (Constants.Species.Mammals.equals(type)) {
			return new MammalFactory();
		} else if (Constants.Species.Reptiles.equals(type)) {
			return new ReptileFactory();
		} else if (Constants.Species.Birds.equals(type)) {
			return new BirdFactory();
		} else if (Constants.Species.Insects.equals(type)) {
			return new InsectFactory();
		} else if (Constants.Species.Aquatics.equals(type)) {
			return new AquaticFactory();
		} 
		return null;

	}
}
