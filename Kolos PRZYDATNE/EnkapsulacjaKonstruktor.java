// Przykład enkapsulacji i konstruktora
public class EnkapsulacjaKonstruktor {
    private String imie; // prywatne pole
    private int wiek;    // prywatne pole

    // Konstruktor
    public EnkapsulacjaKonstruktor(String imie, int wiek) {
        this.imie = imie; // przypisujemy wartości
        this.wiek = wiek;
    }

    // Getter
    public String getImie() {
        return imie; // zwracamy imię
    }

    // Setter
    public void setWiek(int wiek) {
        this.wiek = wiek; // ustawiamy wiek
    }
}// Co warto znać:
// - `private` – ukrywa dane
// - `getter/setter` – kontrolowany dostęp
// - `this` – odwołanie do aktualnego obiektu
// - konstruktor może być przeciążany