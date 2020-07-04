public class NoDuplo {
    private int info;
    private NoDuplo prox, ant;

    public int getInfo() {
        return info;
    }

    public void setInfo(int info) {
        this.info = info;
    }

    public NoDuplo getProx() {
        return prox;
    }

    public void setProx(NoDuplo prox) {
        this.prox = prox;
    }

    public NoDuplo getAnt() {
        return ant;
    }

    public void setAnt(NoDuplo ant) {
        this.ant = ant;
    }

    @Override
    public String toString() {
        return "NoDuplo{" +
                "info=" + info +
                '}';
    }
}
