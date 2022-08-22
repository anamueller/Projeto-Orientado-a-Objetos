package Exercicio9;

public class teste {
    public static void main(String[] args){
        FlyweightFactory factory = new FlyweightFactory();

        int random = (int)(Math.random() * 10 + 0);
        factory.getFlyweight(random).operacao(random);
        random = (int)(Math.random() * 10 + 0);
        factory.getFlyweight(random).operacao(random);
        random = (int)(Math.random() * 10 + 0);
        factory.getFlyweight(random).operacao(random);
    }
}
