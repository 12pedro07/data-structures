import javax.swing.JOptionPane;

public class ListaEncadeada{
  public static void main(String args[]){
    String s;

    No c = new No(30, null );
    No b = new No(20, c    );
    No a = new No(10, b    );

//-------------------------------------------\\
    s = "Resultado Basico: ";
    JOptionPane.showMessageDialog(null, s);
    s = "Primeiro valor: " + a.getValor();
    JOptionPane.showMessageDialog(null, a.getValor());
    s = "Segundo valor:  " + b.getValor();
    JOptionPane.showMessageDialog(null, s);
    s = "Terceiro valor: " + c.getValor();
    JOptionPane.showMessageDialog(null, s);
//-------------------------------------------\\
    s = "Resultado por acesso ao proximo: ";
    JOptionPane.showMessageDialog(null, s);
    s = "Primeiro valor: " + a.getValor();
    JOptionPane.showMessageDialog(null, s);
    s = "Segundo valor:  " + a.getProximo().getValor();
    JOptionPane.showMessageDialog(null, s);
    s = "Terceiro valor: " + a.getProximo().getProximo().getValor();
    JOptionPane.showMessageDialog(null, s);
//-------------------------------------------\\
  s = "Resultado por deslocamento: ";
  No inicio = a;
  for (int i = 0; i<3; i++){
    s = "valor: " + a.getValor();
    JOptionPane.showMessageDialog(null, s);
    a = a.getProximo();
  }
  System.out.println(inicio.getValor());
  }
}
