public class Verkauf {

    Auto _auto;
    Kunde _kunde;
    Verkaeufer _verkaeufer;
    String _datum;
    int _preis;

    public Verkauf(Auto auto,Kunde kunde, Verkaeufer verkaeufer, String datum, int preis){
        this.setAuto(auto);
        this.setKunde(kunde);
        this.setVerkaeufer(verkaeufer);
        this.setDatum(datum);
        this.setPreis(preis);
    }

    public Auto getAuto() {
        return _auto;
    }
    public void setAuto(Auto auto) {
        this._auto = auto;
    }

    public Kunde getKunde() {
        return _kunde;
    }
    public void setKunde(Kunde kunde) {
        this._kunde = kunde;
    }

    public int getPreis() {
        return _preis;
    }
    public void setPreis(int preis) {
        this._preis = preis;
    }

    public Verkaeufer getVerkaeufer() {
        return _verkaeufer;
    }
    public void setVerkaeufer(Verkaeufer verkaeufer) {
        this._verkaeufer = verkaeufer;
    }
    public void setDatum(String datum) {
        this._datum = datum;
    }
    public String getDatum() {
        return _datum;
    }
    
}
