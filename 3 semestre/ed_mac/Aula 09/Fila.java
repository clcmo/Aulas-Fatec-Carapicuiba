class Fila{
  private int prim, ult, cont, aux;
  private int dados[];
  
  public Fila(){
    dados = new int[10];
    prim = 0;
    ult = 0;
  }

  public Fila(int tam){
    dados = new int[tam];
    prim = 0;
    ult = 0;
  }

  int prox(int pos){
    return (pos+1) % dados.length;
  }

  public boolean estaCheio(){
    return (dados.length == cont);
  }

  public boolean estaVazio(){
    return (cont ==0);
  }

  public void insere(int i){
    dados[ult] = i;
    ult = prox(ult);
    cont++;
  }

  public int remove(){
    aux = dados[prim];
    prim = prox(prim);
    cont--;
    return aux;
  }

  public int consultaPrim{
    return dados[prim];
  }

  public int consultaAnterior(int pos){
    return (dados.lenght + pos -1) % dados.lenght;
  }

  public int consultaUlt(){
    return dados[consultaAnterior(ult)];
  }

}