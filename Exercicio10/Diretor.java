package Exercicio10;

public class Diretor {
    protected Builder builder;

    public Diretor(Builder b){
        this.builder=b;
    }

    public void construir(){
        int check = builder.checa();
        if(check==0){ //empresa precisa criar uma pessoa depois cria-se a empresa
            Pessoa p = new Pessoa();
            p.buildNome();
            p.buildIdentidade();
            builder.buildNome();
            builder.buildIdentidade();
        }
        else if(check==1){//criando pessoa normal
            builder.buildNome();
            builder.buildIdentidade();
        }
    }

    public Entidade getProduto(){
        return builder.getEntidade();
    }
}
