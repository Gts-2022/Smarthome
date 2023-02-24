package ru.netology.Smarthome;

public class Radio {

    private int currentRadioStation;
    private int currentVolume;

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int newCurrentRadioStation) {
        if (newCurrentRadioStation < 0) {
            return;
        }
        if (newCurrentRadioStation > 9) {
            return;
        }
        currentRadioStation = newCurrentRadioStation;
    }

    public void increaseNextStation() {

        if (currentRadioStation == 9) {
            currentRadioStation = 0;
            return;

        }
        currentRadioStation++;
    }

    public void reduceCurrentStation() {

        if (currentRadioStation == 0) {
            currentRadioStation = 9;
            return;

        }
        currentRadioStation--;
    }


    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            return;
        }
        if (newCurrentVolume > 10) {
            return;
        }
        currentVolume = newCurrentVolume;
    }


    public void increaseVolume() {
        if (currentVolume == 10) {

            currentVolume = 10;
            return;
        }
        currentVolume = currentVolume + 1;


    }

    public void decreaseVolume() {

        if (currentVolume == 0) {
            currentVolume = 0;
            return;
        }

        currentVolume = currentVolume - 1;


    }
}






