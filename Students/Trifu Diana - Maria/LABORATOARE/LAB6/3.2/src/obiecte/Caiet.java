package obiecte;

public class Caiet extends Rechizita {
	@Override
	public String getNume() {
		return this.getEticheta().concat(" CAIET");
	}
}
