package podstawy.klasy_zadania;

public class Mercedes {
    private String model;

    private Mercedes() {
    }

    public String getModel() {
        return model;
    }

    public static MercedesBuilder builder() {
        return new MercedesBuilder();
    }

    protected static final class MercedesBuilder {
        private String model;

        private MercedesBuilder() {}

        public MercedesBuilder withModel(String model) {
            this.model = model;
            return this;
        }

        public Mercedes build() {
            Mercedes mercedes = new Mercedes();
            mercedes.model = this.model;
            return mercedes;
        }
    }
}
