package cadastro;

import javax.swing.JOptionPane;

public class CadastroDiagramaClasse {
	 public static void main(String[] args) {

		 String nome = JOptionPane.showInputDialog("Informe seu nome.");
	     Long cpf = Long.parseLong (JOptionPane.showInputDialog("Informe seu CPF (somente números)."));
	     byte idade = Byte.parseByte(JOptionPane.showInputDialog("Informe a idade (somente números)."));
	     float altura = Float.parseFloat(JOptionPane.showInputDialog("Informe a sua altura em centímetros (Exemplo: 151."));
	     String doadorOrgao = JOptionPane.showInputDialog("É doador de órgãos? Digite SIM ou NÃO" );
	     String email = JOptionPane.showInputDialog("Informe seu e-mail.");
	     Long telefone = Long.parseLong (JOptionPane.showInputDialog("Informe seu telefone ou celular (somente números)."));
	     String dataNascimento = JOptionPane.showInputDialog("Informe sua data de nascimento.");

	     System.out.println(" Nome: " + nome + "\n" + " Cpf: " + cpf + "\n" + " Idade: " + idade + "\n" + " Altura: "
	                + altura + "\n" + " Doador de órgãos: " + doadorOrgao + "\n" + " E-mail: " + email + "\n" + " Phone: "
	                + telefone + "\n" + " Nascimento: " + dataNascimento);
	    }

	}