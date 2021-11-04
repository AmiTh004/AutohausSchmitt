public class Gelaendewagen extends Fahrzeug {
    
    String _maxKippradius;

    public Gelaendewagen(String marke, String typ, String ps, int preis, String maxKippradius){
        super(marke, typ, ps, preis);
        this.setMaxKippradius(maxKippradius);
    }

    public void setMaxKippradius(String maxKippradius) {
        this._maxKippradius = maxKippradius;
    }

    public String getMaxKippradius() {
        return _maxKippradius;
    }
}
