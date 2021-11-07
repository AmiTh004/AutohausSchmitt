public class Kombi extends Fahrzeug {

    boolean _siebenSitzplaetze;
    
    public Kombi(String marke, String typ, int ps, int preis, boolean siebenSitzplaetze){
        super(marke, typ, ps, preis);
        this.setSiebenSitzplaetze(siebenSitzplaetze);

    }

    public void setSiebenSitzplaetze(boolean siebenSitzplaetze) {
        this._siebenSitzplaetze = siebenSitzplaetze;
    }

    public boolean getSiebenSitzplaetze() {
        return _siebenSitzplaetze;
    }

}
