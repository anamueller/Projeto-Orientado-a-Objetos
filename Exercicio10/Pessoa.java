package Exercicio10;

public class Pessoa extends Builder{

    public Pessoa(){};

    @Override
    public void buildNome() {
        System.out.printf("Banco de Dados acessado");
        entidade.nome = "Ana";
        
    }

    @Override
    public void buildIdentidade() {
        System.out.printf("Banco de Dados acessado");
        entidade.identidade = 148806;
    }

    @Override
    public int checa() {
        return 1;  //eh uma pessoa
    }
    
}
