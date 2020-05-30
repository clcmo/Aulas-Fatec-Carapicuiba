import java.util.Random;

class OrdenacaoSimples {
    private int [] v1, v2, v3;
    private int i = 0;

    public OrdenacaoSimples(int tam){
        v1 = new int[tam];
        v2 = new int[tam];
        v3 = new int[tam];
    }

    public void geraVetor() {
        Random geradorRandomico = new Random();
        while(i < v1.length){
            v1[i] = geradorRandomico.nextInt(100);
            v2[i] = v1[i];
            v3[i] = v1[i];
            i++;
        }
    }


    public StringBuilder getVetor1() {
        StringBuilder string = new StringBuilder();
        while(i<v1.length){
            string.append(v1[i]).append(" ");
            i++;
        }
        return string;
    }


    public StringBuilder getVetor2() {
        StringBuilder string = new StringBuilder();
        while(i<v2.length){
            string.append(v1[i]).append(" ");
            i++;
        }
        return string;
    }

    public StringBuilder getVetor3() {
        StringBuilder string = new StringBuilder();
        while(i<v3.length){
            string.append(v1[i]).append(" ");
            i++;
        }
        return string;
    }

    public void bubble() {
        int j, aux;
        for(i = 1; i<v1.length; i++){
            for(j = 0; j<v1.length-1;j++){
                if(v1[j]>v1[j+1]){
                    aux = v1[j];
                    v1[j] = v1[j+1];
                    v1[j+1] = aux;
                }
            }
        }
    }
    
    public void insertion() {
        int j, indexacao;
        for(i = 0; i<v2.length; i++){
            indexacao = v2[i];
            j= i-1;
            while(j>=0&&v2[j]>indexacao){
                v2[j+1] = v2[j];
                j--;
            }
            v2[j+1] = indexacao;
        }
    }

    public void selection() {
        int j, min, temp;
        for(i = 0; i<v3.length; i++){
            min = i;
            for(j = i+1; j<v3.length;j++){
                if(v3[j]<v3[min]) min = j;
                temp =v3[i];
                v3[i] = v3[min];
                v3[min] = temp;
            }
        }
    }
}
