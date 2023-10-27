public class Place extends Address {
    String institution;


    public Place (String street, String houseNumber, int apartmentNumber,  int id, String institution) {
        super(street, houseNumber, apartmentNumber, id);
        this.institution = institution;
    }

    @Override
    public String toString() {
        return "Place: " +
                "institution: " + institution + ", " +
                super.toString();
    }
}
