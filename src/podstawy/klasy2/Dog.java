package podstawy.klasy2;

public class Dog {
    private final String name;

    private Dog(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    //Pole jest finalowe, więc setName nie zadziała.
    //    public void setName(String name) {
    //        this.name = name;
    //    }

    /**
     * Służy do stworzenia obiektu Dog, bo kontruktor jest private.
     * @param name
     * @return
     */
    public static Dog stworzPsa(String name){
        return new Dog(name);
    }
}
