package contabancaria;

public class ContaPoupanca extends ContaBancaria{

	public ContaPoupanca(String cpf) {
		super(cpf);
	}
	
	public void rendimentoDoDinheiro(){
		final double taxaDeRendimento = 0.005;
		int valorRendimento = (int) (this.getSaldo()*taxaDeRendimento);
		this.setSaldo(this.getSaldo()+valorRendimento);
		
	}
	

}
