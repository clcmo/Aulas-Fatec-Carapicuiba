//programa que le a opcao de operacao, executa a operacao desejada e le o resultado

import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class Calculadora {

    static char menu() {
//        o método está associado a classe, pq ele é estático
        char op;
        do {
            op = showInputDialog("Digite sua opcao:" +
                    "\n+ = soma" +
                    "\n- = subtracao" +
                    "\n* = multiplicacao" +
                    "\n/ = divisao" +
                    "\ns = sair").charAt(0);
        } while (op != '+' && op != '-' && op != '*' && op != '/' && op != 's' && op != 'S');
        return op;
    }

    public static void main(String[] args) {
        char opcao = menu();
        int res;
        while (opcao != 's' && opcao != 'S') {
//            Leitura
            int num1 = parseInt(showInputDialog("Digite o primeiro valor: "));
            int num2 = parseInt(showInputDialog("Digite o segundo valor: "));
//            Processamento
            switch (opcao) {
                case '+':
                    res = soma(num1, num2);
                    showMessageDialog(null, res);
                    break;
                case '-':
                    res = sub(num1, num2);
                    showMessageDialog(null, res);
                    break;
                case '*':
                    res = mult(num1, num2);
                    showMessageDialog(null, res);
                    break;
                case '/':
                    res = div(num1, num2);
                    showMessageDialog(null, res);
                    break;
                default:
                    showMessageDialog(null, "Opcao invalida");
                    break;
            }
//            Fim da operacao e retorno ao menu
            opcao = menu();
        }
        showMessageDialog(null, "Obrigada, volte sempre =)");
    }

    private static int div(int num1, int num2) {
        return num1 / num2;
    }

    private static int mult(int num1, int num2) {
        return num1 * num2;
    }

    private static int sub(int num1, int num2) {
        return num1 - num2;
    }

    private static int soma(int num1, int num2) {
        return num1 + num2;
    }
}
