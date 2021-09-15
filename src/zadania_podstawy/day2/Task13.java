package zadania_podstawy.day2;

public class Task13 {

    public static void main(String[] args) {
        int[] inputs = {12, 7, 19};
        System.out.println(getMinValue(inputs));
        System.out.println(getMaxValue(inputs));
        System.out.println(sum(inputs));
    }

    private static int getMinValue(int[] inputs) {
        int minValue = inputs[0];
        //int minValue = Integer.MAX_VALUE;
        for (int i : inputs) {
            if (i < minValue) {
                minValue = i;
            }
        }
        return minValue;
    }

    private static int getMaxValue(int[] inputs) {
        //return Arrays.stream(inputs).max().getAsInt();
        int maxValue = inputs[0];
        for (int i : inputs) {
            if (i > maxValue) {
                maxValue = i;
            }
        }
        return maxValue;
    }

    private static int sum(int[] inputs) {
        //return Arrays.stream(inputs).sum();
        int sum = 0;
        for (int i : inputs) {
            sum += i;
        }
        return sum;
    }
}
