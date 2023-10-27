public class City extends Address {
    String name;
    int postcode;

    public City (String street, String houseNumber, int apartmentNumber, int id, String name, int postcode) {
        super(street, houseNumber, apartmentNumber, id);
        this.name = name;
        this.postcode = postcode;
    }

    @Override
    public String toString() {
        return "City: " +
                "name: " + name +  ", " +
                super.toString() +  ", " +
                "postcode: " + postcode;
    }
}
