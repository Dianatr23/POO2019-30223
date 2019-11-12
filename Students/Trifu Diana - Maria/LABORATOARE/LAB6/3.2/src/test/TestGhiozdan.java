package test;
import obiecte.Caiet;
import obiecte.Ghiozdan;
import obiecte.Manual;
import obiecte.Rechizita;

public class TestGhiozdan {

	public static void main(String[] args) {
		
		Rechizita[] rechizite = new Rechizita[10];
		int nrRechizite = 5;
		rechizite[0] = new Manual();
		rechizite[1] = new Caiet();
		rechizite[2] = new Manual();

		Caiet c1 = new Caiet();
		Caiet c2 = new Caiet();
		Manual manual = new Manual();

		Ghiozdan ghiozdanulMeu = new Ghiozdan(rechizite, nrRechizite);
		ghiozdanulMeu.add(c1);
		ghiozdanulMeu.add(c2);
		ghiozdanulMeu.add(manual);

		System.out.println("Eu am in ghiozdan " + ghiozdanulMeu.getNrRechizite() + " rechizite");
		System.out.println("Eu am in ghiozdan " + ghiozdanulMeu.getNrManuale() + " manuale");
		System.out.println("Eu am in ghiozdan " + ghiozdanulMeu.getNrCaiete()+ " caiete");

		System.out.println("Rechizite: ");
		ghiozdanulMeu.listItems();
		System.out.println();

		System.out.println("Caiete: ");
		ghiozdanulMeu.listCaiet();

		System.out.println();
		System.out.println("Manuale: ");
		ghiozdanulMeu.listManual();
	}

}
