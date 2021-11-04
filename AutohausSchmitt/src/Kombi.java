public class Kombi extends Fahrzeug {

    int _sitzplaetze;
    
    public Kombi(String marke, String typ, String ps, int preis, int sitzplaetze){
        super(marke, typ, ps, preis);
        if (sitzplaetze == 7) {
           setSitzplaetze(sitzplaetze); 
        }

    }

    public void setSitzplaetze(int sitzplaetze) {
        this._sitzplaetze = sitzplaetze;
    }

    public int getSitzplaetze() {
        return _sitzplaetze;
    }


}
