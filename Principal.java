package EncapsHerenca;
public class Principal {
    public static void main(String[] args) {
      //Principal 

    Pessoa p1 = new Pessoa(null, 0, null); 
    Aluno p2 = new Aluno("Italo", 22, "Masculino" , "SIM", "Programação");
    Professor p3 = new Professor("Carlos",55 , "Masculino" ,"Biológia" , 1500);
    Funcionario p4 = new Funcionario("LUANA", 30,"Feminina", "Bigradista", true);

      p2.status();
      System.out.println("---------------------------");
      p3.status();
      p3.receberAumento(600);
      System.out.println("---------------------------");
      p4.status();
      p4.mudarTrabalho();
    }  
}
