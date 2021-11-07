import java.util.ArrayList;
public class App {

    static Auto [] _autos;
    static Kunde [] _kunde;
    static Verkaeufer [] _verkaeufer;
    static Verkauf [] _verkauf;

    public static void main(String[] args) throws Exception {
        // intitialisieren von _autos

        ArrayList<Fahrzeug> fahrzeuge = new ArrayList<Fahrzeug>();

        fahrzeuge.add(new Kombi("VW", "Touran", 150, 2000, true));
        fahrzeuge.add(new Kombi("VW", "Tiguan", 165, 12900, true));
        fahrzeuge.add(new Kombi("VW", "Polo", 74, 3579, false));

        // Punktnotation an dem jewieligen Objekt .getPS()
        // if Abfrage - verglichen wird PS
        // ArrayLaos durchgehen - iterieren -Ok

        Fahrzeug maxAuto = fahrzeuge.get(0);
        for (Fahrzeug f : fahrzeuge) {
            if (f.getPs() > maxAuto.getPs()) {
                maxAuto = f;
            }
        }

        System.out.println("Das Auto mit der höchsten PS Zahl hat" + maxAuto.getPs());

        _autos = new Auto[8];   // [8] -> Anzahhl der maximal möglichen Elemente
        _kunde = new Kunde[4];
        _verkaeufer = new Verkaeufer[3];
        _verkauf = new Verkauf[8];

        // Demodaten
        _autos [0] = new Auto("Ford", "T", "2020");
        _autos [1] = new Auto("VW", "Bus", "2004");
        _autos [2] = new Auto("audi", "R5", "2018");

        _kunde [0] = new Kunde("Heinz", "Erhardt");
        _kunde [1] = new Kunde("Rosa", "Parks");

        _verkaeufer[0] = new Verkaeufer("Emil", "Ziegelmeier", 2422);

        Menu menu = new Menu();
        menu.startMenu();        
    }

    // Zusammenfassung der spezifischen Methoden. Datentyp durch übergeordnetes Objekt ersetzt
    public static void addObject(Object ele, Object[] array){
        int i = 0;
        for (Object a : array) {
            if(a == null){
                array[i]= ele;
                break;
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

    public static void addVerkauf(Verkauf verkauf){
        addObject(verkauf, getALLVerkauf());
    }


    public static Verkauf[] getALLVerkauf(){
        return _verkauf;
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