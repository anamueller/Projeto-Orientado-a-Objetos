package Exercicio11;

public class CriadorQuadrado implements CriadorShape{

    @Override
    public Shape criaShape() {
        return new Quadrado();
    }
    
}
