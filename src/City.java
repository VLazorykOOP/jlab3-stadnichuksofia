
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
