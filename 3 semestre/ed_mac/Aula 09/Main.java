public class Main{
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