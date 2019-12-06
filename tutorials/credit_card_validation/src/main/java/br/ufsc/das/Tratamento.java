package br.ufsc.das;

import java.util.Map;

public class Tratamento {

	public CartaoCredito tratarFormulario(Map<String, String> params) {
		
		System.out.println(params);

		CartaoCredito cartao = new CartaoCredito();

		cartao.setNumero(params.get("numeroCartao"));

		return cartao;
	}

}
