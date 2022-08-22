package Exercicio8;

public class Colaborador_Blue extends Colaborador{

    public void receber(){
        System.out.println("Blue");
        super.chamarReceber();
    }

    public void enviar(){
        super.chamarEnviar();
    }
}
