
public class AnBisect {
	
	public static boolean esteAnBisect(Integer an) {
		if(an % 4 != 0)
			return false;
		else if(an % 100 == 0 && an % 400 !=0)
			return false;
		else
			return true;
		}
}
