import java.util.Random;

public class JogoPilha {
    public static void main(String[] args) {
        Pilha p = new Pilha();
        Random gera = new Random();

        do {
            if (gera.nextInt(2) == 1) {
                if(!p.pilhaCheia()){
                    p.push(gera.nextInt(10));
                }
            } else {
                if(!p.pilhaVazia()) {
                    System.out.println(p.pop() + " saiu.");
                }
            }
            System.out.println(p);
        } while (!p.pilhaVazia());
    }
}
