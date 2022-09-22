
import java.util.Calendar;
import static java.lang.Math.abs;

public class Car {
    String brand;
    String body;
    int yearRelease;
    int yearNow = 2022;

    public Car(String brand, String body, int yearRelease) {
        this.brand = brand;
        this.body = body;
        setYearRelease(yearRelease);
    }

    @Override
    public String toString() {
        return "Car " +
                "brand = '" + brand + '\'' +
                ", Body type = '" + body + '\'' +
                ", Release year = " + yearRelease;
    }

    public int getOdo() {
        int yearNow = Calendar.getInstance().get(Calendar.YEAR);
        double odo = (yearNow - yearRelease) * Math.random() * 15000;
        return (int) odo;

    }

    public void setYearRelease(int yearRelease) {
        if (yearRelease < 0) {
            this.yearRelease = abs(yearRelease);
        } else {
            this.yearRelease = yearRelease;
        }
    }
    public String askQ() {
        return "Am i good?";
    }
}








