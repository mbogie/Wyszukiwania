package paraliczb;

public class Main {

    public static void main(String[] args) {

        int[] tablica = {1, 2, 3, 8, 17, 19, 21, 133};

        int szukana1 = 29;
        int szukana2 = 25;
        int szukana3 = 12;

        Wynik wynik29 = new Wynik();
        Wynik wynik25 = new Wynik();
        Wynik wynik12 = new Wynik();

        ParaLiczbUtils.wyszukiwanie(tablica,szukana1,wynik29);
        ParaLiczbUtils.wyszukiwanie(tablica,szukana2,wynik25);
        ParaLiczbUtils.wyszukiwanie(tablica,szukana3,wynik12);

        ParaLiczbUtils.wyswietlanie(wynik29);
        ParaLiczbUtils.wyswietlanie(wynik25);
        ParaLiczbUtils.wyswietlanie(wynik12);


    }
}
