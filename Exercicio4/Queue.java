package Exercicio4;
//Ana Clara Miranda
//Sara Mota

//import java.util.List;
//import java.util.Vector;
//import java.util.ArrayList;

/*public class Queue{
    TipoLista l;

    public Queue(TipoLista lista){
        l =  lista;
    }

    public void enqueue(Object o){
        l.adicionar(o);
    }

    public Object dequeue(int index){
        return l.remover(index);
    }

    public boolean isEmpty(){
        if(l.getSize()==0){
            return true;
        }
        else if(l.getSize()!=0){
            return false;
        }
    }

    public int size(){
        return l.getSize();
    }
}


/*public class ArrayListQueue implements TipoLista{
    ArrayList<Object> array = new ArrayList<Object>();

    public void adicionar(Object o){
        array.add(o);
    }
    
    public Object remover(int index){
        array.remove(index);
    }

    public int getSize(){
        return array.size();
    }
}

public class VectorQueue implements TipoLista{
    Vector <Object> vec = new Vector<Object>();
    
    public void adicionar(Object o){
        vec.add(o);
    }
   
    public Object remover(int index){
        vec.remove(index);
    }

    public int getSize(){
        return vec.size();
    }
}

public interface TipoLista{

    public void adicionar(Object o);

    public int getSize();

    public Object remover(int index);
}

public class FIFO extends Queue{
}

public class LIFO extends Queue{

}*/