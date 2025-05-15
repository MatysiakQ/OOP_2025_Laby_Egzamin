import java.io.*;

// Oszczędna wersja – za każdym razem otwiera plik i szuka kodu
public class ICDCodeTabularOptimizedForMemory implements ICDCodeTabular {
    private String filePath;

    public ICDCodeTabularOptimizedForMemory(String filePath) {
        this.filePath = filePath;
    }

    public String getDescription(String code) throws IndexOutOfBoundsException {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            for (int i = 0; i < 87; i++) reader.readLine(); // Pomijamy linie
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.startsWith(code + " ")) {
                    return line.substring(code.length()).trim();
                }
            }
        } catch (IOException e) {
            throw new RuntimeException("Błąd pliku: " + e.getMessage());
        }
        throw new IndexOutOfBoundsException("Nie znaleziono kodu: " + code);
    }
}