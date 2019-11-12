package obiecte;
public class Manual extends Rechizita {
	@Override
	public String getNume() {
		return this.getEticheta().concat(" MANUAL");
	}
}
