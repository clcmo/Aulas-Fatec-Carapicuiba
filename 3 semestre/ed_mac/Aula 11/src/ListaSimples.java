class ListaSimples {

    private No prim;
    public ListaSimples(){
        prim = null;
    }

    public No getPrim() {
        return prim;
    }

    public void setPrim(No prim) {
        this.prim = prim;
    }

    public boolean listaVazia(){
        return this.prim == null;
    }

    public void insereInicio(int i){
        No novo = new No(i);
        if(!listaVazia()){
            novo.setProx(this.prim);
        }
        setPrim(novo);
    }

    public int removeInicio(){
        int i = prim.getInfo();
        setPrim(prim.getProx());
        return i;
    }

    @Override
    public String toString() {
        String s = "";
        if(listaVazia())
            s += "lista vazia.";
        No aux = this.prim;
        while (aux != null){
            s += aux.getInfo() + " ";
            aux = aux.getProx();
        }
        return s += "\n";
    }

    public void insereFim(int i){
        No novo = new No(i);
        if(listaVazia())
            setPrim(novo);
        No aux = this.prim;
        while (aux.getProx() != null){
            aux = aux.getProx();
        }
        aux.setProx(novo);
    }

    public int removeFim(){
        int i;
        if(this.prim.getProx() == null){
            i = this.prim.getInfo();
            setPrim(null);
        } else {
            No aux = this.prim;
            while (aux.getProx().getProx() != null){
                aux = aux.getProx();
            }
            i = aux.getProx().getInfo();
            aux.setProx(null);
        }
        return i;
    }
}
