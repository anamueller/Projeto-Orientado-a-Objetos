package Exercicio8;

public class Colaborador_Green extends Colaborador{

    public void receber(){
        System.out.println("Green");
        super.chamarReceber();
    }

    public void enviar(){
        super.chamarEnviar();
    }
}
