//salvar como ProgramaAtividade15.java
import javax.swing.*;

class 	ProgramaAtividade15
{
   public static void main (String entrada[])
   {
     //declaração de variáveis
	 int n1,n2, p=1;
	 char  op = '0';
	 String msg = "", msgEntr = "Digite 1 para produto\nDigite 2 para produtoria\n\n";
	 
	 //entrada de dados
	 n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero inteiro"));
	 n2 = n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro numero inteiro"));
	 op = (JOptionPane.showInputDialog(msgEntr)).charAt(0);
	 
	 //processamento
	 switch (op)
	 {
	   case '1':
	   {
	     if (n1>0 && n2>0)
		 {
		   p = n1 * n2;
		   msg = msg + "Produto de " + n1 + " ," + n2 + " vezes eh: " + p + "\n\n";
		 }
		 break;
	   }
	   case '2':
	   {
	      for (int i=1; i<=n2; i=i+1)
		  {
		     p = p * n1;
		  }
		  msg = msg + "Produtoria de " + n1 + " ," + n2 + "vezes eh: " + p + "\n\n";
          break;
        }
        default: JOptionPane.showMessageDialog(null, " Opcao invalida, calculos nao realizados");
     }
    //Saída de dados
     if ( op >= '1' && op<= '3')
     {
         JOptionPane.showMessageDialog(null, msg);
     }
     System.exit(0);
	}
}