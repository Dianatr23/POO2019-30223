import java.util.ArrayList;
import java.util.List;

public class TestPetHotel {

	public static void main(String[] args) {
		
		List<Dog> cainiDeCazat = new ArrayList();
		List<Cage> custiHotel = new ArrayList();
		
		Dog d1 = new Dog("Maya", "Lagotto", 17);
		Dog d2 = new Dog("Zeus", "Labrador", 30);
		Dog d3 = new Dog("Lucky", "Foxterier", 10);
		
		Cage c1 = new Cage(1, 15);
		Cage c2 = new Cage(2, 40);
		Cage c3 = new Cage(3, 10);
		
		custiHotel.add(c1);
		custiHotel.add(c2);
		custiHotel.add(c3);
		
		cainiDeCazat.add(d1);
		cainiDeCazat.add(d2);
		cainiDeCazat.add(d3);
		
		for(Dog d : cainiDeCazat) {
			for(Cage c : custiHotel) {
				d.cazeazaCaine(c);
			}
		}
		
		for(Dog d : cainiDeCazat)
		{
			if(d.getNumar() == 0)
				System.out.println("Momentan nu a fost gasita nicio cusca disponibila pentru " + d.getNume());
			else
				System.out.println(d.getNume() + " este cazat in cusca cu numarul " + d.getNumar());
		}
	}

}
