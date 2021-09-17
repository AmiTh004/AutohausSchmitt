import java.util.Scanner;


public class Menu {

    Scanner _scanner;
    

    public Menu(){
        setScanner(new Scanner(System.in));

    }
    
    public void startMenu(){
        System.out.println("Bitte wähle aus:");
        System.out.println("(1) Neuer Verkauf");
        System.out.println("(2) Neuer Kunde");
        System.out.println("(3) Neues Auto");
        System.out.println("(4) Neuer Verkäufer");
        System.out.println("(5) Alle Autos ausgeben");
        String choice = getScanner().nextLine();
        System.out.println("Hier geht es weiter mit"+ choice);

        // if-Abfrage
        // if(variable operator vergleichswert): TRUE?
        if(choice.equals("1")){
            System.out.println("Verkauf wurde noch nicht implementiert...");
        }

        // weitere Bedingung
        else if(choice.equals("2")){
            createKundeMenu();
        }

        else if(choice.equals("3")){
            createAutoMenu();
        }

        else if(choice.equals("4")){
            createVerkaeuferMenu();
        }

        else if(choice.equals("5")){
            showAutos();
        }

        else{
            System.out.println("Bitte nur 1,2,3,4,5 eingeben!!!");
        }
        
        startMenu();
    }

    public void showAutos(){
        for (Auto auto : App.getALLAutos()) {
            if(auto != null){
                System.out.println(auto.getMarke() +" "+ auto.getBaujahr());
            }
            
        }
    }
    // ein Auto erstellen
    public void createAutoMenu(){
        
        System.out.println("Erstelle ein Auto");
        System.out.print("Marke:");
        // einen String eingeben lassen: nextLine()
        String marke = getScanner().nextLine();
        System.out.print("Modell:");
        String modell = getScanner().nextLine();
        System.out.print("Baujahr:");
        String baujahr = getScanner().nextLine();
        System.out.println("Vielen Dank, dein Auto wird erstellt");

        // die Variablen zu einem Auto zusammensetzen, ein Objekt erzeugen dass direkt in die Array gesetzt wird
        App.addAuto(new Auto(marke, modell, baujahr));

        System.out.println(App.getALLAutos());
    }

    
    public void createKundeMenu(){

        System.out.println("Erstelle einen Kunden");
        System.out.println("Vorname:");
        String vorname = getScanner().nextLine();
        System.out.print("Nachname:");
        String nachname = getScanner().nextLine();
        
        System.out.println("Vielen Dank, dein Kunde wird erstellt");

        Kunde k = new Kunde(vorname, nachname);

        System.out.println(k.getVorname());
    }

    public void createVerkaeuferMenu(){

        System.out.println("Erstelle einen Verkäufer");
        System.out.print("Vorname:");
        String vorname = getScanner().nextLine();
        System.out.print("Nachname:");
        String nachname = getScanner().nextLine();
        System.out.print("Personalnummer:");
        String personalnummer = getScanner().nextLine();
        Integer persnr = Integer.valueOf(personalnummer);
        System.out.println("Vielen Dank, dein Verkäufer wird erstellt");

        Verkaeufer v = new Verkaeufer(vorname, nachname, persnr);
    }

    public void createVerkaufMenu(){
        // TODO: Die verschiedenen Objekte in den Verkauf implementieren

    }


    public void setScanner(Scanner _scanner) {
        this._scanner = _scanner;
    }
    public Scanner getScanner() {
        return _scanner;
    }
    
}
