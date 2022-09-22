import java.util.Scanner;
public class Dealership {
    public static void main(String[] args) {
        int carDealerId;
        int carBodyId;
            System.out.println("выберете марку: 1 - Форд, 2 - Жигуль, 3 - МкКларен");
        Scanner scan = new Scanner(System.in);
        carDealerId = scan.nextInt();
        if (carDealerId == 1) {
            System.out.println("выбран форд");
            System.out.println("выберете кузов 1 - седан, 2 - универсал, 3 - хэтч");
            carBodyId = scan.nextInt();
            if (carBodyId == 1){
                System.out.println("выбран седан");
            } else if (carBodyId == 2){
                System.out.println("выбран универсал");
            } else if (carBodyId == 3) {
                System.out.println("выбран хачбэхэк");
            } else System.out.println("другого нит");
        }
        else if (carDealerId == 2) {
            System.out.println("выбран жигуль, фу нищета");
            System.out.println("выберете кузов 1 - седан, 2 - универсал");
            carBodyId = scan.nextInt();
            if (carBodyId == 1){
                System.out.println("выбран седан");
            } else if (carBodyId == 2){
                System.out.println("выбран универсал");
            } else System.out.println("иди копи деньги");
        }
        else if (carDealerId == 3 ){
            System.out.println("выбран мккларен, фу понторез");
            System.out.println("кузов только купе,согласы? 4 - да, 0 - нет");
            carBodyId = scan.nextInt();
            if (carBodyId == 4){
                System.out.println("хорошо");
            } else if (carBodyId == 0){
                System.out.println("на нет - и суда нет");
            } else System.out.println("дохуя умный?");
        }
    }
}
