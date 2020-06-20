public class Main{
  public static void main(String[] args) {
    Fila f = new Fila(12);
    System.out.println(f);

    int i = 1;
    while(f.estaCheio()){
      f.insere(i++);
      System.out.println(f);
    }
  }
}