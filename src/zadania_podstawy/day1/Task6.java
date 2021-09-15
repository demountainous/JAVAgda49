package zadania_podstawy.day1;

public class Task6 {

    public static void main(String[] args) {
        printMultiplicationTableBasic();
        System.out.println();
        printMultiplicationTableWhileLoop(6, 2, 5);
        System.out.println();
        printMultiplicationTableForLoop(6, 2, 5);
        System.out.println();
        printMultiplicationTableForLoop2(6, 2, 5);
        System.out.println();
        printMultiplicationTableDoWhileLoop(6, 2, 5);
    }

    private static void printMultiplicationTableBasic() {
        for (int i = 1; i <= 4; i++) {
            System.out.println("5 x " + i + " = " + (5 * i));
        }
    }

    private static void printMultiplicationTableWhileLoop(int multiplier, int minMultiplicand, int maxMultiplicand) {
        while (minMultiplicand <= maxMultiplicand) {
            int result = multiplier * minMultiplicand;
            System.out.println(multiplier + " * " + minMultiplicand + " = " + result);
            minMultiplicand++;
        }
    }

    private static void printMultiplicationTableForLoop(int multiplier, int minMultiplicand, int maxMultiplicand) {
        for (int i = minMultiplicand; i <= maxMultiplicand; i++) {
            int result = multiplier * i;
            System.out.println(multiplier + " x " + i + " = " + result);
        }
    }

    private static void printMultiplicationTableForLoop2(int multiplier, int minMultiplicand, int maxMultiplicand) {
        // for(;;) -> correct structure
        for (; minMultiplicand <= maxMultiplicand; minMultiplicand++) {
            int result = multiplier * minMultiplicand;
            System.out.println(multiplier + " x " + minMultiplicand + " = " + result);
        }
    }

    private static void printMultiplicationTableDoWhileLoop(int multiplier, int minMultiplicand, int maxMultiplicand) {
        do {
            int result = multiplier * minMultiplicand;
            System.out.println(multiplier + " x " + minMultiplicand + " = " + result);
            minMultiplicand++;
        } while (minMultiplicand <= maxMultiplicand);
    }
}
