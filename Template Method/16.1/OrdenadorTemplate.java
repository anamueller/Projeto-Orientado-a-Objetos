import java.util.ArrayList;

public abstract class OrdenadorTemplate {
    public abstract boolean isPrimeiro(Palavra p1, Palavra p2);
 
    public ArrayList<Palavra> ordenarPalavras(ArrayList<Palavra> lista) {
        ArrayList<Palavra> novaLista = new ArrayList<Palavra>();
        for (Palavra words : lista) {
            novaLista.add(words);
        }
 
        for (int i = 0; i < novaLista.size(); i++) {
            for (int j = i; j < novaLista.size(); j++) {
                if (!isPrimeiro(novaLista.get(i), novaLista.get(j))) {
                    Palavra temp = novaLista.get(j);
                    novaLista.set(j, novaLista.get(i));
                    novaLista.set(i, temp);
                }
            }
        }
 
        return novaLista;
    }
}