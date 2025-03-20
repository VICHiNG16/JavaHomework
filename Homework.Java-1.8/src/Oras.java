import java.util.ArrayList;
import java.util.List;

public class Oras {
    private String nume;
    private List<Hotel> hoteluri;

    public Oras(String nume) {
        this.nume = nume;
        this.hoteluri = new ArrayList<>();
    }

    // Metode
    public void addHotel(Hotel hotel) {
        hoteluri.add(hotel);
    }

    // Getteri
    public String getNume() { return nume; }
    public List<Hotel> getHoteluri() { return hoteluri; }

    @Override
    public String toString() {
        return "Oras: " + nume + ", Hoteluri: " + hoteluri.size();
    }
}