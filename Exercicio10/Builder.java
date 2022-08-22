package Exercicio10;

public abstract class Builder{
    protected Entidade entidade;

    public Builder(){
        entidade = new Entidade();
    }

    public abstract void buildNome();

    public abstract void buildIdentidade();

    public Entidade getEntidade(){
        return entidade;
    }

    public abstract int checa();
}