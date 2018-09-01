   import javax.swing.*;
    public class Exemplo3 {
       public static void main(String args[])
      {
         No n = new No();
         No inicio = new No();

			String s;
			int i;

		   //posicao inicial guardada
		   inicio=n;

       //testando o default
       No x = new No(10,null);
       System.out.println(x.getElemento());

			//recebo 10 elementos
			for (int c=0; c<10; c++)
			   {
				  s = JOptionPane.showInputDialog(null, "Digite um elemento");
				  i = Integer.parseInt(s);

				  n.setElemento(i);
				  No temp = new No();  	//1
				  n.setProximo(temp);  	//2
				  n=temp; 					//3

				  //1, 2, 3 poderia ser substituido por:
				  //	n.setProximo(new No());
				  //  n = n.getProximo();
				}

		   //reposiciono
			n=inicio;

			//mostro
			do {
			    JOptionPane.showMessageDialog(null, "n="+n.getElemento());
		       n = n.getProximo();
				} while(n.getProximo()!=null);


         System.exit(0);
      }
   }
