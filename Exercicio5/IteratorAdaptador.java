package Exercicio5;

import java.util.Enumeration;
import java.util.Iterator;

public class IteratorAdaptador<E> implements Enumeration<E>{
    private final Iterator<E> iterator;

    public IteratorAdaptador(Iterator<E> it) {
        this.iterator = it;
    }

    @Override
    public boolean hasMoreElements() {
        return iterator.hasNext();
    }

    @Override
    public E nextElement() {
        return iterator.next();
    }
}