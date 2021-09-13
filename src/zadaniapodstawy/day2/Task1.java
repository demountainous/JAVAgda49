package zadaniapodstawy.day2;

public class Task1 {

    public static void main(String[] args) {
//        String input = "ala";
        System.out.println(lastSignV1( "Tomek"));
//        System.out.println("Orginal word " + input);
//        System.out.println("Last char " + lastSignV1(input));

    }

    private static char lastSignV1(String input) {
        if(input == null || input.isBlank()) {
            System.exit(-1);
        }
        input =input.trim();
        int lastPosition = input.length() - 1;
        return input.charAt(lastPosition);

    }

    private static String lastSignV2(String input) {
        if(input == null || input.isBlank()) {
            System.exit(-1);
        }
        input =input.trim();
        int lastPosition = input.length() - 1;
        return input.substring(lastPosition);
    }
}