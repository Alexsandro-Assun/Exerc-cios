package POO;

public class Fornecedor extends Pessoa {

	private double valorCredito;
	private double valorDivida;


	public Fornecedor(String nome, String tel, String end, double credito, double divida) {
		
	super(nome, tel, end);
	this.valorCredito = credito;
	this.valorDivida = divida	;	
	}


	public double getValorCredito() {
		return valorCredito;
	}


	public void setValorCredito(double valorCredito) {
		this.valorCredito = valorCredito;
	}


	public double getValorDivida() {
		return valorDivida;
	}


	public void setValorDivida(double valorDivida) {
		this.valorDivida = valorDivida;
	}

	public double obterSaldo(){
	double saldo = this.valorCredito - this.valorDivida;
			return saldo;
	}
	
	
}
