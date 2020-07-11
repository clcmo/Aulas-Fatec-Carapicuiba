package lista;

import no.NoDuplo;

public class ListaDupla {
    private NoDuplo prim;

    public ListaDupla() {
        setPrim(null);
    }

    public NoDuplo getPrim() {
        return prim;
    }

    public void setPrim(NoDuplo prim) {
        this.prim = prim;
    }

    public void insereIni(int i){
        NoDuplo novo = new NoDuplo(i);
        if(listaVazia()){
            setPrim(novo);
            novo.setProx(novo);
            novo.setAnt(novo);
        } else {
            novo.setAnt(prim.getAnt());
            novo.setProx(prim);
            novo.getProx().setAnt(novo);
            novo.getAnt().setProx(novo);
            setPrim(novo);
        }

    }

    private boolean listaVazia() {
        return prim == null;
    }

    public int removeIni(){
        int i = prim.getInfo();
        if(prim.getAnt() == prim.getProx())
            setPrim(null);
        else{
            prim.getProx().setAnt(prim.getAnt());
            prim.getAnt().setProx(prim.getProx());
            setPrim(prim.getProx());
        }
        return i;
    }

    public void insereFim(int i) {
        NoDuplo novo = new NoDuplo(i);
        if (listaVazia()) {
            prim = novo;
            novo.setAnt(novo);
            novo.setProx(novo);
        } else {
            novo.setAnt(prim.getAnt());
            novo.setProx(prim);
            novo.getAnt().setProx(novo);
            novo.getProx().setAnt(novo);
        }
    }
}
