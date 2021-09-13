package zadaniapodstawy.day2;

public class Task5 {
    public static void main(String[] args) {
        System.out.println(countCharInString("ala ma kota", 'a'));
    }

    private static int countCharInString(String input, char sign) {

        if(input != null && !input.isBlank()) {
            int counter = 0;
            for (int i = 0; i < input.length(); i++) {
                if (input.charAt(i) == sign) {
                    counter++;
                }
            }
            return counter;
        }
        return 0;
    }
    private static int countCharInStringV2(String input, char sign) {
        int counter = 0;
        char[] letters = input.toCharArray();
        for(char c :letters) {
            if(c == sign) {
                counter++;
            }
        }
        return counter;
    }
}
