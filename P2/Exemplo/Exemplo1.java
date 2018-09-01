   import javax.swing.*;
    public class Exemplo1 {
       public static void main(String args[])
      {

			String s;


         No a = new No();
         No b = new No();
         No c = new No();

         a.setElemento(10);
         b.setElemento(20);
         c.setElemento(30);

         a.setProximo(b);
         b.setProximo(c);
         c.setProximo(null);

			//mostro
         s = "Resultado Basico: ";
         JOptionPane.showMessageDialog(null, s);

			s = "Primeiro Valor: " + a.getElemento();
         JOptionPane.showMessageDialog(null, s);

         s = "Segundo Valor: " + b.getElemento();
         JOptionPane.showMessageDialog(null, s);

         s = "Terceiro Valor: " + c.getElemento();
         JOptionPane.showMessageDialog(null, s);


         s = "Resultado por acesso ao proximo: ";
         JOptionPane.showMessageDialog(null, s);

			s = "Primeiro Valor: " + a.getElemento();
         JOptionPane.showMessageDialog(null, s);

         s = "Segundo Valor: " + a.getProximo().getElemento();
         JOptionPane.showMessageDialog(null, s);

         s = "Terceiro Valor: " + a.getProximo().getProximo().getElemento();
         JOptionPane.showMessageDialog(null, s);


         s = "Resultado por deslocamento: ";
         JOptionPane.showMessageDialog(null, s);

			s = "Primeiro Valor: " + a.getElemento();
         JOptionPane.showMessageDialog(null, s);

         a = a.getProximo();

         s = "Segundo Valor: " + a.getElemento();
         JOptionPane.showMessageDialog(null, s);

         a = a.getProximo();

         s = "Terceiro Valor: " + a.getElemento();
         JOptionPane.showMessageDialog(null, s);






         System.exit(0);
      }
   }
