package podstawy.varargs.model;

public enum TypSilnika {
    ELEKTRYCZNY("Typ silnika elektrycznego.", 120),
    BENZYNOWY("Typ silnika benzynowego.", 194),
    DISIEL("Typ silnika disiel.", 220),
    HYBRYDA("Typ silnika hydryda.", 330);

    private String description;
    private int moc;

    TypSilnika(String description, int moc){
        this.description = description;
        this.moc = moc;
    }

    public String getDescription() {
        return description;
    }

    public int getMoc() {
        return moc;
    }
}
