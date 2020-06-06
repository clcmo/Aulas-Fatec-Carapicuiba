class Pilha {

    private int topo;
    private final int[] dados;

    public Pilha(int capacidade){
        dados = new int[capacidade];
        topo = 0;
    }

    public Pilha(){
        dados = new int[10];
        topo = 0;
    }

    public boolean pilhaVazia(){
        return topo == 0;
    }

    public boolean pilhaCheia(){
        return topo == dados.length;
    }

    public void push(int elemento){
        dados[topo++] = elemento;
    }

    public int pop(){
        return dados[--topo];
    }

    public int consultaTopo(){
        return dados[topo-1];
    }

    @Override
    public String toString(){
        String s = "";
        if(pilhaVazia()) s += "pilha vazia.\n";
        for(int i = topo-1; i>=0; i--)
            s += dados[i] + " ";
        return s+"\n";
    }
}