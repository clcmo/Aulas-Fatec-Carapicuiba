public class TesteAluno {
  //Classe de Aplicacao
  
  public static void main(String[] args) {
    //Declarar a variavel Aluno
    Aluno aluno1;
    Aluno aluno2;
    Aluno aluno3;
    
    //Instanciar a variavel
    //aluno1 = new Aluno();
    aluno1 = new Aluno(2000, "Ana", 'F', true);
    aluno2 = new Aluno();
    aluno3 = new Aluno(2002, "Gil", 'M', true);
    
    //setAnoNasc - Chamar método de encapsulamento
    //aluno1.setAnoNasc(2000);
    //aluno1.setNome("Ana");
    //aluno1.setSexo('F');
    //aluno1.setFormando(true);
    
    
    //Impressão dos valores na tela
    System.out.println("Ano de nascimento: " + aluno1.getAnoNasc());
    System.out.println("Nome: " + aluno1.getNome());
    System.out.println("Sexo: " + aluno1.getSexo());
    System.out.println("Formando: " + aluno1.getFormando());
    
    System.out.println("Ano de nascimento: " + aluno2.getAnoNasc());
    System.out.println("Nome: " + aluno2.getNome());
    System.out.println("Sexo: " + aluno2.getSexo());
    System.out.println("Formando: " + aluno2.getFormando());
    
    System.out.println("Ano de nascimento: " + aluno3.getAnoNasc());
    System.out.println("Nome: " + aluno3.getNome());
    System.out.println("Sexo: " + aluno3.getSexo());
    System.out.println("Formando: " + aluno3.getFormando());
  }
}
