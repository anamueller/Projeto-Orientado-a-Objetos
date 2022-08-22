package Exercicio11;

public abstract class CriaShape {
    private Shape NULL;

    public Shape criarShape(int option){
        switch(option){
            case 0:
                return new Circulo();
            case 1:
                return new Quadrado();
            case 2:
                return new TrEquilatero();
            default:
                return NULL;
        }
    }
}
