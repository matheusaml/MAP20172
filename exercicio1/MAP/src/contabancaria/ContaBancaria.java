package contabancaria;

public class ContaBancaria {
	
	private String nome;
	private String cpf;
	private int conta;
	private int agencia;
	private int saldo;
	
	public ContaBancaria(String cpf){
		this.cpf = cpf;
	}
	
	public ContaBancaria(String cpf, String nome){
		this.cpf = cpf;
		this.nome = nome;
	}
	
	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getConta() {
		return conta;
	}
	public void setConta(int conta) {
		this.conta = conta;
	}
	public int getAgencia() {
		return agencia;
	}
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	public int getSaldo() {
		return saldo;
	}
	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}
	public void depositar(int valor){
		this.saldo = this.saldo + valor;
	}
	public void sacar(int valor){
		this.saldo = this.saldo - valor;
	}
	public void transferir(int valor, ContaBancaria conta2){
		this.setSaldo(this.getSaldo()-valor);
		conta2.depositar(valor);
	}
	

}
