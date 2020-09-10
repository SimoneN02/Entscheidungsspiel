import java.util.Scanner; // Kann alle Objekte lesen

                        // Scanner kopiert von https://www.w3schools.com/java/java_user_input.asp

public class Main {

    public static void main(String[] args) {
        Scanner eingabewert = new Scanner(System.in); // Eingabe wert mit Scanner definiert

        System.out.println("Geben Sie bitte der Zahl Z1 einen Wert: ");  // Eingabe für eine Zahl
        int Z1 = eingabewert.nextInt(); // Z1 wird deklariert
        System.out.println("Geben Sie bitte einen Hohlmass und Längenmass ein: "); // Eingabe für Hm & Lm
        String Hohlmass = eingabewert.next(); // Hohlmass wird deklariert
        String Laengemass = eingabewert.next(); //Laengemass wird deklariert


        if (Z1 == 0) {  // Wenn Eingabe von Z1 0 ist, Ausgabe von "Falsche Zahl" da nicht möglich
            System.out.println("Falsche Zahl");
        }


        if (Hohlmass.equals("hl")) { // Ich hatte zuerst (hohlmass = "hl") aber mein Programm hatt mir empfohlen es so zu machen. Siehe Dokumentation
            String hl = Hohlmass;   // hl deklarieren
        }
        if (Hohlmass.equals("l")) {
            String l = Hohlmass;    // l deklarieren
        }
        if (Hohlmass.equals("dl")) {
            String dl = Hohlmass;   // dl deklarieren
        }
        if (Hohlmass.equals("cl")) {
            String cl = Hohlmass;   // cl deklarieren
        }
        if (Hohlmass.equals("ml")) {
            String ml = Hohlmass; // ml deklarieren
        }


        if (Laengemass.equals("km")) {
            String km = Laengemass;   // km deklarieren
        }
        if (Laengemass.equals("m")) {
            String m = Laengemass;   // m deklarieren
        }
        if (Laengemass.equals("dm")) {
            String dm = Laengemass;  // dm deklarieren
        }
        if (Laengemass.equals("cm")) {
            String cm = Laengemass;   // cm deklarieren
        }
        if (Laengemass.equals("mm")) {
            String mm = Laengemass;  // mm deklarieren
        }

        String Mass1= Z1 + Hohlmass;  // Mass1 deklarieren aus 2 Variablen
        String Mass2= Z1 + Laengemass; // Mass 2 deklarieren aus 2 Variablen


        System.out.println(Mass1);   // Output von Mass1
        System.out.println(Mass2);   // Output von Mass2

        }



    }

