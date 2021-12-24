//salvar como ProgramaAtivade14.java
import javax.swing.*;

class 	ProgramaAtivade14	
{
   public static void main (String entrada[])
   {
     //declaração de variáveis
	 int n1, n2;
	 int  div;
	 double pot;
	 String msg = "";
	 
	 //entrada de dados
	 n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero inteiro"));
	 n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite um outro numero inteiro"));
	 
	 //processamento
	 div = (int)n1 / (int)n2;//int entre parenteses garante o numero inteiro, a barra irá truncar para dar o quociente da operação
	 pot = Math.pow(n1, n2);
	 
	 //saída de resultados
	 msg = "n1 = " + n1 + "   n2 = " + n2 + "\n";
	 msg = msg + "quociente da divisao de n1 por n2  = " + div + "\n";
	 msg = msg + "potencia de n1 e n2 = " + pot + "\n";
	 JOptionPane.showMessageDialog(null,msg);
	 
	 System.exit(0);
	}
}