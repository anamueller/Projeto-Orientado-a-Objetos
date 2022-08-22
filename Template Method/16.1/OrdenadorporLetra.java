public class OrdenadorporLetra extends OrdenadorTemplate {
 
    @Override
    public boolean isPrimeiro(Palavra p1, Palavra p2) {
        int t1 = p1.word.length();
        String l1 = p1.charAt(t1);
        int t2 = p2.word.length();
        String l2 = p2.charAt(t2);
        if (l1.compareToIgnoreCase(l2) <= 0) {
            return true;
        }
        return false;
    }
 
}