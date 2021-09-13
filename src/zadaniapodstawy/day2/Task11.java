package zadaniapodstawy.day2;

public class Task11 {
//    public static void main(String[] args) {
//
//        System.out.println(ifPalindrome("kajak"));
//        System.out.println(ifPalindrome("sda"));
//    }
//
//    private static boolean ifPalindrome(String input) {
//        StringBuilder afterReverse = new StringBuilder(input).reverse();
//        String stringAfterReverse = afterReverse.toString();
//        return stringAfterReverse.equals(input);
//   }

    public static void main(String[] args) {
        String input = "kayak";
        String result = new StringBuilder(input).reverse().toString();
        System.out.println(input.equals(result));
    }
}
