package zadaniapodstawy.day2;

import java.util.Arrays;
import java.util.Scanner;

public class Task17 {
    public static void main(String[] args) {
      //2  int[] array = { 2, 4, 6, 0, -5, -7, 3, 9, -4, -5 };
        int[] inputs = getAndCreateArray();
        Arrays.stream(sortArray(inputs)).forEach(System.out::println);

    }

    private static int[] sortArray(int[] inputs) {
        for(int i =0; i < inputs.length -1; i++) {
            for(int j=0; j <inputs.length -1; j++) {
                if(inputs[j] > inputs[j+1]) {
                    int tmp = inputs[j];
                    inputs[j] = inputs[j+1];
                    inputs[j+1] = tmp;
                }
            }
        }
        return  new int[0];
    }

    private static int[] getAndCreateArray() {
        Scanner scanner = new Scanner(System.in);
        int[] inputs = new int[10];
        int counter = 0;
        while(counter < 10 ) {
            System.out.print("Podaj liczbę");
            inputs[counter] = scanner.nextInt();
            counter++;
        }
        return inputs;
    }
}
