package br.ufsc.das;

public class LancarExcecaoCartaoNaoReconhecido {

	public void lancarExcecao(CartaoCredito cartao) throws Exception {

//		throw new IllegalArgumentException("Nao foi possivel identificar a bandeira do cartao com numero " + cartao.getNumero());
		throw new Exception("Não foi possivel identificar a bandeira do cartao " + cartao.getNumero());
	}

}
