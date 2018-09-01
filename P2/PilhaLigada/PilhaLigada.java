import java.awt.*;
import javax.swing.*;
public class PilhaLigada 
{
   private int tamanho;
   private No topo;
   
   //construtores
   public PilhaLigada()
   {
      topo = null;
      tamanho = 0;
   }
   
   public int tamanho()
   {
      return(tamanho);
   }
   	
   public boolean estaVazia()
   {
      if (topo==null)
         return true;
      return false;
   }
   	
   public void push(int i)
   {
      No n = new No();
      n.setElemento(i);
      n.setProximo(topo);
      topo = n;
      tamanho++;
   }
   	 
   public int topo()
   {
      if (estaVazia())
      {
         JOptionPane.showMessageDialog(null, "Pilha Vazia");
         return 0;
      }
      else
      {
         return topo.getElemento();
      }
   }
   	
   public int pop()
   {
      int temp=0;
      if (estaVazia())
      {
         JOptionPane.showMessageDialog(null, "Pilha Vazia");
      }
      else
      {
         temp = topo.getElemento();
         topo  = topo.getProximo();
         tamanho--;
      }
      return temp;
   }
}