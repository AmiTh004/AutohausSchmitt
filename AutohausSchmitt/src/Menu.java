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
        System.out.println("(6) Alle Kunden ausgeben");
        System.out.println("(7) Alle Verkäufer ausgeben");
        String choice = getScanner().nextLine();
        System.out.println("Hier geht es weiter mit"+ choice);

        // if-Abfrage
        // if(variable operator vergleichswert): TRUE?
        if(choice.equals("1")){
            createVerkaufMenu();
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

        else if(choice.equals("6")){
            showKunden();
        }

        else if(choice.equals("7")){
            showVerkaeufer();
        }

        else if(choice.equals("8")){
            showVerkauf();
        }

        else{
            System.out.println("Bitte nur 1,2,3,4,5,6,7 eingeben!!!");
        }
        
        startMenu();
    }


    
    /*public void showObject(Object[] array){
        for (Object obj : array) {
            if(obj != null)
            System.out.println(obj.getClass());  //TODO: eine Klasse Object erstellen, als Oberklasse, die die methode printObject enthält.
        
        }
    }*/

    public void showAutos(){
        //showObject(App.getALLAutos());
        for (Auto auto : App.getALLAutos()) {
            if(auto != null){
                System.out.println(auto.getMarke() +" "+ auto.getBaujahr());
            }
            
        }
    }

    public void showKunden(){
        //showObject(App.getALLKunde());
        for (Kunde kunde : App.getALLKunde()) {
            if(kunde != null){
                System.out.println(kunde.getVorname() +" "+ kunde.getNachname());
            }
            
        }
    }

    public void showVerkaeufer(){
        //showObject(App.getALLVerkaeufer());
        for (Verkaeufer verkaeufer : App.getALLVerkaeufer()) {
            if(verkaeufer!= null){
                System.out.println(verkaeufer.getVorname() +" "+ verkaeufer.getVorname());
            }
            
        }
    }

    public void showVerkauf(){
        for (Verkauf verkauf : App.getALLVerkauf()) {
            if(verkauf!= null){
                System.out.println(verkauf.getDatum());
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

        App.addKunde(new Kunde(vorname, nachname));

    }

    public void createVerkaeuferMenu(){

        System.out.println("Erstelle einen Verkäufer");
        System.out.print("Vorname:");
        String vorname = getScanner().nextLine();
        System.out.print("Nachname:");
        String nachname = getScanner().nextLine();
        System.out.print("Personalnummer:");
        String personalnummer = getScanner().nextLine();
        int persnr = Integer.valueOf(personalnummer);
        System.out.println("Vielen Dank, dein Verkäufer wird erstellt");

        App.addVerkaeufer(new Verkaeufer(vorname, nachname, persnr));
    }

    public void createVerkaufMenu(){
        System.out.println("Geben sie das Datum des Verkaufs an: ");
        String date = getScanner().nextLine();

        //Auto auswählen
        int i = 0;
        System.out.println("Bitte wählen sie ein Auto aus:");
        for (Auto auto : App.getALLAutos()) {
            if(auto != null){
                System.out.println(i + " - " + auto.getMarke() + " " + auto.getModell());
                i++;
            }
            
        }
        String car_choice = getScanner().next();
        int car_index = Integer.valueOf(car_choice);

        System.out.println(App.getALLAutos()[car_index]);

        //Kunden auswählen
        i = 0;
        System.out.println("Bitte wählen sie einen Kunden: ");
        for (Kunde kunde : App.getALLKunde()){
            if(kunde != null){
                System.out.println(i+" - "+kunde.getVorname()+" "+kunde.getNachname());
                i++;
            }
        }
        String kunde_choice = getScanner().next();
        int kunde_index = Integer.valueOf(kunde_choice);

        System.out.println(App.getALLKunde()[kunde_index]);

        //Verkäufer auswählen
        i = 0;
        System.out.println("Bitte wählen sie einen Verkäufer: ");
        for (Verkaeufer verkaeufer : App.getALLVerkaeufer()) {
            if (verkaeufer != null) {
                System.out.println(i+" - "+verkaeufer.getVorname()+" "+verkaeufer.getNachname());
                i++;
            }
        }
        String seller_choice = getScanner().next();
        int seller_index = Integer.valueOf(seller_choice);

        System.out.println(App.getALLVerkaeufer()[seller_index]); 

        // Preis
        System.out.println("Geben sie den Preis an: ");
        String preis_choice = getScanner().next();
        int preis_verkauf = Integer.valueOf(preis_choice);

        //Verkauf ausgeben und in Array hinzufügen
        System.out.println("Das ist ihr Verkauf: "+ date);
        System.out.println("Auto: "+ App.getALLAutos()[car_index].getModell()+ "\nKunde: "+App.getALLKunde()[kunde_index].getNachname()+"\nVerkäufer: "+App.getALLVerkaeufer()[seller_index].getPersonalnummer()+ "\nPreis: "+ preis_verkauf);

        App.addVerkauf(new Verkauf(App.getALLAutos()[car_index], App.getALLKunde()[kunde_index], App.getALLVerkaeufer()[seller_index],date));
    }

    public void setScanner(Scanner _scanner) {
        this._scanner = _scanner;
    }
    public Scanner getScanner() {
        return _scanner;
    }
    
}
