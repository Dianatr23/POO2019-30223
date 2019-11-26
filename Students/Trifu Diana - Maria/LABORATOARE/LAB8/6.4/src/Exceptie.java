
public class Exceptie {

	public static void main(String[] args) {
		
		try
		{
			Exception e = new Exception("String");
		}
		catch(Exception e)
		{
				  System.out.println("Exceptie: " +  e.getMessage());
		}
		finally
		{
			System.out.println("Finalul programului");
		}

	}

}
