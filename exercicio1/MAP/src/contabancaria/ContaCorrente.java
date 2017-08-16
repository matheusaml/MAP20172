package contabancaria;

public class ContaCorrente extends ContaBancaria{

	public ContaCorrente(String cpf) {
		super(cpf);
	}
	
	public void taxasMensais(){
		int saldo1 = this.getSaldo();
		this.setSaldo(saldo1-5);
	}
	

}
