package ru.netology.smartHouse;

public class Radio {
    public int NumberStation;
    public int Volume;

    public void setNumberStation(int newNumberStation) {
        if (newNumberStation < 0) {
            NumberStation = 9;
            return;
        }
        if (newNumberStation > 9) {
            NumberStation = 0;
            return;
        }
        NumberStation = newNumberStation;
    }

    public void next() {
        setNumberStation(NumberStation + 1);
    }

    public void prev() {
        setNumberStation(NumberStation - 1);
    }

    public void increaseVolume() {
        if (Volume < 10) {
            Volume = Volume + 1;
        }
    }

    public void decreaseVolume() {
        if (Volume > 0) {
            Volume = Volume - 1;
        }
    }
}
