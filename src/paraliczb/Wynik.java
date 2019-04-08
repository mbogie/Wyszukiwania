package paraliczb;

public class Wynik {

    private int licznik = 0;
    private boolean czyZnalazlo = false;

    public int getLicznik() {
        return licznik;
    }

    public boolean isCzyZnalazlo() {
        return czyZnalazlo;
    }

    public void setLicznik(int licznik) {
        this.licznik = licznik;
    }

    public void setCzyZnalazlo(boolean czyZnalazlo) {
        this.czyZnalazlo = czyZnalazlo;
    }

}
