package methods;

class Methods {
    private static int i, j, aux;

    //InsertionSort
    static void insertionSort(int[] v) {
        for (j = 1; j < v.length; j++) {
            aux = v[j];
            for (i = j - 1; (i >= 0) && (v[i] > aux); i--)
                v[i + 1] = v[i];
            v[i + 1] = aux;
        }
    }

    //BubbleSort
    static void bubbleSort(int v[]){
        boolean change = true;
        while (change) {
            change = false;
            for (i = 0; i < v.length - 1; i++) {
                if (v[i] > v[i + 1]) {
                    aux = v[i];
                    v[i] = v[i + 1];
                    v[i + 1] = aux;
                    change = true;
                }
            }
        }
    }

    //QuickSort com método de separar os dados
    static void quickSort(int[] v, int ini, int fim) {
        if (ini < fim) {
            int posPivot = split(v, ini, fim);
            quickSort(v, ini, posPivot - 1);
            quickSort(v, posPivot + 1, fim);
        }
    }

    private static int split(int[] v, int ini, int fim) {
        int pivot = v[ini], i = ini + 1, f = fim;
        while (i <= f) {
            if (v[i] <= pivot)
                i++;
            else if (pivot < v[f])
                f--;
            else {
                int change = v[i];
                v[i] = v[f];
                v[f] = change;
                i++;
                f--;
            }
        }
        v[ini] = v[f];
        v[f] = pivot;
        return f;
    }

    //SelectionSort
    static void selectionSort(int[] array) {
        for (int fix = 0; fix < array.length - 1; fix++) {
            int minor = fix;

            for (int i = minor + 1; i < array.length; i++)
                if (array[i] < array[minor])
                    minor = i;

                if (minor != fix) {
                int t = array[fix];
                array[fix] = array[minor];
                array[minor] = t;
            }
        }
    }
}