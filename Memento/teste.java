package Memento;

public class teste {
    public static void main(String[] args){
        Ponto p = new Ponto();
        p.setNums(8, 9);
        p.setNums(7, 4);
        p.setNums(6, 2);
        p.setNums(10, 1);
        p.undo();
        p.undo();
        p.mostrarPonto();
    }
}
