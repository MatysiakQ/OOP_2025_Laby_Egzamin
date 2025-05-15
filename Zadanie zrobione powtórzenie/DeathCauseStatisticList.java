import java.io.*;
import java.util.*;

// Klasa przechowująca listę wszystkich statystyk zgonów
public class DeathCauseStatisticList {
    private List<DeathCauseStatistic> statistics = new ArrayList<>();

    // Wczytuje dane z pliku CSV
    public void repopulate(String filePath) throws IOException {
        statistics.clear();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            reader.readLine(); // Pomijamy nagłówek
            while ((line = reader.readLine()) != null) {
                try {
                    statistics.add(DeathCauseStatistic.fromCsvLine(line));
                } catch (Exception e) {
                    // Pomijamy błędne linie
                }
            }
        }
    }

    // Zwraca n chorób powodujących najwięcej zgonów w grupie wiekowej pasującej do danego wieku
    public List<DeathCauseStatistic> mostDeadlyDiseases(int age, int n) {
        return statistics.stream()
                .sorted((a, b) -> Integer.compare(
                    b.getDeathsForAge(age).deathCount,
                    a.getDeathsForAge(age).deathCount))
                .limit(n)
                .toList();
    }
}