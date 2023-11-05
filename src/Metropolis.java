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
