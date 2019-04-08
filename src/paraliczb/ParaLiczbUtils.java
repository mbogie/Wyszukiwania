package paraliczb;

public class ParaLiczbUtils {


    public static Wynik wyszukiwanie(int[] tab, int szukana, Wynik wynik){

        int left = 0;
        int right = tab.length-1;
        int licznik=0;

        while(!(left==right)){
            licznik++;
            if(tab[left]+tab[right]==szukana){
                wynik.setCzyZnalazlo(true);
                wynik.setLicznik(licznik);
                return wynik;
            } else if(tab[left]+tab[right]<szukana){
                //licznik++;
                left++;
            }
             else {
                right--;
                //licznik++;
            }
        }
        wynik.setLicznik(licznik);
        return wynik;
    }

    public static void wyswietlanie(Wynik wynik){
        if(wynik.isCzyZnalazlo()){
            System.out.println(wynik.getLicznik());
        } else System.out.println("brak pary "+ wynik.getLicznik());
    }
}
