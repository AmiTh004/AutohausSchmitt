public class Fahrzeug {

    // Variablen deklarieren
    String _marke;
    String _typ;
    int _ps;
    int _preis; // float (4 byte) und double (8 byte) für Dezimalzahlen


    // Constructor initialisiert die Variablen
    public Fahrzeug(String marke, String typ, int ps, int preis){
        this.setPreis(preis);
        this.setMarke(marke);
        this.setPs(ps);
        this.setTyp(typ);
    }

    //Setter und Getter
    public void setMarke(String marke) {
        this._marke = marke;
    }

    public String getMarke() {
        return _marke;
    }

    public void setPreis(int preis) {
        this._preis = preis;
    }

    public int getPreis() {
        return _preis;
    }

    public void setPs(int ps) {
        this._ps = ps;
    }

    public int getPs() {
        return _ps;
    }

    public void setTyp(String typ) {
        this._typ = typ;
    }

    public String getTyp() {
        return _typ;
    }

}
