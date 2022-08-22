package Exercicio10;

public class Empresa extends Builder{

    public Empresa(){};

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
        return 0; //eh uma empresa
    }
    
    
}
