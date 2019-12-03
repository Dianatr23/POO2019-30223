
public class LongMatrix extends GenericMatrix <Long>{
	
	@Override // Aduna doi long
 	protected Long add(Long m1, Long m2) {
	 	return m1 + m2;
    }
 
 	@Override // Inmulteste doi long 
 	protected Long multiply(Long o1, Long o2) {
 		return o1 * o2;
 	}
 
 	@Override // Specifica zero pentru un double 
 	protected Long zero() {
 		return 0L;
 	}
}

