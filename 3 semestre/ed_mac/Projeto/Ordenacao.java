import java.util.Date;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class Ordenacao{
    public static void main (String[] args) throws java.lang.Exception
    {
        Date dt = new Date();
        Long et[] = new Long[3];
        int tam = Integer.parseInt(showInputDialog("Informe o tamanho desejado para o vetor"));
        OrdenacaoSimples os = new OrdenacaoSimples(tam);
        os.geraVetor();

        //BubbleSort

        showMessageDialog(null, "Iniciando o método BubbleSort");
        showMessageDialog(null, "Vetor Inicial(1)" + os.getVetor1());
        et[0] = new Date().getTime();
        os.bubble();
        et[0] = new Date().getTime() - et[0];
        showMessageDialog(null, "Bubble: " + os.getVetor1());

        //InsertionSort

        showMessageDialog(null, "Iniciando o método InsertionSort");
        showMessageDialog(null, "Vetor Inicial(2)" + os.getVetor2());
        et[1] = new Date().getTime();
        os.insertion();
        et[1] = new Date().getTime() - et[1];
        showMessageDialog(null, "Insertion: " + os.getVetor2());

        //SeletionSort

        showMessageDialog(null, "Iniciando o método SelectionSort");
        showMessageDialog(null, "Vetor Inicial(3)" + os.getVetor3());
        et[2] = new Date().getTime();
        os.selection();
        et[2] = new Date().getTime() - et[2];
        showMessageDialog(null, "Selection: " + os.getVetor3());

        //Tempo de Execucao
        showMessageDialog(null, "Tempo de Execucao\n" + 
                "Bubble: " + et[0] +"\n" +
                "Insertion: " + et[1] +"\n" +
                "Selection: " + et[2] +"\n");
        
    }
}
