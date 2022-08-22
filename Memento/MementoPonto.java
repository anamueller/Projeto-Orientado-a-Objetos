package Memento;

public class MementoPonto {
    protected int estadoPonto[] = new int[2];
    
    public MementoPonto(int x, int y){
        estadoPonto[0] = x;
        estadoPonto[1] = y;
    }

    public int[] getPontoSalvo(){
        return estadoPonto;
    }

}
