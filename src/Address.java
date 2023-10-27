public class Address {
    private String street;
    private String houseNumber;
    private int apartmentNumber;
    private int id;

    public Address (String street, String houseNumber, int apartmentNumber, int id) {
        this.street = street;
        this.houseNumber = houseNumber;
        this.apartmentNumber = apartmentNumber;
        this.id = id;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }
    public int getApartmentNumber() {
        return apartmentNumber;
    }

    public void setApartmentNumber(int apartmentNumber) {
        this.apartmentNumber = apartmentNumber;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return  "street: " + street +
                ", houseNumber: " + houseNumber +
                ", apartmentNumber: " + apartmentNumber +
                ", ID: " + id;
    }
}

