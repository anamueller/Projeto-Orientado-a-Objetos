package Exercicio8;

public class Colaborador_Red extends Colaborador{

    public void receber(){
        System.out.println("Red");
        super.chamarReceber();
    }

    public void enviar(){
        super.chamarEnviar();
    }
}
