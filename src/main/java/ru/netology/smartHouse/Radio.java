package ru.netology.smartHouse;

public class Radio {
    public int NumberStation;
    public int stationNumberRadio = 10;
    public int minStationNumber = 0;
    public int maxStationNumber = 9;
    public int Volume = 50;
    public int minVolume = 0;
    public int maxVolume = 100;

    public Radio(int number) {
        this.stationNumberRadio = number;
        this.maxStationNumber = number - 1;
    }

    public Radio() {

    }

    public void setNumberStation(int newstationNumber) {
        if (newstationNumber < minStationNumber) {
            stationNumberRadio = maxStationNumber;
            return;
        }
        if (newstationNumber > maxStationNumber) {
            stationNumberRadio = minStationNumber;
            return;
        }
        stationNumberRadio = newstationNumber;
    }

    public void next() {
        setNumberStation(stationNumberRadio + 1);
    }

    public void prev() {
        setNumberStation(stationNumberRadio - 1);
    }

    public void increaseVolume() {
        if (Volume < maxVolume) {
            Volume = Volume + 1;
        }
    }

    public void decreaseVolume() {
        if (Volume > minVolume) {
            Volume = Volume - 1;
        }
    }
}