import java.util.*;

// Przykład listy, zbioru i mapy
public class Kontenery {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();
        lista.add("Ala");
        lista.add("Ola");

        Set<String> zbior = new HashSet<>();
        zbior.add("A"); zbior.add("B");

        Map<String, Integer> mapa = new HashMap<>();
        mapa.put("Jan", 30);
        mapa.put("Ola", 25);

        System.out.println(lista); // wypisz listę
        System.out.println(zbior); // wypisz zbiór
        System.out.println(mapa);  // wypisz mapę
    }
}// Co warto znać:
// - `ArrayList` – indeksowana lista
// - `HashSet` – zbiór unikalnych elementów
// - `HashMap` – para klucz → wartość
// - metody: add(), get(), remove(), contains(), put()