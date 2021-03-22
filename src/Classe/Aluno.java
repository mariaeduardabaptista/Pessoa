package Classe;

public class Aluno extends Pessoa {
    private String Matricula;



    public Aluno(String nome, String cpf) {
        super(nome, cpf);
    }

    public String getMatricula() {
        return Matricula;
    }
    public void setMatricula(String matricula) {
        Matricula = matricula;
    }
    
}

}