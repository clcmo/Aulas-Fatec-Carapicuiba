package lista;

import no.No;

public class ListaIniFim {

    private No prim, ult;

    public ListaIniFim(){
        setPrim(null);
        setUlt(null);
    }

    public No getPrim() {
        return prim;
    }

    public void setPrim(No prim) {
        this.prim = prim;
    }

    public No getUlt() {
        return ult;
    }

    public void setUlt(No ult) {
        this.ult = ult;
    }

    public boolean listaVazia(){
        return this.prim == null;
    }

    public void insereInicio(int i){
        No novo = new No(i);
        if(!listaVazia()) novo.setProx(this.prim);
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
        else
            getUlt().setProx(novo);
        setUlt(novo);
    }

    public int removeFim(){
        int i = this.ult.getInfo();
        if(this.prim.getProx() == null){
            setUlt(null);
            setPrim(null);
        } else {
            No aux = this.prim;
            while (aux.getProx().getProx() != this.ult) aux = aux.getProx();
            aux.setProx(null);
            setUlt(aux);
        }
        return i;
    }
}
