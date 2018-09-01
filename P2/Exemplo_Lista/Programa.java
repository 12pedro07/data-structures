import java.awt.*;
import javax.swing.*;

public class Programa {
   public static void main(String args[])
   {
      //criando os objetos
      No a = new No();
      No b = new No();
      No c = new No();
      No d = new No();
      
      
      //carregando os valores
      a.valor = 5;
      b.valor = 10;
      c.valor = 15;
      d.valor = 20;
      
      //carregando os ponteiros
      a.proximo = b;
      b.proximo = c;
      c.proximo = d;
      d.proximo = null;
      
      
      //Mostrando o conte�do do n� a em diante
      
      //(conte�do da lista:   a --> b --> c --> d --  , ou 5 --> 10 --> 15 --> 20)
      
      No inicio = new No();
      inicio = a;
            
      while (a!=null)
      {
         JOptionPane.showMessageDialog(null, "Conte�do do n� a: " + a.valor);
         a = a.proximo;
      }      
      
      a = inicio;  //voltei a posi��o inicial do a
      
      //vou inserir o valor 12
      
      No temp = new No();
      temp.valor = 12;
      
      //b.proximo = temp;
      //temp.proximo = c; 
      
      //OU...
      temp.proximo = a.proximo.proximo;
      a.proximo.proximo = temp;
            
      //(conte�do da lista:   a --> b --> temp --> c --> d --  , ou 5 --> 10 --> 12 --> 15 --> 20)
            
      while (a!=null)
      {
         JOptionPane.showMessageDialog(null, "Conte�do do n� a ap�s a inser��o do 12: " + a.valor);
         a = a.proximo;
      }      
      
      //exclus�o do 10 (n� b)
      a = inicio;  //voltei a posi��o inicial do a
      //a.proximo = temp;
      
      //OU....
      a.proximo = a.proximo.proximo;
      
      //(conte�do da lista:   a --> temp --> c --> d --  , ou 5 --> 12 --> 15 --> 20)
      

      while (a!=null)
      {
         JOptionPane.showMessageDialog(null, "Conte�do do n� a ap�s a exclus�o do 10: " + a.valor);
         a = a.proximo;
      }
      
      System.exit(0);
   }
}
          
