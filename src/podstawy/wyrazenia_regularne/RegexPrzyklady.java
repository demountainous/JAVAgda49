package podstawy.wyrazenia_regularne;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexPrzyklady {

    public static void main(String[] args) {
        String regex="[0-9]{4}[-]\\d{2}[-]\\d{2}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher("2021-20-12");
        System.out.println(matcher.matches());

        System.out.println("Czy imię Piotr123 jest poprawne? " + sprawdzCzyImieJestPoprawne("Piotr123"));
    }

    private static boolean sprawdzCzyImieJestPoprawne(String imie){
        String regexImie="[A-Za-z]{3,}";
        Pattern pattern = Pattern.compile(regexImie);
        Matcher matcher = pattern.matcher(imie);
        return matcher.matches();
    }
}
