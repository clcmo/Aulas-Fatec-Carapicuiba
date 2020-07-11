import javax.swing.*;
import static javax.swing.JOptionPane.showMessageDialog;

class Pilha{
    int ini;
    int fim;
    int tam;
    int qtd;
    int[] p;

    public Pilha(){
        ini = fim = -1;
        tam = 100;
        p = new int[tam];
        qtd = 0;
    }

    public boolean estaVazia(){
        return qtd == 0;
    }

    public boolean estaCheia(){
        return qtd == tam - 1;
    }

    public void insereUm(int e){
        if(!estaCheia()){
            if (ini == -1)
                ini = 0;
            fim++;
            p[fim] = e;
            qtd++;
        }
    }
    public void removeUm(){
        if (!estaVazia()){
            fim --;
            qtd--;
        }
    }

    public void mostra(){
        String s = "";
        for (int i = fim; i >= 0; i--)
            s += p[i] + " - ";
        showMessageDialog(null, s);
    }
}