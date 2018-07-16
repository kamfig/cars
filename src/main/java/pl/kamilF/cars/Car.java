package pl.kamilF.cars;

import java.util.ArrayList;
import java.util.List;

public class Car {
    private String model;
    private String brand;
    private String description;

    private static List<Car> cars = new ArrayList<>();

    public static List<Car> findAll(){
        return cars;
    }
    public Car() {
            }


    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", brand='" + brand + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    public Car(String model, String brand, String description) {
        this();
        this.model = model;
        this.brand = brand;
        this.description = description;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public static List<Car> getCars() {
        return cars;
    }

    public static void setCars(List<Car> cars) {
        Car.cars = cars;
    }
}
