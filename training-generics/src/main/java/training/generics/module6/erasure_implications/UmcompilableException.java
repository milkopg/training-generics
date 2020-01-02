package training.generics.module6.erasure_implications;

public class UmcompilableException /*<T>*/ extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3968325119138381560L;

	public static void main(String[] args) {
		try {
			throw new UmcompilableException();
		} catch (UmcompilableException/*<T>*/ e) {
			e.printStackTrace();
		}
	}

}
