import java.io.*;
import java.util.*;

// Szybka wersja – wszystkie dane wczytane do pamięci
public class ICDCodeTabularOptimizedForTime implements ICDCodeTabular {
    private Map<String, String> codeMap = new HashMap<>();

    public ICDCodeTabularOptimizedForTime(String filePath) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            for (int i = 0; i < 87; i++) reader.readLine(); // Pomijamy linie przed 88
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.matches("^[A-Z]\d{2}.*")) {
                    String[] parts = line.split(" ", 2);
                    if (parts.length == 2) {
                        codeMap.put(parts[0].trim(), parts[1].trim());
                    }
                }
            }
        }
    }

    public String getDescription(String code) {
        if (!codeMap.containsKey(code)) throw new IndexOutOfBoundsException("Nie znaleziono kodu: " + code);
        return codeMap.get(code);
    }
}