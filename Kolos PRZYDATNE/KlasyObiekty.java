// Klasa z polami i metodą
public class KlasyObiekty {
    String marka; // marka auta
    int rok;      // rok produkcji

    // metoda wypisująca info
    void jedz() {
        System.out.println("Jadę " + marka + " z roku " + rok);
    }

    public static void main(String[] args) {
        KlasyObiekty auto = new KlasyObiekty(); // tworzymy obiekt
        auto.marka = "BMW";                     // ustawiamy markę
        auto.rok = 2020;                        // ustawiamy rok
        auto.jedz();                            // wywołujemy metodę
    }
}// Co warto znać:
// - pola (zmienne instancyjne)
// - metody
// - tworzenie obiektów przez `new`
// - słowo kluczowe `this`