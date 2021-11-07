public class LKW extends Fahrzeug{
    
    //Variablen deklarieren
    int _maxLandung;

    //Constructor
    public LKW(String marke, String typ, int ps, int preis, int maxLadung){
        super(marke, typ, ps, preis);
        this.setMaxLandung(maxLadung);
    }


    public void setMaxLandung(int maxLandung) {
        this._maxLandung = maxLandung;
    }

    public int getMaxLandung() {
        return _maxLandung;
    }


}
