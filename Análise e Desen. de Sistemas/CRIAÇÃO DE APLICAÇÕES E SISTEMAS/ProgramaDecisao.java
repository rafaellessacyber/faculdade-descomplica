//salvar como ProgramaDecisao.java
import javax.swing.*;

class 	ProgramaDecisao	
{
   public static void main (String entrada[])
   {
     //declaração de variáveis
	 int num;
	 char  op = '0';
	 String msg = "", msgEntr = "Digite1 para par/impar\nDigite 2 para positivo/negativo\n";
	 
	 //entrada de dados
	 num = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero inteiro"));
	 op = (JOptionPane.showInputDialog(msgEntr)).charAt(0);
	 
	 //processamento
	 switch (op)
	 {
	     case '1':
		 {
		    if (num % 2 ==0)
			{
			    msg = msg + num + " eh par.\n\n";
			}
			else
			{
			    msg = msg + num + " eh impar.\n\n";
			}
			break;
		 }
		 case '2':
		     if (num > 0)
			 {
			     msg = msg + num + " eh positivo\n\n";
			 }
			 else
			 {
			     msg = msg + num + " eh negativo \n\n";
			 }
             break;
         default: JOptionPane.showMessageDialog(null, "Opcao invalida, calculo nao realizados");
	 }	 
	 
	 //saída de resultados
	  if (op == '1' || op =='2')
	  {
	      JOptionPane.showMessageDialog(null, msg);
	   }
	 System.exit(0);
	}
}