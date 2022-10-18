package models;

import java.util.Random;
import java.util.Scanner;

public class Runner {
    private Car car;
    private Train train;
    private Airplane airplane;

    public void console() {
        transport();
        /*Car car = new Car("0185KG",5,60);
        Train train = new Train("5972",60,80);
        Airplane airplane = new Airplane("AirEarth",100,250);*/
        Scanner sc = new Scanner(System.in);
        if (car != null) {
            car.ride();
            System.out.println("1.Номер\n2.Место\n3.Новое колесо");
            switch (sc.nextInt()) {
                case 1:
                    car.transportName();
                    break;
                case 2:
                    car.seat();
                    break;
                case 3:
                    car.wheel();
                    break;
            }
        } else if (train != null) {
            train.ride();
            System.out.println("1.Номер\n2.Место");
            switch (sc.nextInt()) {
                case 1:
                    train.transportName();
                    break;
                case 2:
                    train.seat();
                    break;
            }
        } else if (airplane != null) {
            airplane.ride();
            System.out.println("1.Номер\n2.Место");
            switch (sc.nextInt()) {
                case 1:
                    airplane.transportName();
                    break;
                case 2:
                    airplane.seat();
                    break;
            }
        }
    }


    public void transport() {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("1.Машина\n2.Поезд\n3.Самолет\nВыберите транспорт: ");
        switch (sc.nextInt()) {
            case 1:
                car = new Car();
                System.out.println("Введите номер машины: ");
                car.setVehicleNumber(sc.next());
                System.out.println("Введите посадочное место(4): ");
                int i = sc.nextInt();
                if (i < 5)
                    car.setSeat(i);
                else
                    car.setSeat(random.nextInt(4+1));
                System.out.println("Введите скорость машины: ");
                car.setSpeed(sc.nextInt());
                break;
            case 2:
                train = new Train();
                System.out.println("Введите номер поезда: ");
                train.setVehicleNumber(sc.next());
                System.out.println("Введите посадочное место(100): ");
                int j = sc.nextInt();
                if (j < 101)
                    car.setSeat(j);
                else
                    car.setSeat(random.nextInt(100+1));
                train.setSeat(sc.nextInt());
                System.out.println("Введите скорость поезда: ");
                train.setSpeed(sc.nextInt());
                break;
            case 3:
                airplane = new Airplane();
                System.out.println("Введите название самолета: ");
                airplane.setVehicleNumber(sc.next());
                System.out.println("Введите посадочное место(60): ");
                int f = sc.nextInt();
                if (f < 61)
                    car.setSeat(f);
                else
                    car.setSeat(random.nextInt(60+1));
                airplane.setSeat(sc.nextInt());
                System.out.println("Введите скорость самолета: ");
                airplane.setSpeed(sc.nextInt());
                break;
        }
    }
}
