package br.ufsc.das;

public class LancarExcecaoCartaoNaoReconhecido {

	public void lancarExcecao(CartaoCredito cartao) {

		throw new IllegalArgumentException("Nao foi possivel identificar a bandeira do cartao com numero " + cartao.getNumero());

	}

}
