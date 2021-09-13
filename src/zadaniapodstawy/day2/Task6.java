package zadaniapodstawy.day2;

public class Task6 {

    public static void main(String[] args) {
        System.out.println(getIndex("Ala ma kota", 'a'));
        System.out.println(getIndex("Ala ma kota", 'z'));
        System.out.println(getIndex("", 'a'));
        System.out.println(getIndex(" ", 'a'));
        //System.out.println(countCharInStringV2(null, 'a'));
    }

    private static int getIndex(String input, char sign) {
        if(input != null && !input.isBlank()) {
            for (int i = 0; i < input.length(); i++) {
                if (input.charAt(i) == sign) {
                    return i;
                }
            }
        }
        return -1;
    }
}
