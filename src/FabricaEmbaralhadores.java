import java.io.FileNotFoundException;
import java.util.Random;

public class FabricaEmbaralhadores implements Embaralhador {
	
	public String aux = "";
	Random r = new Random();
	Random e = new Random();
	
	public String getEmbalhador(String palavra) throws FileNotFoundException {
		int i = e.nextInt(2);
		if (i == 1) {
			return EmbaralhaRand(palavra);
		} else {
			return EmbaralhaInverso(palavra);
		}
	}

	@Override
	public String EmbaralhaRand(String palavra) {
	    char a[] = palavra.toCharArray(); 
	    for( int i = 0 ; i< a.length-1 ; i++ ) {
	        int j = r.nextInt(a.length-1);
	        char temp = a[i]; 
	        a[i] = a[j];  
	        a[j] = temp;
	    }       
	    return new String(a);
	}

	@Override
	public String EmbaralhaInverso(String palavra) {
		for (int i = palavra.length()-1; i >= 0; i--) {
			aux += palavra.charAt(i);
		}
		return aux;
	}

}
