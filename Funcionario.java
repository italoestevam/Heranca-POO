package EncapsHerenca;
public class Funcionario extends Pessoa {
    //Atributos 
    private String setor;
    private boolean trabalhando;
    //Método Construtor
    public Funcionario( String nome, int idade, String sexo, String setor, boolean trabalhando) {
        super(nome, idade, sexo); {
        this.setor = setor;
        this.trabalhando = trabalhando;
    }
}
    //Métodos
    public void status() {
        System.out.println("Funcionário: " + this.getNome());
        System.out.println("Idade: " + this.getIdade());
        System.out.println("Sexo: " + this.getSexo());
        System.out.println("Setor: " + this.getSetor());
        System.out.println("Trabalhando: " + (this.isTrabalhando() ? "Sim" : "Não"));
    }
    public void mudarTrabalho() {
        this.trabalhando = !this.trabalhando;
        System.out.println("Situação de trabalho atualizada para: " + (this.isTrabalhando() ? "Sim" : "Não"));
    }   
    //Métodos Getters e Setters
    public String getSetor() {
        return setor;
    }
    public void setSetor(String setor) {
        this.setor = setor;
    }
    public boolean isTrabalhando() {
        return trabalhando;
    }
    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }  
}
