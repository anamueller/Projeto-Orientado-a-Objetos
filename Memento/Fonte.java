package Memento;

import java.util.ArrayList;

public class Fonte {
    protected ArrayList<MementoPonto> estados;

    public Fonte(){
        estados = new ArrayList<MementoPonto>();
    }

    public void addMemento(MementoPonto m){
        estados.add(m);
    }

    public MementoPonto getUltimoMemento(){
        if(estados.size()<=0){
            System.out.printf("Nenhum memento criado ainda, criação default 0 0");
            return new MementoPonto(0,0);
        }
        MementoPonto estadoSalvo = estados.get(estados.size()-1);
        estados.remove(estados.size()-1);
        int retorno[] = estadoSalvo.getPontoSalvo();
        System.out.printf("Memento recuperado: x:%d e y:%d", retorno[0], retorno[1]);
        return estadoSalvo;
    }

}