package EncapsHerenca;
public class Aluno extends Pessoa {
//Atributos
private String matricula;
private String curso;
//Método Construtor
public Aluno(String nome, int idade, String sexo, String matricula, String curso) {
    super(nome, idade, sexo);
    this.matricula = matricula;
    this.curso = curso;
} 
//Métodos 
public void status() {
    System.out.println("Aluno: " + this.getNome());
    System.out.println("Idade: " + this.getIdade());
    System.out.println("Sexo: " + this.getSexo());
    System.out.println("Matrícula: " + this.getMatricula());
    System.out.println("Curso: " + this.getCurso());
}
public void cancelarMatricula() {
    System.out.println("Matrícula cancelada para o aluno: " + this.getNome());
}
//Métodos Getters e Setters
public String getMatricula() {
    return matricula;
}
public void setMatricula(String matricula) {
    this.matricula = matricula;
}
public String getCurso() {
    return curso;
}
public void setCurso(String curso) {
    this.curso = curso;
}
}
