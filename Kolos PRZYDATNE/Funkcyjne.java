import java.util.Arrays;

// Programowanie funkcyjne z lambdami
public class Funkcyjne {
    public static void main(String[] args) {
        Arrays.asList(1, 2, 3).forEach(x -> System.out.println(x * 2)); // lambda mnoży każdy element przez 2
    }
}// Co warto znać:
// - lambdy: `(x) -> wyrażenie`
// - interfejsy funkcyjne: `Consumer`, `Predicate`, `Function`
// - `Stream` API do przetwarzania danych