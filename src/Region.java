public class Region extends City {
    String historicalAndEthnographicArea;

    public Region (
            String street,
            String houseNumber,
            int apartmentNumber,
            int id,
            String name,
            int postcode,
            String historicalAndEthnographicArea
    ) {
        super(street, houseNumber, apartmentNumber, id, name, postcode);
        this.historicalAndEthnographicArea = historicalAndEthnographicArea;
    }

    @Override
    public String toString() {
        return "Region: " +
                "historicalAndEthnographicArea: " + historicalAndEthnographicArea + ", " +
                "(" + super.toString() + ")";
    }
}
