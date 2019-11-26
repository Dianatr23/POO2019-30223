
public class TestPointer {

	public static void main(String[] args) {
		Persoana p = new Persoana();
		p = null;
		
		try {
			System.out.println(p.toString());
		}catch(NullPointerException exceptie) {
			  System.out.println("Exceptie: " + exceptie.getMessage());
		  }
	}

}
