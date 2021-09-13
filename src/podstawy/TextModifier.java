package podstawy;

public class TextModifier {
    private static String text = "Klaudia ma dom z pięknym ogrodem.";

    public static void processText() {
        System.out.println("Text składa się z " + text.length() +" liter");
        System.out.println("Pierwszy znak to " + text.charAt(0));
        System.out.println("Czwarty znak to " + text.charAt(3));
        int indexOstatniegoZnaku = text.length() - 1;
        System.out.println("Index ostatniego znak to " + indexOstatniegoZnaku);
        System.out.println("Ostatni znak to " + text.charAt(indexOstatniegoZnaku));
        String szukanaFraza = "dom";
        boolean wynikSzukaniaFrazy = czyTekstZawieraDanaFraze(szukanaFraza);
        System.out.println("Czy tekst zawiera fraze " + szukanaFraza + " :" + wynikSzukaniaFrazy);
    }

    public static void main(String[] args) {
        processText();
    }

    private static boolean czyTekstZawieraDanaFraze(String fraza){
        return text.contains(fraza);
    }
}
