class Kit extends Car {
    boolean gearBox;
    int numberOfOptions;
    String nameOfKit;

    public void setNumberOfOptions(int numberOfOptions) {
        if (numberOfOptions < 0) {
            System.out.println("что-то отъебнуло, скидки не будет");
            System.out.println();
        }
        this.numberOfOptions = numberOfOptions;
    }
    @Override
    public String toString() {
        return "Kit " +
                "gearBox = " + gearBox +
                ", numberOfOptions = " + numberOfOptions +
                ", nameOfKit = '" + nameOfKit + '\'';

    }
    public Kit(String brand, String body, int yearRelease, boolean gearBox, int numberOfOptions, String nameOfKit) {
        super(brand, body, yearRelease);
        this.gearBox = gearBox;
        setNumberOfOptions(numberOfOptions);
        this.nameOfKit = nameOfKit;

    }
}