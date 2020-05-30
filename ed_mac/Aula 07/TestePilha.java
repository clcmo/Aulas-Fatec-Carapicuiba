public class TestePilha {
    public static void main(String[] args) {
        Pilha p = new Pilha();
        int i = 1;

        while(!p.pilhaCheia()){
            p.push(i++);
        }

        while (!p.pilhaVazia()){
            System.out.println(p.pop() + " saiu");
        }
    }
}
