import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Spiel {

    private List<Frage> Fragen = new ArrayList<Frage>();
    public void Start() {
       readFrageFromCSV("RPG.csv");
       // Ausgeben Frage
        printFrage(0);
       // Antwort Abfragen
       // Neue Frage aufrufen

       // let's print all the person read from CSV file
       /* for (Frage r : Fragen) {
            System.out.println(r); } */
    }
    private void printFrage(int pos) {
        Frage frage = Fragen.get(pos);
        System.out.println(frage.Frage);
        System.out.println("A: " + frage.EntscheidungA);
        System.out.println("B: " + frage.EntscheidungB);
        char entscheidung = getEntscheidung();
        switch (entscheidung) {
            case 'A':
                if (frage.WegA == 0)
                    return;
                else printFrage(frage.WegA -1);
                break;
            case 'B':
                if (frage.WegB == 0)
                    return;
                else printFrage(frage.WegB -1);
                break;

        }
    }
    private char getEntscheidung() {
        Scanner sc = new Scanner(System.in);
        return sc.next().charAt(0);
    }

    private void readFrageFromCSV(String fileName) {
        Path pathToFile = Paths.get(fileName);

        // create an instance of BufferedReader
        // using try with resource, Java 7 feature to close resources
        try (BufferedReader br = Files.newBufferedReader(pathToFile,
                StandardCharsets.US_ASCII)) {

            // read the first line from the text file
            String line = br.readLine();

            // loop until all lines are read
            while (line != null) {

                // use string.split to load a string array with the values from
                // each line of
                // the file, using a comma as the delimiter
                String[] attributes = line.split(";");

                Frage frage = createFrage(attributes);

                // adding book into ArrayList
                Fragen.add(frage);

                // read next line before looping
                // if end of file reached, line would be null
                line = br.readLine();
            }

        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

        return;
    }
    private Frage createFrage(String[] metadata) {
        int Reihenfolge = Integer.parseInt((metadata)[0]);
        String Fragen = metadata[1];
        String EntscheidungA = metadata[2];
        String EntscheidungB = metadata[3];
        int WegA = Integer.parseInt((metadata)[4]);
        int WegB = Integer.parseInt((metadata)[5]);


        // create and return book of this metadata
        return new Frage(Reihenfolge, Fragen , EntscheidungA, EntscheidungB, WegA, WegB);

    }
}
