package zadaniapodstawy.day2;

public class Task2 {

    public static void main(String[] args) {
        String input = "programowanie";
        String prefix = "pro";
        String suffix = "nie";
        System.out.println("Prefix:");
        System.out.println(ifWordContainsPrefix(input, "pro"));


        if(input == null || input.isBlank()) {
            System.exit(-1);
        }
        input.startsWith(prefix);
        input.endsWith(suffix);

    }
    private static boolean ifWordContainsPrefix(String input, String prefix) {
        return input.startsWith(prefix);
    }

}
