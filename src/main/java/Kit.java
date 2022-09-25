class Kit {
    private boolean gearBox;
    private int numberOfOptions;
    private String nameOfKit;

    public Kit(boolean gearBox, int numberOfOptions, String nameOfKit) {
        this.gearBox = gearBox;
        setNumberOfOptions(numberOfOptions);
        this.nameOfKit = nameOfKit;
    }

    public boolean isGearBox() {
        return gearBox;
    }

    public void setGearBox(boolean gearBox) {
        this.gearBox = gearBox;
    }

    public int getNumberOfOptions() {
        return numberOfOptions;
    }

    public void setNumberOfOptions(int numberOfOptions) {
        if (numberOfOptions < 0) {
            System.out.println("что-то отъебнуло, скидки не будет");
        }
        this.numberOfOptions = numberOfOptions;
    }

    public String getNameOfKit() {
        return nameOfKit;
    }

    public void setNameOfKit(String nameOfKit) {
        this.nameOfKit = nameOfKit;
    }

    @Override
    public String toString() {
        return "Kit " +
                "gearBox = " + gearBox +
                ", numberOfOptions = " + numberOfOptions +
                ", nameOfKit = '" + nameOfKit + '\'';

    }
}