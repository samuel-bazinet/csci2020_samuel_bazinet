public class Car {
    int year;
    String make;
    int seats;
    float mileage;

    Car(int year, String make, int seats, float mileage) {
        this.year = year;
        this.make = make;
        this.seats = seats;
        this.mileage = mileage;
    }

    void carSound() {
        System.out.println("beep beep");
    }
}
