// Przykład dziedziczenia
class Zwierze {
    void dajGlos() {
        System.out.println("Dźwięk zwierzęcia");
    }
}

class Pies extends Zwierze {
    @Override
    void dajGlos() {
        System.out.println("Hau hau"); // nadpisana metoda
    }
}// Co warto znać:
// - `extends` – dziedziczenie
// - `super()` – odwołanie do klasy nadrzędnej
// - `@Override` – nadpisanie metody
// - polimorfizm: `Zwierze z = new Pies();`