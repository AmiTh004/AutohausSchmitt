public class Sportwagen extends Fahrzeug {
    

    String _maxGeschwindigkeit;

    public Sportwagen(String marke, String typ, String ps, int preis, String maxGeschwindigkeit){
        super(marke, typ, ps, preis);
        this.setMaxGeschwindigkeit(maxGeschwindigkeit);
    }

    public void setMaxGeschwindigkeit(String maxGeschwindigkeit) {
        this._maxGeschwindigkeit = maxGeschwindigkeit;
    }

    public String getMaxGeschwindigkeit() {
        return _maxGeschwindigkeit;
    }
}
