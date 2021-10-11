public class Methoden {
    
    // Methode gibt Anzahl der zugewisenen Elemente in Array zurück (Integer)
    public int elesInArray(Object[] array){
        int i=0;
        for (Object o : array) {
            if (o != null) {
                i++;
            }
        }
        return i;
    }
}
