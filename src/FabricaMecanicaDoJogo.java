import java.io.FileNotFoundException;

public class FabricaMecanicaDoJogo implements MecanicaDoJogo {
	
	static int pontuacao;
	FabricaEmbaralhadores fe = new FabricaEmbaralhadores();
	BancoDePalavras bp = new BancoDePalavras();
	String palavra;
	String resposta;
	public boolean morteSubita = false;
	
	public boolean pegaMorteSubita () {
		return morteSubita;
	}
	
	public String pegaResposta(String resposta) {
		this.resposta = resposta;
		return resposta;
	}
	
	public int getPontucao() {
		return pontuacao;
	}
	
	public String getPalavra () throws FileNotFoundException {
		palavra = bp.retornaPalavra();
		return palavra;
	}
	
	public String getEmbaralhada() throws FileNotFoundException {
		String palavraEmbaralhada;
		palavraEmbaralhada = fe.getEmbalhador(this.getPalavra());
		return palavraEmbaralhada;
	}
	
	@Override
	public void tipoDeJogo(int tipoDeJogo) throws FileNotFoundException {
		if (tipoDeJogo == 1) {
			morteSubita(pegaResposta(resposta));
		}
		if (tipoDeJogo == 2) {
			infinito(pegaResposta(resposta));
		}
	}

	@Override
	public void infinito(String resposta) throws FileNotFoundException {
		if (resposta.equals("sair")){
			System.out.println("Tchau ...");
		}
		if (palavra.equals(resposta)) {
			System.out.println("Voce acertou! +1 ponto");
			pontuacao++;
		} else {
			System.out.println("Resposta: "+palavra);
		}
	}

	@Override
	public void morteSubita(String resposta) throws FileNotFoundException {
		if (palavra.equals(resposta)) {
			System.out.println("Voce acertou! +1 ponto");
			pontuacao++;
		} else {
			System.out.println("Resposta: "+palavra);
			System.out.println("Voce errou ...");
			morteSubita = true;
			System.out.println("Voce perdeu =(");
		}
	}
}
