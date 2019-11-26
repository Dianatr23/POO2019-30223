
public class Persoana {
	private int varsta;

	public int getVarsta() {
		return varsta;
	}

	public void setVarsta(int varsta) {
		this.varsta = varsta;
	}
	
	
	public void f() throws ExceptieVarsta, ExceptieMinor {
		try 
		{
			g()  ;
		}
		catch (ExceptieVarsta exceptie)
		{
			System.out.println(exceptie.getMessage());
			if(this.getVarsta() < 18) {
				throw new ExceptieMinor("persoana e minora");
			}
		}
	}
	
	public void g() throws ExceptieVarsta{
		if(this.getVarsta() % 2 != 0)
			throw new ExceptieVarsta("EXCEPTIE: varsta persoanei nu este un numar par");
	}
	
}
