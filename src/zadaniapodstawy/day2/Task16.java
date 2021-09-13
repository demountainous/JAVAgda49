package zadaniapodstawy.day2;

import java.util.Arrays;

public class Task16 {
    public static void main(String[] args) {
        int[] inputs = {12, 7, 19, 5};
//        reverseArray(inputs);
        Arrays.stream(reverseArray(inputs)).forEach(System.out::println);
    }

    private static int[] reverseArray(int[] inputs) {
//        int tmp = inputs[0];
//        inputs[0] = inputs[2];
//        inputs[2] = tmp;
//        return inputs;
        for(int i =0; i < inputs.length/2; i++) {
            int tmp = inputs[i];
            int nextPosition = (inputs.length - i) -1;
            inputs[nextPosition] = tmp;
        }
        return inputs;
    }
}
