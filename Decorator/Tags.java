package Decorator;
  
public class Tags extends TextoDecorator  {
  public Tags(Texto umTxt){
    super(umTxt);
    texto = "<"+texto+">";
  }
}