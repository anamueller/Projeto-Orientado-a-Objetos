package Exercicio8;
import java.util.ArrayList;

public class MediadorConcreto extends Mediador{
    ArrayList<Colaborador> c = new ArrayList<Colaborador>();

    public MediadorConcreto(){}

    public void adicionar(Colaborador o) {
        c.add(o);
    }
    
    public void remover(Colaborador o) {
        c.remove(o);
    }

    public void enviaMensagem(){
        for(int i=0;i<c.size();i++){
            c.get(i).chamarReceber();
        }
    }
}
