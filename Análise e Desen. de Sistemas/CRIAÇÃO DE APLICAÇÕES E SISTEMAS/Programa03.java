//salvar como Programa03.java
import javax.swing.*;

class Programa03
{
   public static void main (String entrada[])
   {
     //declaração de variáveis
	 int n1, n2;
	 int mod;
	 double raiz, raiz2;
	 String msg = "";
	 
	 //entrada de dados
	 n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero inteiro"));
	 n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite um outro numero inteiro"));
	 
	 //processamento
	 mod = n1 % n2; //pega o resto da divisão
	 raiz = Math.sqrt(n1);
	 raiz2 = Math.sqrt(n2);
	 
	 //saída de resultados
	 msg = "n1 = " + n1 + "   n2 = " + n2 + "\n";
	 msg = msg + "resto da divisao de " + n1 + " por " + n2 + " = " + mod + "\n";
	 msg = msg + "raiz quadrada de n1 = " + raiz + "\n";
	 msg = msg + "raiz quadrada de n2 = " + raiz2 + "\n";
     JOptionPane.showMessageDialog(null,msg);
	 
	 System.exit(0);
	}
}