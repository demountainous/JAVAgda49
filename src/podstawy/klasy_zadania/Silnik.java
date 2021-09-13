package podstawy.klasy_zadania;

public class Silnik {
    private int moc;
    private String pojemnosc;

    private Silnik() {

    }

    @Override
    public String toString() {
        return "Silnik{" +
                "moc=" + moc +
                ", pojemnosc='" + pojemnosc + '\'' +
                '}';
    }

    public static SilnikBuilder builder() {
        return new SilnikBuilder();
    }

    public static final class SilnikBuilder {
        private int moc;
        private String pojemnosc;

        public SilnikBuilder withMoc(int moc) {
            this.moc = moc;
            return this;
        }

        public SilnikBuilder withPojemnosc(String pojemnosc) {
            this.pojemnosc = pojemnosc;
            return this;
        }

        public Silnik build() {
            Silnik silnik = new Silnik();
            silnik.moc = this.moc;
            silnik.pojemnosc = this.pojemnosc;
            return silnik;
        }
    }
}
