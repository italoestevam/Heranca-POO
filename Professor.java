package EncapsHerenca;

public class Professor extends Pessoa {
    //Atributos 
    private String especialidade;
    private double salario;
    //Método Construtor
    public Professor(String nome, int idade, String sexo, String especialidade, double salario) {
        super(nome, idade, sexo);
        this.especialidade = especialidade;
        this.salario = salario;
    }
    //Métodos
    public void status() {
        System.out.println("Professor: " + this.getNome());
        System.out.println("Idade: " + this.getIdade());
        System.out.println("Sexo: " + this.getSexo());
        System.out.println("Especialidade: " + this.getEspecialidade());
        System.out.println("Salário: R$ " + this.getSalario());
    }
    public void receberAumento(double valor) {
        this.salario += valor;
        System.out.println("Salário atualizado para: R$ " + this.getSalario());
    }
    //Métodos Getters e Setters
    public String getEspecialidade() {
        return especialidade;
    }
    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        if(salario > 0) {
            this.salario = salario;
        } else {
            System.out.println("Salário inválido. O salário deve ser maior que zero.");
        }
    } 
}
