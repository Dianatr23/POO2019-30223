
public class TestClasa {

	public static void main(String[] args) {
		Clasa clasa = new Clasa();
		
		try
		{
		clasa.setNrElevi(10);
		}
		catch (EcxeptieNumar e)
		{
			System.out.println(e.getMessage());
		}
		finally
		{
			System.out.println("Finalul programului");
		}

	}

}
