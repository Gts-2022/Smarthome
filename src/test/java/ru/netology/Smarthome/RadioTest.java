package ru.netology.Smarthome;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.Smarthome.Radio;

public class RadioTest {


    @Test
    public void shouldNotSetRadioStationAboveMax() {
        Radio stat = new Radio();
        stat.setCurrentRadioStation(10);
        int expected = 0;
        int actual = stat.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldNotSetRadioStationBelowMin() {
        Radio stat = new Radio();
        stat.setCurrentRadioStation(-1);
        int expected = 0;
        int actual = stat.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldNextRadioStationAfterCurrent() {
        Radio stat = new Radio();
        int currentRadioStation = 1;
        stat.setCurrentRadioStation(currentRadioStation);
        stat.increaseNextStation();
        int expected = 2;
        int actual = stat.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReduceCurrentRadioStation() {
        Radio stat = new Radio();
        int currentRadioStation = 9;
        stat.setCurrentRadioStation(currentRadioStation);
        stat.reduceCurrentStation();
        int expected = 8;
        int actual = stat.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextStationAfterMax() {
        Radio stat = new Radio();
        int currentRadioStation = 9;
        stat.setCurrentRadioStation(currentRadioStation);
        stat.increaseNextStation();
        int expected = 0;
        int actual = stat.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPreviousStationBeforeMin() {
        Radio stat = new Radio();
        int currentRadioStation = 0;
        stat.setCurrentRadioStation(currentRadioStation);
        stat.reduceCurrentStation();
        int expected = 9;
        int actual = stat.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldValueSetLevelBelowMin() {
        Radio stat = new Radio();
        stat.setCurrentVolume(-1);
        int expected = 0;
        int actual = stat.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSetVolumeLevelAboveMax() {
        Radio stat = new Radio();
        stat.setCurrentVolume(11);
        int expected = 0;
        int actual = stat.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldReduceVolumeLevelBelowMin() {
        Radio stat = new Radio();
        int currentVolume = 0;
        stat.setCurrentVolume(currentVolume);
        stat.decreaseVolume();
        int expected = 0;
        int actual = stat.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }


    @Test
    public void shouldIncreaseMaxVolumeLevelOne() {
        Radio stat = new Radio();
        int currentVolume = 10;
        stat.setCurrentVolume(currentVolume);
        stat.increaseVolume();
        int expected = 10;
        int actual = stat.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReduceVolumeLevel() {
        Radio stat = new Radio();
        int currentVolume = 4;
        stat.setCurrentVolume(currentVolume);
        stat.decreaseVolume();
        int expected = 3;
        int actual = stat.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldIncreaseVolumeLevel() {
        Radio stat = new Radio();
        int currentVolume = 9;
        stat.setCurrentVolume(currentVolume);
        stat.increaseVolume();
        int expected = 10;
        int actual = stat.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }


}