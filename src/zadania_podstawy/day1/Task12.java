package zadania_podstawy.day1;

public class Task12 {

    public static void main(String[] args) {
        System.out.println("Result of 2%4 = " + ownModuloImplementation(2, 4));
        System.out.println("Result of 4%2 = " + ownModuloImplementation(4, 2));
        System.out.println("Result of 3%4 = " + ownModuloImplementation(3, 4));

        System.out.println(ifOwnModuloImplementationIsCorrect(2, 4));
        System.out.println(ifOwnModuloImplementationIsCorrect(4, 2));
        System.out.println(ifOwnModuloImplementationIsCorrect(3, 4));
        System.out.println(ifOwnModuloImplementationIsCorrect(9, 3));
    }

    private static int ownModuloImplementation(int a, int b) {
        return ((a < b) ? a : 0);
    }

    private static boolean ifOwnModuloImplementationIsCorrect(int a, int b) {
        return ownModuloImplementation(a, b) == (a % b);
    }
}