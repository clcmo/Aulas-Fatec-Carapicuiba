public class Aluno {
  //Classe de Negócio
  
  //Atributos
  private int anoNasc;
  private String nome;
  private char sexo;
  private boolean formando;
  
  //Construtor
  public Aluno(int anoNasc, String nome, char sexo, boolean formando){
    setAnoNasc(anoNasc);
    setNome(nome);
    setSexo(sexo);
    setFormando(formando);
  }
  
  public Aluno(){
    setNome("Nooooo");
  }
  
  //Métodos
  public int getAnoNasc() { return anoNasc; }
 
  public void setAnoNasc(int anoNasc) { this.anoNasc = anoNasc; }
  
  public String getNome() { return nome; }
 
  public void setNome(String nome) { this.nome = nome; }
  
  public char getSexo() { return sexo; }
 
  public void setSexo(char sexo) { this.sexo = sexo; }
  
  public boolean getFormando() { return formando; }
 
  public void setFormando(boolean formando) { this.formando = formando; }
  
}
