package services;

import models.Airplane;
import models.Car;
import models.Train;

import java.util.ArrayList;

public interface CarService {


    void displayCar(ArrayList<Car> carArrayList);

    Car reserveCar(ArrayList<Car> carArrayList);

    void displayReservationCar(Car car);
}
