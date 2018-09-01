public class No{
  private int valor;
  private No proximo;

  // construtores

  // construtor default (nao sao passados valores para no)
  public No(){ this(0, null);
  }
  // construtor personalizado (sao definidos valor e proximo na criacao)
  public No(int val, No prox){
    valor = val;
    proximo = prox;
  }

  // atualizando os valores do no
  public void setValor    ( int novoValor  ) { valor    = novoValor;   }
  public void setProximo  ( No novoProximo ) { proximo  = novoProximo; }

  // consultando os valores
  public int getValor()   { return valor;   }
  public No  getProximo() { return proximo; }

}
