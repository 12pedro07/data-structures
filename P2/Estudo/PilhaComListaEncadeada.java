public class PilhaComListaEncadeada{

////////////////////////////////////////////////
//    Topo da pilha é o elemento mais acima   //
//    Proximo é de cima pra baixo             //
////////////////////////////////////////////////

  No topo;

  public PilhaComListaEncadeada(){ topo = null; }

  public void push(int i){
    if (topo==null){
      topo = new No();
      topo.setValor(i);
    }
    else{
      No temp = new No();
      temp.setValor(i);
      temp.setProximo(topo);
      topo = temp;
    }
  }

  public int pop(){
    if (topo==null){ return (0); }
    else{
      int aux = topo.getValor();
      topo = topo.getProximo();
      return(aux);
    }
  }
}
