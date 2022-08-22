package Decorator;
  
public class Invertido extends TextoDecorator  {
  public Invertido(Texto umTxt){
    super(umTxt);
    texto = new StringBuilder(texto).reverse().toString();
  }
}