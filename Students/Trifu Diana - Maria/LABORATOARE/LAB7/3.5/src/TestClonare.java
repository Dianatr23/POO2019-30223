
public class TestClonare {

	public static void main(String[] args) {
		Masina car = new Masina("Renault", "gri");
		Student student = new Student("Trifu", "Diana", car);
		
		System.out.println(student.toString());

		try {
		Student studentClona =student.clone();
			System.out.println("Am realizat clona: " + studentClona.getNume() + " " + studentClona.getPrenume() + " care are o masina " + studentClona.getMasina().getMarca() + " de culoare " + studentClona.getMasina().getCuloare());
			
		studentClona.getMasina().setCuloare("neagra");
		System.out.println("**Am revopsit masina studentului clonat**");
		
		System.out.println(studentClona.toString());


		} catch(CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}

}
