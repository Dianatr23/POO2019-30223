
public class Masina implements Cloneable{
	private String marca;
	private String culoare;
	
	public Masina(String a, String b) {
		this.marca = a;
		this.culoare = b;
	}
	
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getCuloare() {
		return culoare;
	}

	public void setCuloare(String culoare) {
		this.culoare = culoare;
	}
	
	@Override
	protected Masina clone() throws CloneNotSupportedException {
		return (Masina)super.clone();
	}
}
