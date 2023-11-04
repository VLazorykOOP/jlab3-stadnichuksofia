//public class Metropolis extends Region {
//    String nameOfMetropolis;
//    int population;
//
//    public Metropolis(String name) {
//        super(name);
//    }
//
//
//    public Metropolis(
//            String street,
//            String houseNumber,
//            int apartmentNumber,
//            int id,
//            String name,
//            int postcode,
//            String historicalAndEthnographicArea,
//            String nameOfMetropolis,
//            int population
//    ) {
////        super(street, houseNumber, apartmentNumber, id, name, postcode, historicalAndEthnographicArea);
//        this.nameOfMetropolis = nameOfMetropolis;
//        this.population = population;
//    }
//
//    @Override
//    public String toString() {
//        return "Metropolis: " +
//                "nameOfMetropolis: " + nameOfMetropolis +
//                ", (population: " + population + ')' + ", " +
//                super.toString();
//    }
//}

class Metropolis extends City {
    String metropolis;

    public Metropolis(String name, int population, String mayor, String metropolisType) {
        super(name, population, mayor);
        this.metropolis = metropolisType;
    }

    @Override
    public void show() {
        super.show();
        System.out.println("Тип мегаполісу: " + metropolis);
    }
}
