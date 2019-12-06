package br.ufsc.das;

import java.util.Map;


public class TratarCompra {

	public Pedido tratarRequisicao(Map<String, String> params) {
//		System.out.println(params);
		
		Pedido pedido = new Pedido();

		String quantidadeReatorArk = params.get("QRA");
		String quantidadeReatorSolar = params.get("QRS");
		String quantidadeRoboDomestico = params.get("RBD");
		String quantidadeRoboSeguranca = params.get("RBS");
		String quantidadeRoboMedico = params.get("RBM");
		String nome = params.get("nome");
		String cep = params.get("cep");
		String cartao = params.get("cartao");
		String dataValidade = params.get("validade");

		int qReatorArk = 0;
		int qReatorSolar = 0;
		int qRoboDomestico = 0;
		int qRoboSeguranca = 0;
		int qRoboMedico = 0;
		
		int qRA = Integer.parseInt(quantidadeReatorArk);
		int qRS = Integer.parseInt(quantidadeReatorSolar);
		
		int qRobD = Integer.parseInt(quantidadeRoboDomestico);
		int qRobS = Integer.parseInt(quantidadeRoboSeguranca);
		int qRobM = Integer.parseInt(quantidadeRoboMedico);

		if (qRA > 0) {
			qReatorArk = qRA;
		}

		if (qRS > 0) {
			qReatorSolar = qRS;
		}

		if (qRobD > 0) {
			qRoboDomestico = qRobD;
		}

		if (qRobS > 0) {
			qRoboSeguranca = qRobS;
		}

		if (qRobM > 0) {
			qRoboMedico = qRobM;
		}
		
		// preencher beans com os itens
		pedido.setQtdReatorArk(qReatorArk);
		pedido.setQtdReatorSolar(qReatorSolar);
		pedido.setQtdRoboDomestico(qRoboDomestico);
		pedido.setQtdRoboSeguranca(qRoboSeguranca);
		pedido.setQtdRoboMedico(qRoboMedico);
		pedido.setCliente(nome);
		pedido.setCep(cep);
		pedido.setCartao(cartao);
		pedido.setDataValidade(dataValidade);
			
		return pedido;
	}

	public String print() {
		System.out.println("Test Print");
		return "Test Return";
	}
	
}