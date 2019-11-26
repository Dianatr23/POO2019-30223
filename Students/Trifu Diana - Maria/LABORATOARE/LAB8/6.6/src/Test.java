
public class Test {

	public static void main(String[] args) throws ExceptieVarsta {
		Persoana p = new Persoana();
		p.setVarsta(15);
		
		try
		{
			p.f();
		}
		catch (ExceptieMinor e)
		{
			System.out.println("EXCEPTIE: " + e.getMessage());
		}

	}
}
