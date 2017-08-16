package contabancaria;

public class Principal {
	public static void main(String[] args) {
		ContaBancaria conta1 = new ContaBancaria("07097188456");
		conta1.depositar(100);
		System.out.println("A conta cujo CPF é " + conta1.getCpf() + " possui R$ " + conta1.getSaldo() + " de saldo.");
		conta1.sacar(30);
		System.out.println("A conta cujo CPF é " + conta1.getCpf() + " possui R$ " + conta1.getSaldo() + " de saldo.");

		ContaBancaria conta2 = new ContaBancaria("01010101010");
		conta1.transferir(20, conta2);
		System.out.println("A conta cujo CPF é " + conta2.getCpf() + " possui R$ " + conta2.getSaldo() + " de saldo.");
		System.out.println("A conta cujo CPF é " + conta1.getCpf() + " possui R$ " + conta1.getSaldo() + " de saldo.");

		ContaCorrente conta3 = new ContaCorrente("999922292");
		conta3.depositar(50);
		conta3.taxasMensais();
		System.out.println("A conta cujo CPF é " + conta3.getCpf() + " possui R$ " + conta3.getSaldo() + " de saldo.");
		
		ContaPoupanca conta4 = new ContaPoupanca("999922292");
		conta4.depositar(50000);
		conta4.rendimentoDoDinheiro();
		System.out.println("A conta cujo CPF é " + conta4.getCpf() + " possui R$ " + conta4.getSaldo() + " de saldo.");

	}


}
