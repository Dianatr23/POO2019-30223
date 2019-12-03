
public class DoubleMatrix extends GenericMatrix <Double>{
	
	@Override // Aduna doi double
 	protected Double add(Double m1, Double m2) {
	 	return m1 + m2;
    }
 
 	@Override // Inmulteste doi double 
 	protected Double multiply(Double o1, Double o2) {
 		return o1 * o2;
 	}
 
 	@Override // Specifica zero pentru un double 
 	protected Double zero() {
 		return 0.0;
 	}
}
