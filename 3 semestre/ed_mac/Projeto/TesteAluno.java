import static java.lang.Boolean.parseBoolean;
import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class TesteAluno {
    public static void main(String[] args) {
        Aluno aluno;

        String nomeAluno = showInputDialog("Informe o nome do aluno: ");
        int idadeAluno = parseInt(showInputDialog("Informe a idade do aluno: "));
        double pesoAluno = parseDouble(showInputDialog("Informe o peso do aluno: "));
        char sexoAluno = showInputDialog("Informe o sexo do aluno: ").charAt(0);
        boolean formadoAluno = parseBoolean(String.valueOf(showInputDialog("Informe se o aluno é formado \n" +
                "True para formado ou False para não formado)")));
        
        aluno = new Aluno(nomeAluno, idadeAluno, pesoAluno, sexoAluno, formadoAluno);

        showMessageDialog(null,
                "Aluno:" + aluno.getNome() + "\n" +
                        "Idade:" + aluno.getIdade() + "\n" +
                        "Peso:" + aluno.getPeso() + "\n" +
                        "Sexo:" + aluno.getSexo() + "\n" +
                        "Formado?:" + aluno.isFormando()
        );

        aluno.setNome(showInputDialog("O nome do aluno é: " + nomeAluno));
        aluno.setIdade(parseInt(showInputDialog("A idade do aluno é: " + idadeAluno)));
        aluno.setPeso(parseDouble(showInputDialog("O peso do aluno é: " + pesoAluno)));
        aluno.setSexo(showInputDialog("O sexo do aluno é: "  + sexoAluno).charAt(0));
        aluno.setFormando(parseBoolean(String.valueOf(
                showInputDialog("O aluno é formado?" + formadoAluno).charAt(0)))
        );

        new Aluno(aluno.getNome(), aluno.getIdade(), aluno.getPeso(),
                aluno.getSexo(), aluno.isFormando());

        showMessageDialog(null,
                "Aluno:" + aluno.getNome() + "\n" +
                        "Idade:" + aluno.getIdade() + "\n" +
                        "Peso:" + aluno.getPeso() + "\n" +
                        "Sexo:" + aluno.getSexo() + "\n" +
                        "Formado?:" + aluno.isFormando()
        );
    }
}
