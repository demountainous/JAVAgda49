package zadania_podstawy.day2;

public class Task3 {

    public static void main(String[] args) {
        String input = "ala ma kota";
        String word = "ma";
        int pos = getIndex(input, word);
        System.out.println(getIndex(input, word));
    }

    private static int getIndex(String input, String word) {
        //return (input != null && !input.isBlank() && input.contains(word)) ? input.indexOf(word) : -1;
        //return input.contains(word) ? input.indexOf(word) : -1;
        if (word != null && !word.isBlank()) {
            return input.contains(word) ? input.indexOf(word) : -1;
        }
        return -1;
    }
}
