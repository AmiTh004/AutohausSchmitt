public class Auto{

    // Variablen deklarieren
    String _marke;
    int _preis;
    String _modell;
    String _baujahr;


    // Constructor initialisiert die Variablen
    public Auto(String marke, String modell, String baujahr){   //Methodensignatur
        this.setMarke(marke);           // Verweiß auf den Setter
        this.setModell(modell);
        this.setBaujahr(baujahr);
    }

    public void printObject(){
        System.out.println(_marke);
        System.out.println(_modell);
    }

    public String getBaujahr() {
        return _baujahr;
    }

    public void setBaujahr(String baujahr) {
        this._baujahr = baujahr;
    }

    public String getMarke() {
        return _marke;
    }

    public void setMarke(String marke) {
        this._marke = marke;
    }

    public String getModell() {
        return _modell;
    }
    
    public void setModell(String modell) {
        this._modell = modell;
    }

    public int getPreis() {
        return _preis;
    }
    public void setPreis(int preis) {
        this._preis = preis;
    }


   
}
