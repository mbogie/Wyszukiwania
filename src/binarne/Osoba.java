package binarne;

public class Osoba implements Comparable<Osoba>{

    private String imie;
    private String nazwisko;
    private int wiek;

    public Osoba(String imie, String nazwisko, int wiek) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public int getWiek() {
        return wiek;
    }

    @Override
    public String toString() {
        return "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Osoba osoba = (Osoba) o;

        if (!imie.equals(osoba.getImie())) return false;
        if (!nazwisko.equals(osoba.getNazwisko())) return false;
        if (!(wiek==(osoba.getWiek()))) return false;

        return true;
    }


    @Override
    public int compareTo(Osoba o) {
        String nazwa1 = imie+" "+nazwisko;
        String nazwa2 = o.getImie()+" "+o.getNazwisko();
        return nazwa1.compareTo(nazwa2);
    }
}
