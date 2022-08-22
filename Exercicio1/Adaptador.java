package Exercicio1;

public class Adaptador extends RasterBox{    
    RasterBox rb = new RasterBox();
    
    public int getX(){
        int x = rb.getTopLeft().x;
        return x;
    }

    public int getY(){
        int y = rb.getTopLeft().y;
        return y;
    }

    public int getHeight(){
        int height = rb.getBottomRight().x;
        return height;
    }

    public int getWidth(){
        int width = rb.getBottomRight().y;
        return width;
    }
       
}
