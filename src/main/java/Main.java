import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        //carAndKitExample();
        dealershipExample();
    }

    public static void dealershipExample() {
        Scanner scanner = new Scanner(System.in);
        Map<String, List<String>> modelNameAndBodyMap = Dealership.MODEL_NAME_AND_BODY_MAP;

        List<String> carNames = new ArrayList<>(modelNameAndBodyMap.keySet());

        System.out.println("Выберете марку: " + carNames);
        String carName = scanner.nextLine();

        if (!carNames.contains(carName)) {
            System.out.println("Дохуя умный? Пошёл нахуй. Говном не торгуем! ОХРАААНА!");
            System.exit(0);
        }

        Dealership.performZhiguli(carName, null);

        System.out.println("Выберете кузов: " + modelNameAndBodyMap.get(carName));
        String bodyName = scanner.nextLine();
        List<String> bodyNames = modelNameAndBodyMap.get(carName);

        Dealership.performZhiguli(null, bodyName);

        if (!bodyNames.contains(bodyName)) {
            System.out.println("Не, ну ты внатуре осел блять, русскими буквами написаны виды доступных кузовов.");
            System.exit(0);
        }

        System.out.println(String.format("Вы выбрали машину %s в кузове %s", carName, bodyName));
    }

  /*  public static void carAndKitExample() {
        Car carFirst = new Car("Ford", "Sedan", 2015);
        Kit kitFirst = new Kit(true, 15, "Sport AWD");
        printCarAndKitInfo(carFirst, kitFirst);

        Car carSecond = new Car("Жигули", "Universal", 1995);
        Kit kitSecond = new Kit(false, -5, "нищий урод");
        printCarAndKitInfo(carSecond, kitSecond);

        Car carThird = new Car("McLaren", "Sport Coupe", 2022);
        Kit kitThird = new Kit(false, 56, "Starter Pack +");
        printCarAndKitInfo(carThird, kitThird);

        Car carForth = new Car("VW", "Hatch", 2003);
        Kit kitForth = new Kit(true, 7, "okolobich");
        printCarAndKitInfo(carForth, kitForth);
    }

    public static void printCarAndKitInfo(Car car, Kit kit) {
        System.out.println(car);
        System.out.println(kit);
        System.out.println("Odo is about " + car.getOdo());
        System.out.println(car.askQ());
        System.out.println();
    } */
}