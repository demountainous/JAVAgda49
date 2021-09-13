package podstawy;

import java.util.Arrays;

public class StringExample2 {
    public static void main(String[] args) {
        String text1 = "koń";
        String text2 = "ok";
        System.out.println(test(text1, text2));
//        String text3 = new String("Ala");
//
////        System.out.println(text.equals(text2));
////        System.out.println(text.equals(text3));
//        System.out.println(text == text2);
//        System.out.println(text == text3);
//        wyswietlText("Jakies zdanie .");
//        ArgumentAggregatorDto result = process(2, 5);
//        System.out.println("Wynik sumy " + result.getI() + " i " + result.getB() + " równa się " + result.getC());
    }

    private void wyswietl(ArgumentAggregatorDto dto) {

    }

    private static ArgumentAggregatorDto process(int i, int b) {
        ArgumentAggregatorDto dto = new ArgumentAggregatorDto();
        dto.setI(i);
        dto.setB(b);
        dto.setC(i + b);
        return dto;
    }

    private static void wyswietlText(String text) {
        System.out.println(text.replaceAll(" ", ""));
    }

    private static int iloscPowtórzeńZnaku(String text, char szukanyZnak) {
        int counter = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == szukanyZnak) {
                counter++;
            }
        }
        return counter;
    }

    private static boolean test(String text1, String text2) {
        char[] arrayChars = text2.toCharArray();
        for (char znak : arrayChars) {
            int counter1 = iloscPowtórzeńZnaku(text1, znak);
            int counter2 = iloscPowtórzeńZnaku(text2, znak);
            if (counter1 != counter2) {
                return false;
            }
        }
        return true;

    }

    private long iloscPowtorzenZnakuStream(String text, char szukanyZnak) {
        return text.chars()
                .filter(znak -> znak == szukanyZnak)
                .count();
    }
}
