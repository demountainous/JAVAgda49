package zadania_podstawy.day2;

import java.util.Arrays;

public class Task16 {
    public static void main(String[] args) {
        //int[] nazwa = new int[rozmiar];
        int[] inputs = {12, 7, 19};
        // szybki sposób na wyświetlenia zawartości tablicy, natomiast stream poznacie na bloku java zaawansowana
        Arrays.stream(reverseArray(inputs)).forEach(System.out::println);
    }

    private static int[] reverseArray(int[] inputs) {
//        int tmp = inputs[0];
//        inputs[0] = inputs[2];
//        inputs[2] = tmp;
//        return inputs;
        for (int i = 0; i < inputs.length / 2; i++) {
            int temp = inputs[i];
            int nextPosition = (inputs.length - 1) - i;
            inputs[i] = inputs[nextPosition];
            inputs[nextPosition] = temp;
        }
        return inputs;
    }
}
