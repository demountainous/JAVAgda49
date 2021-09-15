package zadania_podstawy.day2;

public class Task4 {

    public static void main(String[] args) {
        System.out.println(replaceString("Ala,ma.kota i psa"));
    }

    private static String replaceString(String input) {
        return input
                .replace(",", "-STOP-")
                .replace(".", "-STOP-")
                .replace(" ", "-STOP-");
    }
}
