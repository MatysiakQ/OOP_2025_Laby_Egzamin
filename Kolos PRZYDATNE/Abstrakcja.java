// Klasa abstrakcyjna i dziedziczenie
abstract class Ksztalt {
    abstract void rysuj(); // metoda abstrakcyjna
}

class Kolo extends Ksztalt {
    void rysuj() {
        System.out.println("Rysuję koło"); // implementacja
    }
}// Co warto znać:
// - `abstract class` – nie można stworzyć obiektu
// - `abstract method` – musi być zaimplementowana w klasie potomnej
// - polimorfizm z klasami abstrakcyjnymi