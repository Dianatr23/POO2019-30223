package controllers;
import models.animals.Animal;
import services.factories.Speciesfactory;
import services.factories.AnimalFactory;
import services.factories.CaretakerFactory;
import services.factories.Constants;
import services.factories.EmployeeFactory;
import models.employees.Employee;
import models.employees.Caretaker;
import java.math.BigDecimal;

public class MainController {

	public static void main(String[] args) {
		AnimalFactory abstractFactory = new AnimalFactory();
		Speciesfactory speciesFactory1 = abstractFactory.getSpeciesfactory(Constants.Species.Mammals);
		Speciesfactory speciesFactory2 = abstractFactory.getSpeciesfactory(Constants.Species.Aquatics);
		Speciesfactory speciesFactory3 = abstractFactory.getSpeciesfactory(Constants.Species.Insects);
		
		Animal a1 = speciesFactory1.getAnimal(Constants.Animals.Mammal.Cow);
		Animal a2 = speciesFactory2.getAnimal(Constants.Animals.Aquatic.Shark);
		Animal a3 = speciesFactory3.getAnimal(Constants.Animals.Insect.Butterfly);
		Animal a4 = speciesFactory1.getAnimal(Constants.Animals.Mammal.Tiger);
		
		
		System.out.printf("We have an animal with " + a1.getNrOfLegs(a1) + " legs");
		
		//ZOO PART II
		long[] idList = new long[20];
		int n = 0;
		
		Animal[] animale = new Animal[5];
		int indexx = 4;
		animale[0] = a1;
		animale[1] = a2;
		animale[2] = a3;
		animale[3] = a4;
		
		BigDecimal salary1 = new BigDecimal("2156");
		BigDecimal salary2 = new BigDecimal("1856");
		
		Caretaker c1 = new Caretaker("Diana", salary1, false);
		Caretaker c2 = new Caretaker("Gabi", salary2, false);
		
		Caretaker[] ingrijitori = new Caretaker[5];
		int index = 2;
		ingrijitori[0] = c1;
		ingrijitori[1] = c2;
		
		ingrijitori[0].generateID(idList, n);
		ingrijitori[1].generateID(idList, n);
		
		String result = null;
		
		for(int i=0; i<index; i++)
		{
			for(int j=0; j<indexx; j++)
			{
				if(ingrijitori[i].isDead() == false && animale[j].isTakenCareOf())
				{
					result = ingrijitori[0].takeCareOf(animale[j]);
					if(result.contentEquals(Constants.Employees.Caretakers.TCO_KILLED))
					{
						ingrijitori[i].setDead(true);
					}
				}
				else if(result.contentEquals(Constants.Employees.Caretakers.TCO_NO_TIME))
				{
					j++;
				}
				else
				{
					animale[j].setTakenCareOf(true);
				}
			}
		}
	}
}
