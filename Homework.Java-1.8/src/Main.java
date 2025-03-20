import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Creare adrese
        Adresa adresa1 = new Adresa("Strada A", "Bucuresti", "123456");
        Adresa adresa2 = new Adresa("Strada B", "Craiova", "654321");

        // Creare orase
        Oras oras1 = new Oras("Bucuresti");
        Oras oras2 = new Oras("Craiova");

        // Creare hoteluri
        Hotel hotel1 = new Hotel("Hotel X", adresa1);
        Hotel hotel2 = new Hotel("Hotel Y", adresa2);

        // Adaugare hoteluri la orase
        oras1.addHotel(hotel1);
        oras2.addHotel(hotel2);

        // Creare turisti
        Turist turist1 = new Turist("Maria", adresa1, hotel1);
        Turist turist2 = new Turist("Andrei", adresa2, hotel2);

        // Adaugare turisti la hoteluri
        hotel1.addTurist(turist1);
        hotel2.addTurist(turist2);

        // Afisare detalii
        System.out.println("Oras 1: " + oras1);
        System.out.println("Oras 2: " + oras2);

        // Schimbare adresa hotel
        Adresa adresaNoua = new Adresa("Strada C", "Bucuresti", "111111");
        changeAddress(hotel1, adresaNoua);
        System.out.println("\nDupa schimbarea adresei hotelului 1:");
        System.out.println(hotel1);

        // Mutare turist la alt hotel
        moveTouristToAnotherHotel(turist1, hotel2);
        System.out.println("\nDupa mutarea lui Maria la Hotel Y:");
        System.out.println("Hotel X: " + hotel1);
        System.out.println("Hotel Y: " + hotel2);

        // Afisare turisti din oras
        System.out.println("\nTuristi in orasul Craiova:");
        displayTouristsInCity(oras2);

        // Verificare daca o persoana este cazata intr-un oras
        System.out.println("\nEste Maria cazata in orasul Craiova? " + isPersonAccommodatedInCity(turist1, oras2));

        // Afisare toate persoanele si turistii
        System.out.println("\nToate persoanele si turistii:");
        displayAllPersonsAndTourists(List.of(turist1, turist2));
    }

    // Metode stub
    public static void changeAddress(Hotel hotel, Adresa adresaNoua) {
        hotel.getAdresa().setStrada(adresaNoua.getStrada());
        hotel.getAdresa().setOras(adresaNoua.getOras());
        hotel.getAdresa().setCodPostal(adresaNoua.getCodPostal());
    }

    public static void moveTouristToAnotherHotel(Turist turist, Hotel hotelNou) {
        Hotel hotelVechi = turist.getHotel();
        if (hotelVechi != null) {
            hotelVechi.removeTurist(turist);
        }
        hotelNou.addTurist(turist);
    }

    public static void displayTouristsInCity(Oras oras) {
        for (Hotel hotel : oras.getHoteluri()) {
            System.out.println("Hotel: " + hotel.getNume());
            for (Turist turist : hotel.getTuristi()) {
                System.out.println("  " + turist.getNume());
            }
        }
    }

    public static boolean isPersonAccommodatedInCity(Turist turist, Oras oras) {
        for (Hotel hotel : oras.getHoteluri()) {
            if (hotel.getTuristi().contains(turist)) {
                return true;
            }
        }
        return false;
    }

    public static void displayAllPersonsAndTourists(List<Turist> turisti) {
        for (Turist turist : turisti) {
            System.out.println(turist);
        }
    }
}