package podstawy;

public class WarunkiSterujace {

    public static void main(String[] args) {
        int cenaSamochodu = 200000;
        int stawka = procesujTypPromocjiPrzezSwitch(TypyPromocji.STANDARDOWA, 20);
        int obnizka = 100 - stawka;
        int nowaCenaSamochodu = (obnizka * cenaSamochodu) / 100;
        System.out.println("Cena samochodu przez obniżką: " + cenaSamochodu);
        System.out.println("Stawka obniżki wynikająca z promocji: " + stawka + "%");
        System.out.println("Cena samochodu po obniżce: " + nowaCenaSamochodu);
    }

    private static void procesujTypyPromocji(TypyPromocji typyPromocji) {
        if (typyPromocji == TypyPromocji.STANDARDOWA) {
            System.out.println("Promocja standardowa.");
        } else if (typyPromocji == TypyPromocji.PREMIUM) {
            System.out.println("Promocja premium.");
        } else if (typyPromocji == TypyPromocji.SUPERB) {
            System.out.println("Promocja super plus B.");
        } else {
            System.out.println("Dana promocja nie jest obsługiwana.");
        }
    }

    private static int procesujTypPromocjiPrzezSwitch(TypyPromocji typyPromocji, int znizkaFirmowa) {
        switch (typyPromocji) {
            case STANDARDOWA:
                System.out.println(typyPromocji.getOpis());
                return typyPromocji.getStawka() + znizkaFirmowa;
            case PREMIUM:
            case SUPERB:
                System.out.println(typyPromocji.getOpis());
                return typyPromocji.getStawka();
            default:
                System.out.println("Przepraszamy danej promocji " + typyPromocji + " nie obsługujemy.");
                throw new RuntimeException();
        }
    }
}
