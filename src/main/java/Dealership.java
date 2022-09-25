import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.Arrays;

public class Dealership {
    public static Map<String, List<String>> MODEL_NAME_AND_BODY_MAP = initDealership();

    private static Map<String, List<String>> initDealership() {
        Map<String, List<String>> dealershipCarMap = new HashMap<>();
        dealershipCarMap.put("Ford", Arrays.asList("Седан", "Хэтчбэк", "Универсал"));
        dealershipCarMap.put("Zhiguli", Arrays.asList("Седан", "Универсал"));
        dealershipCarMap.put("McLaren", List.of("Sport Coupe"));

        return dealershipCarMap;
    }

    public static void performZhiguli(String carName, String bodyName) {
        if (carName != null && carName.equals("Zhiguli")) {
            System.out.println("Фу, нищета");
        }

        if (bodyName != null) {

            if (bodyName.equals("Седан")) {
                System.out.println("Ну и нахуй тебе такое корыто?");
            }

            if (bodyName.equals("Универсал")) {
                System.out.println("Чё, картохи у родителей дохуя?");
            }

        }
    }
}

