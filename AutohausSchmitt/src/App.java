public class App {

    static Auto [] _autos;
    static Kunde [] _kunde;
    static Verkaeufer [] _verkaeufer;

    public static void main(String[] args) throws Exception {
        // intitialisieren von _autos
        _autos = new Auto[8];

        _autos [0] = new Auto("Ford", "t", "2020");
        _autos [1] = new Auto("VW", "Bus", "2004");
        _autos [2] = new Auto("audi", "R5", "2018");

        _kunde = new Kunde[4];
        _verkaeufer = new Verkaeufer[3];
        
        Menu menu = new Menu();
        menu.startMenu();        
    }

    public static void addAuto(Auto auto){
        _autos[0] = auto;
    }

    public static Auto[] getALLAutos(){
        return _autos;

    }

    public static void addKunde(Kunde kunde){
        _kunde[0] = kunde;
    }

    public static void addVerkaeufer(Verkaeufer verkaeufer){
        _verkaeufer[0] = verkaeufer;
    }

}