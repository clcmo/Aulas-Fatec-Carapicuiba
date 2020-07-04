package sample;

import methods.Presenter;

public class Main {
    public static void main(String[] args) {
        Presenter presenter = new Presenter();

        //Exibe o tempo gasto em cada metodo
        presenter.presentIS();
        presenter.presentBS();
        presenter.presentQS();
        presenter.presentSS();

        //Compara e informa qual método é o mais rápido
        String s = "Metodo mais rapido eh: ";
        if (presenter.contIS <= presenter.contSS
                && presenter.contIS <= presenter.contBS
                && presenter.contIS <= presenter.contQS)
            s += "InsertionSort";
        else if(presenter.contSS <= presenter.contBS && presenter.contSS <= presenter.contQS)
            s += "SelectionSort";
        else if(presenter.contQS <= presenter.contBS)
            s += "QuickSort";
        else
            s += "BubbleSort";
        System.out.println(s);
    }
}
