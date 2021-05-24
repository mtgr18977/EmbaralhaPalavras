import java.io.FileNotFoundException;

public interface MecanicaDoJogo {
	void infinito(String resposta) throws FileNotFoundException;
	void tipoDeJogo(int tipoDeJogo) throws FileNotFoundException;
	void morteSubita(String resposta) throws FileNotFoundException;
}