package br.ufsc.das;

public class TratarCartao {

	public CartaoCredito tratarFormulario(String numero) {

		CartaoCredito cartao = new CartaoCredito();

		cartao.setNumero(numero);

		return cartao;
	}

}
