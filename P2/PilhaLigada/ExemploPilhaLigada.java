import java.awt.*;
import javax.swing.*;
import javax.swing.*;

public class ExemploPilhaLigada 
{
   public static void main(String args[])
   {
      String saida="";
      int elemento;
      int tamanho = Integer.parseInt(
                        JOptionPane.showInputDialog("Digite elementos da pilha: "));
      PilhaLigada z = new PilhaLigada();
                //empilhando elementos
      saida = "elementos empilhados:\n";
      for(int i=0; i < tamanho ; i++) 
      {
         elemento = Integer.parseInt(
                                JOptionPane.showInputDialog("Digite um numero inteiro: ") );
         z.push(elemento);
         saida = saida + elemento + ",";
      }
     
      JOptionPane.showMessageDialog(null,saida,"Teste de Pilha",
                        JOptionPane.INFORMATION_MESSAGE);
      
      for(int i=0; i < tamanho ; i++) 
      {
         elemento = z.pop();
         JOptionPane.showMessageDialog(null,
                     "Elemento " + elemento + " foi desempilhado.","Aviso",
                     JOptionPane.WARNING_MESSAGE);
         elemento = z.topo();
         JOptionPane.showMessageDialog(null,
                     "Topo da pilha: " + elemento ,"Aviso",
                     JOptionPane.WARNING_MESSAGE);
      }
      
      System.exit(0);
   }
}