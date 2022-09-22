import java.util.Scanner;
public class Dealership {
    public static void main(String[] args) {
        int carName;
        int body;

        System.out.println("выберете марку: 1 - Форд, 2 - Жигуль, 3 - МкКларен");
        Scanner carNameIn = new Scanner(System.in);
        carName = carNameIn.nextInt();

        if (carName == 1) {
            System.out.println("выбран форд");
            System.out.println("выберете кузов 1 - седан, 2 - универсал, 3 - хэтч");
            Scanner bodyIn = new Scanner(System.in);
            body = bodyIn.nextInt();
            if (body == 1){
                System.out.println("выбран седан");
            }
            else if (body == 2){
                System.out.println("выбран универсал");
            }
            else if (body == 3) {
                System.out.println("выбран хачбэхэк");
            }
            else System.out.println("другого нит");
        }

        else if (carName == 2) {
            System.out.println("выбран жигуль, фу нищета");
            System.out.println("выберете кузов 1 - седан, 2 - универсал");
            Scanner bodyIn = new Scanner(System.in);
            body = bodyIn.nextInt();
            if (body == 1){
                System.out.println("выбран седан");
            }
            else if (body == 2){
                System.out.println("выбран универсал");
            }
            else System.out.println("иди копи деньги");
        }
        else if (carName == 3 ){
            System.out.println("выбран мккларен, фу понторез");
            System.out.println("кузов только купе,согласы? 1 - да, 2 - нет");
            Scanner bodyIn = new Scanner(System.in);
            body = bodyIn.nextInt();
            if (body == 1){
                System.out.println("хорошо");
            }
            else if (body == 2){
                System.out.println("на нет - и суда нет");
            }
            else System.out.println("дохуя умный?");
        }


    }

}
