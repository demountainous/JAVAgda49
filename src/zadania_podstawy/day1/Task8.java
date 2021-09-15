package zadania_podstawy.day1;

public class Task8 {

//    static int i;
//    static int j;
//    {
//        i = 0;
//        j=1;
//    }

    public static void main(String[] args) {
        int maxRange = 10;
        System.out.printf("Range from 0 to %s\n", maxRange);
        System.out.println("Prime numbers: ");
        for (int i = 0; i <= maxRange; i++) {
            if (isPrimeNumber(i)) {
                System.out.println(i);
            }
        }
    }

    private static boolean isPrimeNumber(int number) {
        if (number < 2) {
            return false;
        }
        // użycie MAth.sqrt(number) zapewnia nam bardzo dobry wynik pod względem wydajności,
        // nie robimy zbędnych wykonań pętli
        // odczuwalne przy dużej wartości maxRange np 1 000 000 000
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
