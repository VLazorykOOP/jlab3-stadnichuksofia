public class Metropolis extends Region {
    String nameOfMetropolis;
    int population;


    public Metropolis(
            String street,
            String houseNumber,
            int apartmentNumber,
            int id,
            String name,
            int postcode,
            String historicalAndEthnographicArea,
            String nameOfMetropolis,
            int population
    ) {
        super(street, houseNumber, apartmentNumber, id, name, postcode, historicalAndEthnographicArea);
        this.nameOfMetropolis = nameOfMetropolis;
        this.population = population;
    }

    @Override
    public String toString() {
        return "Metropolis: " +
                "nameOfMetropolis: " + nameOfMetropolis +
                ", (population: " + population + ')' + ", " +
                super.toString();
    }
}
