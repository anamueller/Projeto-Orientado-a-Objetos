package Exercicio6;

public class teste {
    public static void main(String args []){
        Facade f1, f2, f3;
        f1 = Facade.obterInstancia();
        f2 = Facade.obterInstancia();
        f3 = Facade.obterInstancia();
        if(f1==f2 && f2==f3){
            System.out.println("f1, f2, e f3 são iguais.");
        }
    }
}
