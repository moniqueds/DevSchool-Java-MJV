package aula;

public class TerminalBancario {
	
	public static void main (String [] args) {
		//quero somar 2+3 = 5;
		
		System.out.print(somar(2,3));
		
	}
	
	//tipo de retorno(nada que � o void), nome (� a representa��o das a��es), parametros
	
	public static int somar(int n1, int n2) {
		int resultado = n1+n2;
		return resultado;
		
	}

}
