public class Fahrzeug {

    // Variablen deklarieren
    String _marke;
    String _typ;
    String _ps;
    int _preis;


    // Constructor initialisiert die Variablen
    public Fahrzeug(String marke, String typ, String ps, int preis){
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

    public void setPs(String ps) {
        this._ps = ps;
    }

    public String getPs() {
        return _ps;
    }

    public void setTyp(String typ) {
        this._typ = typ;
    }

    public String getTyp() {
        return _typ;
    }

}
