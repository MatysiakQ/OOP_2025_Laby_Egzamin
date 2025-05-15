// Klasa reprezentująca statystyki zgonów dla jednej przyczyny
public class DeathCauseStatistic {
    // Kod choroby wg ICD-10
    private String icdCode;
    // Liczba zgonów w przedziałach wiekowych (np. 0-4, 5-9 itd.)
    private int[] deathsPerAgeGroup;

    // Konstruktor prywatny – używamy metody fromCsvLine do tworzenia obiektów
    private DeathCauseStatistic(String icdCode, int[] deathsPerAgeGroup) {
        this.icdCode = icdCode;
        this.deathsPerAgeGroup = deathsPerAgeGroup;
    }

    // Statyczna metoda tworząca obiekt z linii CSV
    public static DeathCauseStatistic fromCsvLine(String line) {
        String[] parts = line.split("\t"); // Rozdzielenie po tabulatorze
        String code = parts[0].trim();
        String[] values = parts[1].split(",");
        int[] deaths = new int[values.length - 1]; // Pomijamy sumę ogólną
        for (int i = 1; i < values.length; i++) {
            deaths[i - 1] = Integer.parseInt(values[i].trim());
        }
        return new DeathCauseStatistic(code, deaths);
    }

    // Getter do kodu ICD-10
    public String getIcdCode() {
        return icdCode;
    }

    // Zwraca dane o liczbie zgonów dla grupy wiekowej pasującej do podanego wieku
    public AgeBracketDeaths getDeathsForAge(int age) {
        int bracketSize = 5; // Zakładamy przedziały co 5 lat
        int index = Math.min(deathsPerAgeGroup.length - 1, age / bracketSize);
        int young = index * bracketSize;
        int old = young + bracketSize - 1;
        return new AgeBracketDeaths(young, old, deathsPerAgeGroup[index]);
    }

    // Wewnętrzna klasa opisująca dane dla grupy wiekowej
    public static class AgeBracketDeaths {
        public final int young; // Dolna granica wieku
        public final int old;   // Górna granica wieku
        public final int deathCount; // Liczba zgonów w tej grupie

        public AgeBracketDeaths(int young, int old, int deathCount) {
            this.young = young;
            this.old = old;
            this.deathCount = deathCount;
        }
    }
}