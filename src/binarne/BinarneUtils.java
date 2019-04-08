package binarne;

import java.util.List;

public class BinarneUtils {

    public static int wyszukaj (List<Integer> lista, int szukane, int from, int till) throws BrakObiektu{

        int wynik=-1;
        int middle = (till-1+from)/2;
        int liczba = lista.get(middle);

        if(szukane<lista.get(from)|| szukane>lista.get(till-1)){
            throw new BrakObiektu("Nie ma szukanej liczby: "+szukane);
        }

        if(liczba==szukane){
            wynik = middle;
        }else if (liczba<szukane){
            wynik = wyszukaj(lista,szukane,middle+1,till);
        }else if (liczba>szukane) {
            wynik = wyszukaj(lista, szukane, from, middle - 1);
        }

        return wynik;
    }

    public static int wyszukajOsobe(List<Osoba> lista, Osoba szukana, int from, int till) throws BrakObiektu{

        int wynik=-1;
        int middle = (till-1+from)/2;
        Osoba osoba = lista.get(middle);

        if(szukana.compareTo(lista.get(from))<0
                || szukana.compareTo(lista.get(till-1))>0){
            throw new BrakObiektu("Nie ma szukanej osoby: "+szukana.toString());
        }

        if(szukana.compareTo(osoba)==0){
            wynik = middle;
        }else if (szukana.compareTo(osoba)>0){
            wynik = wyszukajOsobe(lista,szukana,middle+1,till);
        }else if (szukana.compareTo(osoba)<0) {
            wynik = wyszukajOsobe(lista, szukana, from, middle - 1);
        }

        return wynik;
    }


}
