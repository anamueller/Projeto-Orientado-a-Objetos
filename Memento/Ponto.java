package Memento;

public class Ponto {
    protected int pontos[] = new int[2];
    Fonte pontoFonte;
    
    public Ponto() {
        pontoFonte = new Fonte();
        pontos[0]=0;
        pontos[1]=0;
    }

    public void setNums(int x, int y){
        pontoFonte.addMemento(new MementoPonto(x, y));
        pontos[0]=x;
        pontos[1]=y;
    }

    public void undo(){
        pontos = pontoFonte.getUltimoMemento().getPontoSalvo();
    }

    public void mostrarPonto(){
        System.out.printf("Pontos atuais: x: y:", pontos[0], pontos[1]);
    }
}
