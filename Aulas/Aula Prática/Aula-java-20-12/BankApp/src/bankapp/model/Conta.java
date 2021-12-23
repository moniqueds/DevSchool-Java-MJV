package bankapp.model;

import java.util.ArrayList;
import java.util.List;

public class Conta {
	private double saldo;
	private List<Historico> historicos = new ArrayList();
	//+2 a 3 atributos relevantes para o negócio.
	
	public double getSaldo() {
		return saldo;
		
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
		
	}
	
	public List<Historico> getHistoricos() {
		return historicos;
	}
	

}
