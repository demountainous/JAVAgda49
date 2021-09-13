package podstawy.klasy_zadania;

public class Exercise5 {
    private int a;
    private int b;
    private int sum;

    public Exercise5(int a, int b) {
        this.a = a;
        this.b = b;
        sum = a + b;
    }

    public void wyswietlWynik() {
        System.out.println("Wynik dodania " + a + " oraz " + b + " wynosi " + sum);
    }
}
