class Aluno {

    //Atributos
    private int idade;
    private double peso;
    private String nome;
    private char sexo;
    private boolean formando = false;

    public Aluno(String nome, int idade, double peso, char sexo, boolean formando){
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.sexo = sexo;
        this.formando = formando;
    }


    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public boolean isFormando() {
        return formando;
    }

    public void setFormando(boolean formando) {
        this.formando = formando;
    }
}
