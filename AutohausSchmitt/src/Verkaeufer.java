public class Verkaeufer {

    String _vorname;
    String _nachname;
    int _personalnummer;

    public Verkaeufer(String vorname, String nachname, int personalnummer){
        this.setVorname(vorname);
        this.setNachname(nachname);
        this.setPersonalnummer(personalnummer);
    }

    public String getVorname() {
        return _vorname;
    }
    public void setVorname(String vorname) {
        this._vorname = vorname;
    }

    public String getNachname() {
        return _nachname;
    }
    public void setNachname(String nachname) {
        this._nachname = nachname;
    }

    public int getPersonalnummer() {
        return _personalnummer;
    }
    public void setPersonalnummer(int personalnummer) {
        this._personalnummer = personalnummer;
    }

    
}
