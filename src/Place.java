//public class Place {
//    private String name;
//
//    public Place (String name) {
//        this.name = name;
//    }
//
//    @Override
//    public String toString() {
//        return "Place: " +
//                "name: " + name + ", ";
//    }
//}
class Place {
    String name;
    int population;

    public Place(String name, int population) {
        this.name = name;
        this.population = population;
    }

    public void show() {
        System.out.println("Місце: " + name);
        System.out.println("Населення: " + population);
    }
}
