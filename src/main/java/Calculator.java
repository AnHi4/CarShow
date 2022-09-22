import java.lang.Math;
import java.util.Calendar;
import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int yearNow = Calendar.getInstance().get(Calendar.YEAR);
        int yearRelease = scan.nextInt();
        double dodo = Math.random()*15000;
        int odo = (int) dodo * (yearNow - yearRelease);
        double dpriceRelease = 500000 + Math.random()*5000000;
        int priceRelease = (int) dpriceRelease;
        double dratioOdo =odo/5000d;
        int ratioOdo = (int) dratioOdo;
        double dratioYear = 0.25d+(yearNow - yearRelease)/2d;
        int ratioYear = (int) dratioYear;
        double dpriceNow = priceRelease * dratioOdo * dratioYear;
        int priceNow = (int) dpriceNow;
        System.out.println(priceRelease);
        System.out.println(odo);
        System.out.println(ratioOdo);
        System.out.println(dratioYear);
        System.out.println(dpriceNow);
        System.out.println(priceNow);
    }
}
