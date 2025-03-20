public class Turist extends Persoana {
    private Hotel hotel;

    public Turist(String nume, Adresa adresa, Hotel hotel) {
        super(nume, adresa);
        this.hotel = hotel;
    }

    // Getteri si setteri
    public Hotel getHotel() { return hotel; }
    public void setHotel(Hotel hotel) { this.hotel = hotel; }

    @Override
    public String toString() {
        return super.toString() + ", Hotel: " + (hotel != null ? hotel.getNume() : "N/A");
    }
}