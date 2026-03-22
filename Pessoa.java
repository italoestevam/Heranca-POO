package EncapsHerenca;
public class Pessoa {
     // Atributos 
    private String nome;
    private int idade;
    private String sexo;
    // Método Construtor
    public Pessoa(String nome, int idade, String sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }
    public void fazerAniversario() {
        this.idade++;
    }
    // Métodos Getters e Setters
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        if(idade > 15) {
            this.idade = idade;
        } else {
            System.out.println("Idade inválida. A idade deve ser maior que 15.");
        }
    }
    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    } 
}