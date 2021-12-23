package bankapp;

import bankapp.model.Conta;
import bankapp.service.ContaService;

public class BankApplication {
	public static void main(String[] args) {
		//de 2 a 3 contas de integrantes
		//para realizar uma jornada nas contas
		
		Conta contaMonique = new Conta();
		
		ContaService terminal = new ContaService();
		terminal.depositar(contaMonique,  150.0);		
		System.out.println("Saldo Atual:" + contaMonique.getSaldo())
		
		terminal.sacar(contaMonique, 30.0);
		terminal.sacar(contaMonique, 60.0);
		terminal.depositar(contaMonique, 15.0);
		
		terminal.exibirExtrato(contaMonique);
		
		System.out.println(contaMonique.getSaldo());
		
	}

}
