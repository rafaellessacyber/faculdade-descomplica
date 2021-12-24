//salvar como ProgrFilmes.java
import javax.swing.*;

class 	ProgrFilmes
{
   public static void main (String entrada[])
   {
     //declaração de variáveis
     String vetor[] = new String [5];
	
	 
	 String msg = "Seus filmes= ";
	 
	 //vetor = ;
	 for (int i = 0; i <vetor.length; i++)
	 {
	     
		 vetor[i] = JOptionPane.showInputDialog("Digite o seu filme " +i);
		 msg = msg + vetor[i] + " ";
	 }
    JOptionPane.showMessageDialog(null, msg);
	System.exit(0);
	}
}