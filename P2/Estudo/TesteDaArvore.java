public class TesteDaArvore{
  public static void main(String args[]){

    arvore arvr = new arvore(10);

    arvr.insereElemento(6);
    arvr.insereElemento(4);
    arvr.insereElemento(5);
    arvr.insereElemento(15);
    arvr.insereElemento(13);

    arvr.pos_ordem2();
  }
}
