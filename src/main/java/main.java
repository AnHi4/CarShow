public class main {
    public static void main(String[] args) {
        Car carFirst = new Car("Ford", "Sedan", 2015);
        Kit kitFirst = new Kit("Ford", "Sedan", 2015, true, 15, "Sport AWD");
        System.out.println(carFirst);
        System.out.println(kitFirst);
        System.out.println("Odo is about " + carFirst.getOdo());
        System.out.println(carFirst.askQ());
        System.out.println();
        Car carSecond = new Car("Жигули", "Universal", -1995);
        Kit kitSecond = new Kit("Жигули", "Universal", -1995, false, -5, "нищий урод");
        Car carThird = new Car("McClaren", "Sport Coupe", 2022);
        System.out.println(carSecond);
        System.out.println(kitSecond);
        System.out.println("Odo is about " + carSecond.getOdo());
        System.out.println(carSecond.askQ());
        System.out.println();
        Kit kitThird = new Kit("McClaren", "Sport Coupe", 2022, false, 56, "Starter Pack +");
        System.out.println(carThird);
        System.out.println(kitThird);
        System.out.println("Odo is about " + carThird.getOdo());
        System.out.println(carThird.askQ());
       // System.out.println();
    }
}
