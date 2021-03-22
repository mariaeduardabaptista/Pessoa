package Programas;
import Classe.Aluno;

public class Programas {
    public static void main(String[] args) {

        Aluno Aluno = new Aluno("duda", "12345");
        
        aluno.setEndereco("travessa arlindo, 819");
        aluno.setTelefone("2345678");
        aluno.setMaricula("678");

        System.out.println("pessoa:" + aluno.getNome());
        System.out.println("endereço:" + aluno.getEndereco());
        System.out.println("Telefone" + aluno.getTelefone());

    
}

}
