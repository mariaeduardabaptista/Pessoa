package Classe;

public class Aluno extends Pessoa {
    private String matricula;


    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
     this.matricula = matricula;
    }
    public Aluno(String nome, String cpf, String matricula) {
        super.setNome(nome);
        super.setCpf(cpf);
        this.matricula = matricula;
    }

    public Aluno(String nome, String matricula){
        super.setNome(nome);
        super.setMatricula(matricula);
    }
}