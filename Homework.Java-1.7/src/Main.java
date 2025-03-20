import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Adresa adresa1 = new Adresa("Strada A", "Craiova", "123456");
        Adresa adresa2 = new Adresa("Strada B", "Craiova", "654321");

        Companie companie1 = new Companie("Compania X", adresa1);
        Companie companie2 = new Companie("Compania Y", adresa2);

        Angajat angajat1 = new Angajat("Maria", adresa1, companie1);
        Angajat angajat2 = new Angajat("Andrei", adresa2, companie1);

        companie1.addAngajat(angajat1);
        companie1.addAngajat(angajat2);

        System.out.println("Starea initiala:");
        System.out.println("Compania X: " + companie1);
        System.out.println("Compania Y: " + companie2);

        moveEmployeeToAnotherCompany(angajat1, companie2);

        System.out.println("\nDupa mutarea lui Maria la Compania Y:");
        System.out.println("Compania X: " + companie1);
        System.out.println("Compania Y: " + companie2);

        System.out.println("\nAdrese angajati la Compania X cu adresa " + adresa1 + ":");
        displayAddressesOfEmployeesAtCompany(companie1, adresa1);

        System.out.println("\nCautare companie dupa nume si listare angajati:");
        List<Companie> companii = new ArrayList<>();
        companii.add(companie1);
        companii.add(companie2);
        Companie companieGasita = findCompanyByName(companii, "Compania Y");
        if (companieGasita != null) {
            System.out.println("Angajati la " + companieGasita.getNume() + ": " + companieGasita.getAngajati());
        }
    }

    // Metode stub
    public static void moveEmployeeToAnotherCompany(Angajat angajat, Companie nouaCompanie) {
        Companie vecheCompanie = angajat.getCompanie();
        if (vecheCompanie != null) {
            vecheCompanie.removeAngajat(angajat);
        }
        nouaCompanie.addAngajat(angajat);
    }

    public static void displayAddressesOfEmployeesAtCompany(Companie companie, Adresa adresa) {
        for (Angajat angajat : companie.getAngajati()) {
            if (angajat.getAdresa().equals(adresa)) {
                System.out.println(angajat.getNume() + ": " + angajat.getAdresa());
            }
        }
    }

    public static Companie findCompanyByName(List<Companie> companii, String nume) {
        for (Companie companie : companii) {
            if (companie.getNume().equals(nume)) {
                return companie;
            }
        }
        return null;
    }
}