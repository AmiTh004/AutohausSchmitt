public class App {

    static Auto [] _autos;
    static Kunde [] _kunde;
    static Verkaeufer [] _verkaeufer;

    public static void main(String[] args) throws Exception {
        // intitialisieren von _autos
        
        _autos = new Auto[8];   // [8] -> Anzahhl der maximal möglichen Elemente
        _kunde = new Kunde[4];
        _verkaeufer = new Verkaeufer[3];
        
        //_autos [0] = new Auto("Ford", "t", "2020");
        //_autos [1] = new Auto("VW", "Bus", "2004");
        //_autos [2] = new Auto("audi", "R5", "2018");

        Menu menu = new Menu();
        menu.startMenu();        
    }

    // Zusammenfassung der spezifischen Methoden. Datentyp durch übergeordnetes Objekt ersetzt
    public static void addObject(Object ele, Object[] array){
        int i = 0;
        for (Object a : array) {
            if(a == null){
                array[i]= ele;
            }
            i++;
        }
    }

    public static void addAuto(Auto auto){
        addObject(auto, getALLAutos());
    }

    public static void addKunde(Kunde kunde){
        addObject(kunde, getALLKunde());
    }

    public static void addVerkaeufer(Verkaeufer verkaeufer){
        addObject(verkaeufer, getALLVerkaeufer());
    }
    
    public static Verkaeufer[] getALLVerkaeufer(){
        return _verkaeufer;
    }

    public static Kunde[] getALLKunde(){
        return _kunde;
    }

    public static Auto[] getALLAutos(){
        return _autos;

    }

}