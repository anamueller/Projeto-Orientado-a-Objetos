package Exercicio11;

public class CriadorCirculo implements CriadorShape{

    @Override
    public Shape criaShape() {
        return new Circulo();
    }
    
}
