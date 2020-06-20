class Fila{
  private int prim = 0, ult = 0;
  private int cont, aux;
  private int dados[];
  
  public Fila(){
    dados = new int[10];
  }

  public Fila(int tam){
    dados = new int[tam];
  }

  public int prox(int pos){
    return (pos+1) % dados.length;
  }

  public int ant(int pos){
    return (dados.length + pos -1) % dados.length;
  }

  public boolean estaCheio(){
    return (dados.length == cont);
  }

  public boolean estaVazio(){
    return (cont == 0);
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

  public int getPrim(){
    return dados[prim];
  }

  public int getUlt(){
    return dados[ant(ult)];
  }

  @Override
  public String toString(){
    String s = "\n";
    if(estaVazio()){
      s += "Fila está vazia";
    } else {
      int i = prim;
      do{
        s += dados[i] + " ";
        i = prox(i);
      } while(i!= ult);
    }
    return s += "\n";
  }
}