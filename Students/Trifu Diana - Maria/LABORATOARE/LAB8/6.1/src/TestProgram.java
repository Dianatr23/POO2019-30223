
public class TestProgram {

	public static void main(String[] args) {
		 Zi luni = new Zi("Luni", "lucratoare");
		 Zi marti = new Zi("Marti", "lucratoare");
		 Zi miercuri = new Zi("Miercuri", "lucratoare");
		 Zi joi = new Zi("Joi", "lucratoare");
		 Zi vineri = new Zi("Vineri", "lucratoare");
		 Zi sambata = new Zi("Sambata", "nelucratoare");
		 Zi duminica = new Zi("Duminica", "nelucratoare");

		 Zi[] zile = new Zi[7];
		 zile[0] = luni;
		 zile[1] = marti;
		 zile[2] = miercuri;
		 zile[3] = joi;
		 zile[4] = vineri;
		 zile[5] = sambata;
		 zile[6] = duminica;
		 
		 CalendarLucru c1 = new CalendarLucru(zile);
		
		  Lucrator l1 = new Lucrator("Alex", c1);
		  Lucrator l2 = new Lucrator("Dan", c1);
		  
		  try {
			  l1.lucreaza("Joi");
		  }catch (ExceptieZiNelucratoare exceptie) {
			  System.out.println("Exceptie: " + exceptie.getMessage());
		  }
		  
		  try {
			  l1.lucreaza("Sambata");
		  }catch (ExceptieZiNelucratoare exceptie) {
			  System.out.println("Exceptie: " + exceptie.getMessage());
		  }
		  
		  try {
			  l2.lucreaza("Marte");
		  }catch (ExceptieZiNelucratoare exceptie) {
			  System.out.println("Exceptie: " + exceptie.getMessage());
		  }
		  
		  try {
			  l2.lucreaza("Luni");
		  }catch (ExceptieZiNelucratoare exceptie) {
			  System.out.println("Exceptie: " + exceptie.getMessage());
		  }
	}

}
