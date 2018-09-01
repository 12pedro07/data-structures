import javax.swing.JOptionPane;

public class arvore{

  No2 raiz = new No2();

  public arvore(int r){
    raiz.setValor(r);
  }


  public void insereElemento(int numero){
    System.out.println("raiz = " + raiz.getValor());
    System.out.println("numero = " + numero);

    No2 paiAtual = raiz;
    boolean naArvore = false;
    while(!naArvore){
      if (numero < paiAtual.getValor()){
        if (paiAtual.getFilhoEsquerdo() == null){
          No2 novoNo = new No2();
          novoNo.setValor(numero);
          paiAtual.setFilhoEsquerdo(novoNo);
          naArvore = true;
        }
        else {
          paiAtual = paiAtual.getFilhoEsquerdo();
        }
      }
      else if(numero > paiAtual.getValor()){
        if (paiAtual.getFilhoDireito() == null){
          No2 novoNo = new No2();
          novoNo.setValor(numero);
          paiAtual.setFilhoDireito(novoNo);
          naArvore = true;
        }
        else {
          paiAtual = paiAtual.getFilhoDireito();
        }
      }
      else{
        naArvore = true; // ja existe um numero igual na arvore
      }
    }
  }

  public void em_ordem2(){
    em_ordem(raiz);
  }

  public void em_ordem(No2 atual){
    if (atual != null){
      em_ordem(atual.getFilhoEsquerdo());
      JOptionPane.showMessageDialog(null, atual.getValor());
      em_ordem(atual.getFilhoDireito());
    }
  }

//---------------------------------------
  public void pre_ordem2(){
    pre_ordem(raiz);
  }

  public void pre_ordem(No2 atual){
    if (atual != null){
      JOptionPane.showMessageDialog(null, atual.getValor());
      pre_ordem(atual.getFilhoEsquerdo());
      pre_ordem(atual.getFilhoDireito());
    }
  }
//--------------------------------------
  public void pos_ordem2(){
    pos_ordem(raiz);
  }

  public void pos_ordem(No2 atual){
    if (atual != null){
      pos_ordem(atual.getFilhoEsquerdo());
      pos_ordem(atual.getFilhoDireito());
      JOptionPane.showMessageDialog(null, atual.getValor());
    }
  }
}
