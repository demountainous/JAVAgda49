package zadaniapodstawy.day1;

public class Task6 {

    public static void main(String[] args) {
        printMultiplicationTable(6, 2, 5);
    }

    private static void printMultiplicationTable(int multiplier,int minMultiplicand, int maxMultiplicand) {
        while(minMultiplicand <= maxMultiplicand) {
            int result = multiplier * minMultiplicand;
            System.out.println(multiplier + " * " + minMultiplicand + " = " + result);
            minMultiplicand++;
        }
    }
}
