public class Student implements Cloneable{
	private String nume;
	private String prenume;
	private Masina masina;
	
	public Student(String nume, String prenume, Masina m) {
		this.nume = nume;;
		this.prenume = prenume;
		this.masina = m;
	}

	protected Student clone() throws CloneNotSupportedException {
		Student student = (Student)super.clone();
		
	student.masina = masina.clone();
	
		return student;
	}
	
	public String getNume() {
		return nume;
	}
	public String getPrenume() {
		return prenume;
	}
	public Masina getMasina() {
		return masina;
	}
	public void setCar(Masina m) {
		this.masina = m;
	}

	public String toString() {
		return "Studentul " + this.nume + " " +this.prenume + " detine masina " + masina.getMarca() + " de culoare " + masina.getCuloare();
	}
	
}
