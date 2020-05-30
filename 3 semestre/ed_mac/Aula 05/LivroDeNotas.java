//O livro de notas deve armazenar o nome de um curso e uma lista de alunos que frequentam o curso
public class LivroDeNotas {

    //private static int contador;
    private String nomeDoCurso;

    // utilizando o construtor padrão
    public LivroDeNotas(){}

    // utilizando o construtor com o método modificador
    public LivroDeNotas(String nomeDoCurso){
        this.nomeDoCurso = nomeDoCurso;
    }

    // métodos de acesso
    public String getNomeDoCurso(){
        return nomeDoCurso;
    }

    //métodos modificadores
    public void setNomeDoCurso(String nomeDoCurso){
        this.nomeDoCurso = nomeDoCurso;
    }
}