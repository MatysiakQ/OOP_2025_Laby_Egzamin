import java.io.*;

// Odczyt pliku i obsługa błędów
public class PlikiWyjatki {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("plik.txt"));
            String linia;
            while ((linia = br.readLine()) != null) {
                System.out.println(linia); // wypisz linie z pliku
            }
            br.close();
        } catch (IOException e) {
            System.out.println("Błąd: " + e.getMessage()); // obsługa błędu
        }
    }
}// Co warto znać:
// - `try/catch/finally` – obsługa wyjątków
// - `IOException`, `FileNotFoundException` – typowe wyjątki plikowe
// - `throw` – ręczne rzucenie wyjątku
// - `throws` – deklaracja w nagłówku metody