public class Gelaendewagen extends Fahrzeug {
    
    int _maxKippradius;

    public Gelaendewagen(String marke, String typ, String ps, int preis, int maxKippradius){
        super(marke, typ, ps, preis);
        this.setMaxKippradius(maxKippradius);
    }

    public void setMaxKippradius(int maxKippradius) {
        this._maxKippradius = maxKippradius;
    }

    public int getMaxKippradius() {
        return _maxKippradius;
    }
}
