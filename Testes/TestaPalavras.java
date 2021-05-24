import static org.junit.Assert.*;
import java.io.FileNotFoundException;

import org.junit.Test;


public class TestaPalavras {

	FabricaMecanicaDoJogo fmj = new FabricaMecanicaDoJogo();
	FabricaEmbaralhadores e = new FabricaEmbaralhadores();

	@Test
	public void testaStringVazia() throws FileNotFoundException {
		String palavra = fmj.getPalavra();
		assertFalse(palavra.isEmpty());
	}

	@Test
	public void testaStringVaziaEmbaralhada() throws FileNotFoundException {
		String embaralhada = fmj.getEmbaralhada();
		assertFalse(embaralhada.isEmpty());
	}
	
	@Test
	public void testaEmbaralhadorInverso() throws FileNotFoundException {
		String palavra = fmj.getPalavra();
		String embaralhada = e.EmbaralhaInverso(palavra);
		assertFalse(embaralhada.isEmpty());
	}
	
	@Test
	public void testaEmbaralhadorRand() throws FileNotFoundException {
		String palavra = fmj.getPalavra();
		String embaralhada = e.EmbaralhaRand(palavra);
		assertFalse(embaralhada.isEmpty());
	}
}
