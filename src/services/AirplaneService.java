package services;

import models.Airplane;

import java.util.ArrayList;

public interface AirplaneService {

    void displayAirplane(ArrayList<Airplane> airplaneArrayList);

    Airplane reserveAirplane(ArrayList<Airplane> airplaneArrayList);

    void displayReservationAirplane(Airplane airplane);
}
