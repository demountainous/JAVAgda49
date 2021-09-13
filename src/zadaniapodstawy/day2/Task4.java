package zadaniapodstawy.day2;

public class Task4 {
    public static void main(String[] args) {
        replaceAndDisplayString("Ala,ma.kota i psa");
    }

    private static void replaceAndDisplayString(String input) {
        String result = input
                .replace(",", "-STOP-")
                .replace(".", "-STOP-")
                .replace(" ", "-STOP-");
        System.out.println(result);
    }
}


//    public static void main(String[] args) {replaceString("Ala ma,kota. a kot, ma Ale");
//}
//    private static void replaceString(String input) {
//        String result = input.replace(",", "-STOP-").replace(".", "-STOP-");
//        System.out.println("Nowy wynik: " + result);
//    }
//}
