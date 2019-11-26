
public class ArrayTest {

	public static void main(String[] args) {
		int[] zile = new int[4];
		zile[1] = 5;
		zile[3] = 9;

		try {
			  if(zile[5] == 9)
				  System.out.println("noua");
		  }catch (ArrayIndexOutOfBoundsException exceptie) {
			  System.out.println("EXCEPTIE : Pozitia cu numarul " + exceptie.getMessage() + " nu exista in sir");
		  }
	}
}
