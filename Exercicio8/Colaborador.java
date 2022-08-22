package Exercicio8;

public abstract class Colaborador {
    private Mediador mediador;

    public void setMediador(Mediador m){
        mediador = m;
    }

    public void chamarEnviar(){
        mediador.enviaMensagem();
    }

    public void chamarReceber(){
        
    }
}
