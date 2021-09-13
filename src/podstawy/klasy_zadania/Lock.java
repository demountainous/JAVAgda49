package podstawy.klasy_zadania;

public class Lock {
    private int[] kodZamka = new int[]{3, 4, 5};
    private int[] kod;

    public Lock(int[] kod) {
        if (validate(kod)) {
            this.kod = kod;
        } else {
            System.out.println("Kod zamkna powinien składać się z 3 cyfr oraz każda wartośc powinna zajdować się w przedziale 0-9.");
            throw new RuntimeException();
        }
    }

    public boolean czyZamekJestOtwarty() {
        for (int i = 0; i < kodZamka.length; i++) {
            if (kodZamka[i] != kod[i])
                return false;
        }
        return true;
    }

    public void wypiszAktualnaKombinacjeZamka() {
        System.out.print("Aktualny kod zamka wynosi ");
        for (int k : kod) {
            System.out.print(k);
        }
        System.out.println("\n");
    }

    public void wypiszKodZamka() {
        System.out.print("Kod zamka wynosi ");
        for (int k : kodZamka) {
            System.out.print(k);
        }
        System.out.println("\n");
    }

    public void przekładnia1() {
        ustawAktualnaCyfre(0);
    }

    public void przekładnia2() {
        ustawAktualnaCyfre(1);
    }

    public void przekładnia3() {
        ustawAktualnaCyfre(2);
    }

    private boolean validate(int[] kod) {
        if(kod.length != 3){
            return false;
        }
        for (int k : kod) {
            if (k < 0 || k > 9)
                return false;
        }
        return true;
    }

    private int ustawAktualnaCyfre(int index){
        int aktualnaCyfra = kod[index] + 1;
        if (aktualnaCyfra <= 9) {
            return kod[index] = aktualnaCyfra;
        } else {
            return kod[index] = 0;
        }
    }

}
