package ru.netology.smartHouse;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class RadioTest {

    @Test
    public void StationNumberZero() {
        Radio radio = new Radio();

        radio.setNumberStation(0);

        int expected = 0;
        int actual = radio.NumberStation;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void StationNumberOne() {
        Radio radio = new Radio();

        radio.setNumberStation(1);

        int expected = 1;
        int actual = radio.NumberStation;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void StationNumbereeight() {
        Radio radio = new Radio();

        radio.setNumberStation(8);

        int expected = 8;
        int actual = radio.NumberStation;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void StationNumberenine() {
        Radio radio = new Radio();

        radio.setNumberStation(9);

        int expected = 9;
        int actual = radio.NumberStation;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void StationNumbereten() {
        Radio radio = new Radio();

        radio.setNumberStation(10);

        int expected = 0;
        int actual = radio.NumberStation;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void NextFromMiddle() {
        Radio radio = new Radio();

        radio.setNumberStation(5);
        radio.next();
        int expected = 6;
        int actual = radio.NumberStation;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void NextFromEnd() {
        Radio radio = new Radio();

        radio.setNumberStation(9);
        radio.next();
        int expected = 0;
        int actual = radio.NumberStation;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void PrevFromMiddle() {
        Radio radio = new Radio();

        radio.setNumberStation(5);
        radio.next();
        int expected = 4;
        int actual = radio.NumberStation;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void PrevFromStart() {
        Radio radio = new Radio();

        radio.setNumberStation(0);
        radio.next();
        int expected = 9;
        int actual = radio.NumberStation;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void MiddleVolume() {
        Radio radio = new Radio();

        radio.Volume = 5;
        radio.decreaseVolume();
        int expected = 6;
        int actual = radio.Volume;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void FromEndVolume() {
        Radio radio = new Radio();

        radio.Volume = 10;
        radio.decreaseVolume();
        int expected = 10;
        int actual = radio.Volume;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void DecreaseVolumeFromMiddle() {
        Radio radio = new Radio();

        radio.Volume = 5;
        radio.decreaseVolume();
        int expected = 4;
        int actual = radio.Volume;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void DecreaseVolumeStart() {
        Radio radio = new Radio();

        radio.Volume = 0;
        radio.decreaseVolume();
        int expected = 0;
        int actual = radio.Volume;

        Assertions.assertEquals(expected, actual);
    }
}
