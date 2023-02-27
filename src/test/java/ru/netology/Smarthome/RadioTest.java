package ru.netology.Smarthome;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.Smarthome.Radio;

public class RadioTest {
    @Test
    public void shouldNumberRadioStation() {
        Radio stat = new Radio(0, 49, 0, 100);

        Assertions.assertEquals(49, stat.getMaxRadioStation());
        Assertions.assertEquals(0, stat.getMinRadioStation());
        Assertions.assertEquals(0, stat.getCurrentRadioStation());
        Assertions.assertEquals(100, stat.getMaxVolume());
        Assertions.assertEquals(0, stat.getMinVolume());
        Assertions.assertEquals(0, stat.getCurrentVolume());
    }

    @Test
    public void shouldNotSetRadioStationAboveMax() {
        Radio stat = new Radio(50);
        stat.setCurrentRadioStation(50);
        Assertions.assertEquals(0, stat.getCurrentRadioStation());

    }

    @Test
    public void shouldNotSetRadioStationBelowMin() {
        Radio stat = new Radio(50);
        stat.setCurrentRadioStation(-10);
        Assertions.assertEquals(0, stat.getMinRadioStation());

    }

    @Test
    public void shouldNextRadioStationAfterCurrent() {
        Radio stat = new Radio(50);
        int currentRadioStation = 2;
        stat.setCurrentRadioStation(currentRadioStation);
        stat.setIncreaseNextStation();

        Assertions.assertEquals(3, stat.getCurrentRadioStation());
    }

    @Test
    public void shouldReduceCurrentRadioStation() {
        Radio stat = new Radio(50);
        int currentRadioStation = 19;
        stat.setCurrentRadioStation(currentRadioStation);
        stat.setReduceCurrentStation();
        Assertions.assertEquals(18, stat.getCurrentRadioStation());
    }

    @Test
    public void shouldNextStationAfterMax() {
        Radio stat = new Radio(50);
        int currentRadioStation = 49;
        stat.setCurrentRadioStation(currentRadioStation);
        stat.setIncreaseNextStation();

        Assertions.assertEquals(0, stat.getCurrentRadioStation());
    }

    @Test
    public void shouldPreviousStationBeforeMin() {
        Radio stat = new Radio(50);
        int currentRadioStation = 0;
        stat.setCurrentRadioStation(currentRadioStation);
        stat.setReduceCurrentStation();

        Assertions.assertEquals(49, stat.getCurrentRadioStation());
    }

    @Test
    public void shouldValueSetLevelBelowMin() {

        Radio stat = new Radio(50);
        stat.setCurrentVolume(-1);

        Assertions.assertEquals(0, stat.getCurrentVolume());

    }

    @Test
    public void shouldSetVolumeLevelAboveMax() {
        Radio stat = new Radio(50);
        stat.setCurrentVolume(101);

        Assertions.assertEquals(0, stat.getCurrentVolume());

    }

    @Test
    public void shouldReduceVolumeLevelBelowMin() {
        Radio stat = new Radio(50);
        int currentVolume = 0;
        stat.setCurrentVolume(currentVolume);
        stat.setDecreaseVolume();

        Assertions.assertEquals(0, stat.getCurrentVolume());

    }


    @Test
    public void shouldReduceVolumeLevel() {
        Radio stat = new Radio(50);
        int currentVolume = 45;
        stat.setCurrentVolume(currentVolume);
        stat.setDecreaseVolume();

        Assertions.assertEquals(44, stat.getCurrentVolume());

    }

    @Test
    public void shouldIncreaseVolumeLevel() {
        Radio stat = new Radio(50);
        int currentVolume = 19;
        stat.setCurrentVolume(currentVolume);
        stat.setIncreaseVolume();

        Assertions.assertEquals(20, stat.getCurrentVolume());
    }

    @Test
    public void shouldIncreaseMaxVolumeLevelOne() {
        Radio stat = new Radio(50);
        int currentVolume = 100;
        stat.setCurrentVolume(currentVolume);
        stat.setIncreaseVolume();

        Assertions.assertEquals(100, stat.getCurrentVolume());
    }
}