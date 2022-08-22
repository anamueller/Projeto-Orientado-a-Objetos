package Exercicio9;

public class Algarismo extends AlgarismoFlyweight {
    protected int digito=-1;

    public Algarismo(int d){
        digito=d;
    }

    @Override
    public void operacao(int num) {
        System.out.printf("%d", num);
    }

    @Override
    public int getNum(){
        return digito;
    }
}
