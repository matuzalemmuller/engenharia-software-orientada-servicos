package br.ufsc.das;

import java.io.Serializable;

public class Pedido implements Serializable {

	private static final long serialVersionUID = 1L;

	private int codigo;
	private String cliente;
	private String cpf;
	private String telefone;
	private String email;
	
	private String cep;
	private String estado;
	private String cidade;
	private String bairro;
	private String rua;
	
	private String cartao;
	private String dataValidade;
	private String autorizacao;

	private String custoFrete;
	
	private int qtdReatorArk;
	private int qtdReatorSolar;
	private int qtdRoboDomestico;
	private int qtdRoboSeguranca;
	private int qtdRoboMedico;

	private double total;

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public int getQtdReatorArk() {
		return qtdReatorArk;
	}

	public void setQtdReatorArk(int qtdReatorArk) {
		this.qtdReatorArk = qtdReatorArk;
	}

	public int getQtdReatorSolar() {
		return qtdReatorSolar;
	}

	public void setQtdReatorSolar(int qtdReatorSolar) {
		this.qtdReatorSolar = qtdReatorSolar;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	// Feito pq provavelmente o Mule tem um "bug" que somente aceitar setters do
	// tipo string
	public void setTotal(String total) {
		this.total = Double.parseDouble(total);
	}

	@Override
	public String toString() {
		String codigo = "codigo=" + this.getCodigo();
		String cliente = ", cliente=" + this.getCliente();
		String cpf = ", cpf=" + this.getCpf();
		String telefone = ", telefone=" + this.getTelefone();
		
		String cep = ", cep=" + this.getCep();
		String estado = ", estado=" + this.getEstado();
		String cidade = ", cidade=" + this.getCidade();
		String bairro = ", bairro=" + this.getBairro();
		String rua = ", rua=" + this.getRua();

		String cartao = ", cartao=" + this.getCartao();
		String dataValidade = ", dataValidade=" + this.getDataValidade();
		String autorizacao = ", autorizacao=" + this.getAutorizacao();
		
		String custoFrete = ", custoFrete=" + this.getCustoFrete();
		
		String qtdReatorArk = ", qtdReatorArk=" + this.getQtdReatorArk();
		String qtdReatorSolar = ", qtdReatorSolar=" + this.getQtdReatorSolar();
		String qtdRoboDomestico = ", qtdRoboDomestico=" + this.getQtdRoboDomestico();
		String qtdRoboSeguranca = ", qtdRoboSeguranca=" + this.getQtdRoboSeguranca();
		String qtdRoboMedico = ", qtdRoboMedico=" + this.getQtdRoboMedico();
		String total = ", total=" + this.getTotal();
		
		
		String text = "Pedido [" + codigo + cliente + cpf + telefone + cep + estado + cidade
					  + bairro + rua + cartao  + dataValidade + autorizacao + custoFrete + qtdReatorArk
					  + qtdReatorSolar + qtdRoboDomestico + qtdRoboSeguranca
					  + qtdRoboMedico + total +"]";
		
		
		return text;
	}

	public int getQtdRoboDomestico() {
		return qtdRoboDomestico;
	}

	public void setQtdRoboDomestico(int qtdRoboDomestico) {
		this.qtdRoboDomestico = qtdRoboDomestico;
	}

	public int getQtdRoboSeguranca() {
		return qtdRoboSeguranca;
	}

	public void setQtdRoboSeguranca(int qtdRoboSeguranca) {
		this.qtdRoboSeguranca = qtdRoboSeguranca;
	}

	public int getQtdRoboMedico() {
		return qtdRoboMedico;
	}

	public void setQtdRoboMedico(int qtdRoboMedico) {
		this.qtdRoboMedico = qtdRoboMedico;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getCartao() {
		return cartao;
	}

	public void setCartao(String cartao) {
		this.cartao = cartao;
	}

	public String getDataValidade() {
		return dataValidade;
	}

	public void setDataValidade(String dataValidade) {
		this.dataValidade = dataValidade;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getCustoFrete() {
		return custoFrete;
	}

	public void setCustoFrete(String custoFrete) {
		this.custoFrete = custoFrete;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getAutorizacao() {
		return autorizacao;
	}

	public void setAutorizacao(String autorizacao) {
		this.autorizacao = autorizacao;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
