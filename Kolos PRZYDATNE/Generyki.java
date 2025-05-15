// Klasa generyczna
public class Generyki<T> {
    private T wartosc; // zmienna generyczna

    public Generyki(T wartosc) {
        this.wartosc = wartosc;
    }

    public T getWartosc() {
        return wartosc; // zwraca wartość
    }

    public static void main(String[] args) {
        Generyki<String> tekst = new Generyki<>("Hello");
        Generyki<Integer> liczba = new Generyki<>(123);

        System.out.println(tekst.getWartosc()); // wypisuje "Hello"
        System.out.println(liczba.getWartosc()); // wypisuje 123
    }
}// Co warto znać:
// - `T`, `E`, `K`, `V` – typy generyczne
// - klasy, metody i interfejsy generyczne
// - ograniczenia typów: `<T extends Number>`