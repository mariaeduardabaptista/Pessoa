package Classe;

public class Professor extends Pessoa {
    private String materiaTrabalhada; 


    public Professor(String nome, String cpf) {
        super(nome, cpf);
    }


    public String getMateriaTrabalhada() {
        return materiaTrabalhada;
    }


    public void setMateriaTrabalhada(String materiaTrabalhada) {
        this.materiaTrabalhada = materiaTrabalhada;
    }
    
}
