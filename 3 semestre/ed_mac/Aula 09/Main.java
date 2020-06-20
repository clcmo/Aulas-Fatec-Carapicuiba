public class Main{

  Fila mergeFila(Fila f1, Fila f2){
    Fila merge = new Fila(f1.getCont() + f2.getCont());
    while(!f1.estaVazio()){
      merge.insere(f1.remove());
      merge.insere(f2.remove());
    }

    return merge;
  }

  public static void main(String[] args) {
    Fila f = new Fila(12);
    System.out.println(f);

    int i = 1;
    while(f.estaCheio()){
      f.insere(i++);
      System.out.println(f);
    }

    while(!f.estaVazio()){
      System.out.println(f.remove() + "foi atendido");
      System.out.println(f);
    }
  }
}