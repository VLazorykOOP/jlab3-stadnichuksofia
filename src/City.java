//public class City extends Place {
//    String name;
//    boolean isMega;
//
//    public City (String name, boolean isMega) {
//        this.name = name;
//    }
//
//    @Override
//    public String toString() {
//        String type = isMega ? "Mega" : "City";
//        return type + ": " +
//                super.toString() +  ", ";
//    }
//}
class City extends Place {
    String mayor;

    public City(String name, int population, String mayor) {
        super(name, population);
        this.mayor = mayor;
    }

    @Override
    public void show() {
        super.show();
        System.out.println("Мер: " + mayor);
    }
}
