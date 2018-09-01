public class No2{

  private int valor;
  private No2 esquerdo;
  private No2 direito;

  public No2(){ this (0,null,null); }
  public No2(int val, No2 esq, No2 dir){
    valor = val;
    esquerdo = esq;
    direito = dir;
  }

  public void setFilhoEsquerdo (No2  e ) { esquerdo = e; }
  public void setFilhoDireito  (No2  d ) { direito  = d; }
  public void setValor         (int  v ) { valor    = v; }

  public No2 getFilhoEsquerdo () { return(esquerdo); }
  public No2 getFilhoDireito  () { return(direito);  }
  public int getValor         () { return(valor);    }
}
