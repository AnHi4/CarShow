import java.util.Calendar;

import static java.lang.Math.abs;

public class Car {
    private String brand;
    private String body;
    private int yearRelease;

    public Car(String brand, String body, int yearRelease) {
        this.brand = brand;
        this.body = body;
        setYearRelease(yearRelease);
    }

    public int getOdo() {
        int yearNow = Calendar.getInstance().get(Calendar.YEAR);
        double odo = (yearNow - yearRelease) * Math.random() * 15000;
        return (int) odo;

    }

    public String askQ() {
        return "Am i good?";
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public int getYearRelease() {
        return yearRelease;
    }

    public void setYearRelease(int yearRelease) {
        if (yearRelease < 0) {
            this.yearRelease = abs(yearRelease);
        } else {
            this.yearRelease = yearRelease;
        }
    }

    @Override
    public String toString() {
        return "Car " +
                "brand = '" + brand + '\'' +
                ", Body type = '" + body + '\'' +
                ", Release year = " + yearRelease;
    }
}


