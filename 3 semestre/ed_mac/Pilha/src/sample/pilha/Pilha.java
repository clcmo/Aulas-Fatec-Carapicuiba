package sample;

public class Pilha {
    public Object[] pilha;
    public int posPilha, topo, capa;

    //Construtor vazio, onde inicializo minha pilha
    public Pilha(){
        this.posPilha = -1;
        this.pilha = new Object[1000];
    }

    public boolean pilhaVazia() {
        return this.posPilha == -1;
    }

    public boolean pilhaCheia() {
        if (posPilha == getTopo()) return true;
        else return false;
    }



    public int getTam() {
        return (pilhaVazia()) ? 0 : posPilha + 1;
    }

    public Object getTopo() {
        return (pilhaVazia()) ? null : pilha[posPilha];
    }

    public Object removeUm() {
        return (pilhaVazia()) ? null : pilha[posPilha--];
    }

    public void insereUm(Object val) {
        if (posPilha < pilha.length - 1) {
            pilha[++posPilha] = val;
        }
    }

}
