//salvar como Programa04.java
import javax.swing.*;

class 	Programa04.java
{
   public static void main (String entrada[])
   {
     //declaração de variáveis
	 int n1, n2;
	 int mod, div;
	 double raiz, pot;
	 String msg = "";
	 
	 //entrada de dados
	 n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero inteiro"));
	 n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite um outro numero inteiro"));
	 
	 //processamento
	 mod = n1 % n2; //pega o resto da divisão
	 div = (int)n1 / (int)n2;//int entre parenteses garante o numero inteiro, a barra irá truncar para dar o quociente da operação
	 raiz = Math.sqrt(n1);
	 pot = Math.pow(n1, n2);
	 
	 //saída de resultados
	 msg = "n1 = " + n1 + "   n2 = " + n2 + "\n";
	 msg = msg + "resto da divisao de n1 por n2 = " + mod + "\n";
	 msg = msg + "quociente da divisao de n1 por n2  = " + div + "\n";
	 msg = msg + "raiz quadrada de n1 = " + raiz + "\n";
	 msg = msg + "potencia de n1 e n2 = " + pot + "\n";
	 JOptionPane.showMessageDialog(null,msg);
	 
	 System.exit(0);
	}
}