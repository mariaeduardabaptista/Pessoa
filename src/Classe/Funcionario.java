package Classe;

public class Funcionario extends Pessoa {
    private String carteiraDeTrabalho;

    public Funcionario(String nome, String cpf) {
        super(nome, cpf);

    }

    public String getCarteiraDeTrabalho() {
        return carteiraDeTrabalho;
    }

    public void setCarteiraDeTrabalho(String carteiraDeTrabalho) {
        this.carteiraDeTrabalho = carteiraDeTrabalho;
    } 
    
}
