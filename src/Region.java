class Region extends Place {
    String governor;

    public Region(String name, int population, String governor) {
        super(name, population);
        this.governor = governor;
    }
    @Override
    public void show() {
        super.show();
        System.out.println("Голова: " + governor);
    }
}
