package Decorator;
  
public class CaixaAlta extends TextoDecorator {
  public CaixaAlta(Texto umTxt){
    super(umTxt);
    texto = texto.toUpperCase();
  }
}