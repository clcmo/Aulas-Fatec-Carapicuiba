package methods;

import static methods.Methods.*;

public class Presenter {
    int qt = 10000;
    int[] v = new int[qt];
    long timeIni, timeFim, cont;
    public long contIS;
    public long contSS;
    public long contQS;
    public long contBS;

    public void presentQS(){
        for (int i = 0; i < v.length; i++) {
            v[i] = (int) (Math.random()* qt);
        }

        //Inicia a contagem
        timeIni = System.currentTimeMillis();

        quickSort(v,0,v.length-1);

        //Termina a contagem
        timeFim = System.currentTimeMillis();

        contQS = cont = timeFim - timeIni;

        System.out.println("QuickSort executado em = " + cont + " ms");
    }

    public void presentBS(){
        for (int i = 0; i < v.length; i++) {
            v[i] = (int) (Math.random()* qt);
        }

        //Inicia a contagem
        timeIni = System.currentTimeMillis();

        bubbleSort(v);

        //Termina a contagem
        timeFim = System.currentTimeMillis();

        contBS = cont = timeFim - timeIni;

        System.out.println("BubbleSort executado em = " + cont + " ms");
    }

    public void presentIS(){
        for (int i = 0; i < v.length; i++) {
            v[i] = (int) (Math.random()* qt);
        }

        //Inicia a contagem
        timeIni = System.currentTimeMillis();

        insertionSort(v);

        //Termina a contagem
        timeFim = System.currentTimeMillis();

        contIS = cont = timeFim - timeIni;

        System.out.println("InsertionSort executado em = " + cont + " ms");
    }

    public void presentSS(){
        for (int i = 0; i < v.length; i++) {
            v[i] = (int) (Math.random()* qt);
        }

        //Inicia a contagem
        timeIni = System.currentTimeMillis();

        selectionSort(v);

        //Termina a contagem
        timeFim = System.currentTimeMillis();

        contSS = cont = timeFim - timeIni;

        System.out.println("SelectionSort executado em = " + cont + " ms");
    }

}
