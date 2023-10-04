package main;

public class PadraoSingleton {
	
	  private static PadraoSingleton INSTANCE;
	  public String value;

	  private PadraoSingleton(String value) {
		  this.value = value;
	  }

	  public static PadraoSingleton getInstance(String value) {
			PadraoSingleton result = INSTANCE;
			if (result != null) {
			    return result;
			}
			synchronized(PadraoSingleton.class) {
			    if (INSTANCE == null) {
			    	INSTANCE = new PadraoSingleton(value);
			    }
			    return INSTANCE;    
	       }
	 }


}