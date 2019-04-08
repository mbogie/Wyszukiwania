package binarne;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Main {

    public static void main(String[] args) {

        List<Integer> lista = new ArrayList();
        lista.add(5);
        lista.add(6);
        lista.add(1);
        lista.add(4);
        lista.add(10);
        lista.add(3);
        lista.add(7);
        lista.add(11);
        lista.add(0);

        Collections.sort(lista);

        for (int i = 0;i<lista.size();i++){
            System.out.println(lista.get(i));
        }
        int szukane = 3;

        try{
            int wynik = BinarneUtils.wyszukaj(lista,szukane,0, lista.size());
            System.out.println("szukana liczba: "+szukane+" jest na pozycji "+wynik);

        }catch (BrakObiektu ex){
            System.out.println(ex.getMessage());
        }

        System.out.println("------------------------------------");

        List<Osoba> listaOsob = new ArrayList<>();

        listaOsob.add(new Osoba("Małysz", "Adam", 24));
        listaOsob.add(new Osoba("Smutek", "Damian", 20));
        listaOsob.add(new Osoba("Smutek", "Tomasz", 32));
        listaOsob.add(new Osoba("Smutek", "Tomek", 29));


        Osoba szukana = new Osoba("bogusz", "michał", 32);

        try{
            int wynik = BinarneUtils.wyszukajOsobe(listaOsob,szukana,0, listaOsob.size());
            System.out.println("szukana Osoba: "+szukana.toString()+" \njest na pozycji "+wynik);

        }catch (BrakObiektu ex){
            System.out.println(ex.getMessage());
        }

    }
}
