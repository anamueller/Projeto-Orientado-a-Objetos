package Decorator;

public abstract class TextoDecorator extends Texto {
  Texto txt;
 
  public TextoDecorator(Texto umTxt) {
    txt = umTxt;
  }
 
  @Override
  public String getTexto() {
    return txt.getTexto();
  }
}