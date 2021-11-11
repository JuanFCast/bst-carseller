package ui;

import model.Car;
import model.CarSeller;

public class Main {

    private static CarSeller seller = new CarSeller();

    public Main() {

    }

    public static void main(String [] args) {
        seller.addCar(new Car("Mazda", 19000));
        seller.addCar(new Car("Ford", 21000));
        seller.addCar(new Car("Chevrolet", 5000));
        seller.addCar(new Car("Kia", 7000));
        seller.addCar(new Car("Ford", 24000));
        seller.addCar(new Car("Mazda", 9000));

        print();

    }

    public static void print() {
        System.out.println(seller.print());
    }
}
