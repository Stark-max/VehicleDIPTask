package services;

import models.Train;

import java.util.ArrayList;

public interface TrainService {

    void displayTrain(ArrayList<Train> trainArrayList);

    Train reserveTrain(ArrayList<Train> trainArrayList);

    void displayReservationTrain(Train train);
}
