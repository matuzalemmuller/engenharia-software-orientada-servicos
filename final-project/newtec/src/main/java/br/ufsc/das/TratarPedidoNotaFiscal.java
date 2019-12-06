package br.ufsc.das;

import java.util.Map;


public class TratarPedidoNotaFiscal {

	public Pedido tratarRequisicao(Map<String, String> params) {
		
		Pedido pedido = new Pedido();

		String nome = params.get("cliente");
		String cpf = params.get("cpf").toString();
		String telefone = params.get("telefone").toString();
		
		String rua = params.get("rua");	
		String cep = String.valueOf(params.get("cep"));
		String cidade = params.get("cidade");
		String bairro = params.get("bairro");
		String estado = params.get("estado");
		String frete = String.valueOf(params.get("custoFrete"));
				
		String quantidadeReatorArk = String.valueOf(params.get("qtdReatorArk"));
		String quantidadeReatorSolar = String.valueOf(params.get("qtdReatorSolar"));
		String quantidadeRoboDomestico = String.valueOf(params.get("qtdRoboDomestico"));
		String quantidadeRoboSeguranca = String.valueOf(params.get("qtdRoboSeguranca"));
		String quantidadeRoboMedico = String.valueOf(params.get("qtdRoboMedico"));
		
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
		pedido.setCliente(nome);
		pedido.setCpf(cpf);
		pedido.setTelefone(telefone);

		pedido.setRua(rua);
		pedido.setCep(cep);
		pedido.setCidade(cidade);
		pedido.setBairro(bairro);
		pedido.setEstado(estado);
		pedido.setCustoFrete(frete);

		pedido.setQtdReatorArk(qReatorArk);
		pedido.setQtdReatorSolar(qReatorSolar);
		pedido.setQtdRoboDomestico(qRoboDomestico);
		pedido.setQtdRoboSeguranca(qRoboSeguranca);
		pedido.setQtdRoboMedico(qRoboMedico);	
			
		return pedido;
	}

	public String print() {
		System.out.println("Test Print");
		return "Test Return";
	}
	
}