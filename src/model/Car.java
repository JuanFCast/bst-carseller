package model;

public class Car {

    private double price;
    private String brand;

    private Car up;
    private Car left;
    private Car right;

    public Car(String b, double p) {
        brand = b;
        price = p;
    }

    public Car getUp() {
        return up;
    }

    public void setUp(Car up) {
        this.up = up;
    }

    public Car getLeft() {
        return left;
    }

    public void setLeft(Car left) {
        this.left = left;
    }

    public Car getRight() {
        return right;
    }

    public void setRight(Car right) {
        this.right = right;
    }

    public double getPrice() {
        return price;
    }

    public String toString() {
        return "Marca: " + brand + "| Precio: " + price;
    }
}
