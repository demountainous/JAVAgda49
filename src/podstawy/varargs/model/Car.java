package podstawy.varargs.model;

import podstawy.klasy_zadania.Silnik;

public class Car {
    private String model;
    private String marka;
    private Silnik silnik;
    private TypSilnika typSilnika;
    private Kolor kolor;

    public static CarBuilder builder(){
        return new CarBuilder();
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", marka='" + marka + '\'' +
                ", silnik=" + silnik +
                ", typSilnika=" + typSilnika +
                ", kolor=" + kolor +
                '}';
    }

    public String getModel() {
        return model;
    }

    public String getMarka() {
        return marka;
    }

    public Silnik getSilnik() {
        return silnik;
    }

    public TypSilnika getTypSilnika() {
        return typSilnika;
    }

    public Kolor getKolor() {
        return kolor;
    }

    public static final class CarBuilder{
        private String model;
        private String marka;
        private Silnik silnik;
        private TypSilnika typSilnika;
        private Kolor kolor;

        public CarBuilder withModel(String model){
            this.model = model;
            return this;
        }

        public CarBuilder withMarka(String marka){
            this.marka = marka;
            return this;
        }

        public CarBuilder withSilnik(Silnik silnik){
            this.silnik = silnik;
            return this;
        }

        public CarBuilder withTypSilnika(TypSilnika typSilnika){
            this.typSilnika = typSilnika;
            return this;
        }

        public CarBuilder withKolor(Kolor kolor){
            this.kolor = kolor;
            return this;
        }

        public Car build(){
            Car car = new Car();
            car.model = this.model;
            car.marka = this.marka;
            car.silnik = this.silnik;
            car.typSilnika = this.typSilnika;
            car.kolor = this.kolor;
            return car;
        }
    }
}
