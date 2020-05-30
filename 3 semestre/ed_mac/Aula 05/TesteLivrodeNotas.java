import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class TesteLivroDeNotas{
    public static void main(String[] args) {
        LivroDeNotas livroDeNotas = new LivroDeNotas();
        
        // pedindo ao usuário informar o nome do curso
        String nomeDoCurso = showInputDialog("Digite o nome do Curso");
        livroDeNotas.setNomeDoCurso(nomeDoCurso);
        System.out.println(livroDeNotas.getNomeDoCurso());
        
        //informar um nome de curso já criado internamente
        LivroDeNotas livroDeNotas1 = new LivroDeNotas("ED");
        System.out.println(livroDeNotas1.getNomeDoCurso());
    }
}