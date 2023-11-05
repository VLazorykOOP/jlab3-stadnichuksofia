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
