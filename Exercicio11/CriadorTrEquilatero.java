package Exercicio11;

public class CriadorTrEquilatero implements CriadorShape{

    @Override
    public Shape criaShape() {
        return new TrEquilatero();
    }
    
}
