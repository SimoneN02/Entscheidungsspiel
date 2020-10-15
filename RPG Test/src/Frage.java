public class Frage {

    public int Reihenfolge;
    public String Frage;
    public String EntscheidungA;
    public String EntscheidungB;
    public int WegA;
    public int WegB;


    public Frage(int Reihenfolge, String Frage, String EntscheidungA, String EntscheidungB, int WegA, int WegB) {
        this.Reihenfolge = Reihenfolge;
        this.Frage = Frage;
        this.EntscheidungA = EntscheidungA;
        this.EntscheidungB = EntscheidungB;
        this.WegA = WegA;
        this.WegB = WegB;

    }

    public int getReihenfolge() {
        return Reihenfolge;
    }

    public void setReihenfolge(int Reihenfolge){ this.Reihenfolge = Reihenfolge; }

    public String getFrage(){
        return Frage;
    }

    public void setFrage(String Fragen) {
        this.Frage = Fragen;
    }

    public String getEntscheidungA(){
        return EntscheidungA;
    }

    public void setEntscheidungA(String EntscheidungA) {
        this.EntscheidungA = EntscheidungA;
    }

    public String getEntscheidungB() { return EntscheidungB; }

    public void setEntscheidungB(String EntscheidungB) { this.EntscheidungB = EntscheidungB; }

    public int getWegA() { return WegA; }

    public void setWegA(int WegA) { this.WegA = WegA; }

    public int getWegB() { return WegB; }

    public void setWegB(int WegB) { this.WegB = WegB; }


    @Override
    public String toString() {
        return "RPG [Reihenfolge=" + Reihenfolge + ", Fragen=" + Frage + ", EntscheidungA=" + EntscheidungA + ", EntscheidungB=" + EntscheidungB + ", WegA=" + WegA + ", WegB=" + WegB + "]";
    }

}
