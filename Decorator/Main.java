package Decorator;

public class Main{
  public static void main(String[] args){
    Texto testando = new Texto2("ana");
    testando = new Tags(testando);
    System.out.printf("%s", testando.getTexto());
  }
}