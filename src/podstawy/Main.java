package podstawy;

public class Main {
    protected static String imie = "Rafal";

    public static void main(String[] args) {
//        imie = "Adam";
//	    System.out.println("Witaj świecie. Twoje imię to: " + imie);
        long duzaWartosc = 10;//10=10L
        Long longObject = null;
        float liczbaZmiennoprzecinkowa = 10.2f;
        double liczbaZmiennoprzecinkowa2 = 10.3d;
        int wiek = 20;

        boolean czyOsobaJestTrzezwa = true;
        boolean czyOsobaMaZdanyEgzamin = true;
        boolean czyOsobaMozeJechacSamochodem = czyOsobaJestTrzezwa && czyOsobaMaZdanyEgzamin;
        char znakNowejLinii = '\n';
        char kropka = '.';
        char nieznanyZnak = '\r';
        String text = "Osoba nie jest uprawiona do jazdy samochodem.";
        if(czyOsobaMozeJechacSamochodem){
            System.out.println("Osoba jest" + nieznanyZnak + " uprawiona do" + znakNowejLinii +" jazdy samochodem" + kropka);
        } else {
            System.out.println(text);
        }

        if (czyDanaOsobaMozePic(wiek)){
	        System.out.println("Jesteś uprawiony do wypicia drinka.");
        }
        processZapisu();
    }

    private static boolean czyDanaOsobaMozePic(int wiek){
        return wiek > 18;
    }

    private static void processZapisu(){
        System.out.println("Zapis do bazy danych");
    }
}
