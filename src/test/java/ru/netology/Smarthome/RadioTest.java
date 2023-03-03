package ru.netology.Smarthome;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void shouldNumberRadioStation() {
        Radio stat = new Radio();

        Assertions.assertEquals(9, stat.getMaxRadioStation());
        Assertions.assertEquals(0, stat.getMinRadioStation());
        Assertions.assertEquals(0, stat.getCurrentRadioStation());
        Assertions.assertEquals(100, stat.getMaxVolume());
        Assertions.assertEquals(0, stat.getMinVolume());
        Assertions.assertEquals(0, stat.getCurrentVolume());
    }

    @Test
    public void shouldNotSetRadioStationAboveMax() {
        Radio stat = new Radio();
        Assertions.assertEquals(0, stat.getCurrentRadioStation());

    }

    @Test
    public void shouldChangeNotSetRadioStationAboveMax() {
        Radio stat = new Radio();
        stat.setCurrentRadioStation(50);
        Assertions.assertEquals(0, stat.getCurrentRadioStation());

    }

    @Test
    public void shouldChangeNotSetRadioStationAboveMax1() {
        Radio stat = new Radio(50);
        stat.setCurrentRadioStation(50);
        Assertions.assertEquals(0, stat.getCurrentRadioStation());

    }

    @Test
    public void shouldNotSetRadioStationBelowMin() {
        Radio stat = new Radio();
        stat.setCurrentRadioStation(-10);
        Assertions.assertEquals(0, stat.getMinRadioStation());

    }

    @Test
    public void shouldNextRadioStationAfterCurrent() {
        Radio stat = new Radio();
        int currentRadioStation = 2;
        stat.setCurrentRadioStation(currentRadioStation);
        stat.setIncreaseNextStation();

        Assertions.assertEquals(3, stat.getCurrentRadioStation());
    }

    @Test
    public void shouldReduceCurrentRadioStation() {
        Radio stat = new Radio(50);
        int currentRadioStation = 9;
        stat.setCurrentRadioStation(currentRadioStation);
        stat.setReduceCurrentStation();
        Assertions.assertEquals(8, stat.getCurrentRadioStation());
    }

    @Test
    public void shouldNextStationAfterMax() {
        Radio stat = new Radio();
        int currentRadioStation = 9;
        stat.setCurrentRadioStation(currentRadioStation);
        stat.setIncreaseNextStation();

        Assertions.assertEquals(0, stat.getCurrentRadioStation());
    }

    @Test
    public void shouldPreviousStationBeforeMin() {
        Radio stat = new Radio();
        int currentRadioStation = 0;
        stat.setCurrentRadioStation(currentRadioStation);
        stat.setReduceCurrentStation();

        Assertions.assertEquals(9, stat.getCurrentRadioStation());
    }

    @Test
    public void shouldValueSetLevelBelowMin() {

        Radio stat = new Radio();
        stat.setCurrentVolume(-1);

        Assertions.assertEquals(0, stat.getCurrentVolume());

    }

    @Test
    public void shouldSetVolumeLevelAboveMax() {
        Radio stat = new Radio();
        stat.setCurrentVolume(101);

        Assertions.assertEquals(0, stat.getCurrentVolume());

    }

    @Test
    public void shouldReduceVolumeLevelBelowMin() {
        Radio stat = new Radio();
        int currentVolume = 0;
        stat.setCurrentVolume(currentVolume);
        stat.setDecreaseVolume();

        Assertions.assertEquals(0, stat.getCurrentVolume());

    }


    @Test
    public void shouldReduceVolumeLevel() {
        Radio stat = new Radio();
        int currentVolume = 45;
        stat.setCurrentVolume(currentVolume);
        stat.setDecreaseVolume();

        Assertions.assertEquals(44, stat.getCurrentVolume());

    }

    @Test
    public void shouldIncreaseVolumeLevel() {
        Radio stat = new Radio();
        int currentVolume = 19;
        stat.setCurrentVolume(currentVolume);
        stat.setIncreaseVolume();

        Assertions.assertEquals(20, stat.getCurrentVolume());
    }

    @Test
    public void shouldIncreaseMaxVolumeLevelOne() {
        Radio stat = new Radio();
        int currentVolume = 100;
        stat.setCurrentVolume(currentVolume);
        stat.setIncreaseVolume();

        Assertions.assertEquals(100, stat.getCurrentVolume());
    }


}