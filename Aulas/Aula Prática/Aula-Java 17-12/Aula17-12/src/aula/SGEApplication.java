package aula;

public class SGEApplication {
	
	public static void main(String[] args) {
		
		byte idade = 127;
		calcularTaxaSeguro(idade);
		
		calcularTaxaSeguro(1);
	}
	
	static void calcularTaxaSeguro(byte idade) {
		Systema.out.prinln(idade);
	}

}
