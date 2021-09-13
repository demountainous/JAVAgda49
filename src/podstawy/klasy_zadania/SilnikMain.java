package podstawy.klasy_zadania;

public class SilnikMain {

    public static void main(String[] args) {
        Silnik silnik = Silnik.builder()
                .withMoc(10)
                .withPojemnosc("2.0")
                .build();
    }
}
