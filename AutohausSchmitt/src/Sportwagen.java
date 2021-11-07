public class Sportwagen extends Fahrzeug {
    

    int _maxGeschwindigkeit;

    public Sportwagen(String marke, String typ, int ps, int preis, int maxGeschwindigkeit){
        super(marke, typ, ps, preis);
        this.setMaxGeschwindigkeit(maxGeschwindigkeit);
    }

    public void setMaxGeschwindigkeit(int maxGeschwindigkeit) {
        this._maxGeschwindigkeit = maxGeschwindigkeit;
    }

    public int getMaxGeschwindigkeit() {
        return _maxGeschwindigkeit;
    }
}
