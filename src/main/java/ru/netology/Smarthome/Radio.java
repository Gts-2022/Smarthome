package ru.netology.Smarthome;


public class Radio {
    private int maxRadioStation = 9;
    private int minRadioStation = 0;
    private int currentRadioStation = minRadioStation;

    private int maxVolume = 100;
    private int minVolume = 0;
    private int currentVolume = minVolume;


    public Radio() {

    }

    public Radio(int maxStationIndex) {

        maxRadioStation = maxStationIndex - 1;

    }


    public int getMaxRadioStation() {

        return maxRadioStation;
    }

    public int getMinRadioStation() {
        return minRadioStation;
    }

    public int getCurrentRadioStation() {

        return currentRadioStation;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public int getCurrentVolume() {

        return currentVolume;
    }


    public void setCurrentRadioStation(int newCurrentRadioStation) {
        if (newCurrentRadioStation < minRadioStation) {
            return;
        }
        if (newCurrentRadioStation > maxRadioStation) {
            return;
        }
        currentRadioStation = newCurrentRadioStation;
    }

    public void setIncreaseNextStation() {

        if (currentRadioStation == maxRadioStation) {
            currentRadioStation = minRadioStation;
            return;

        }
        currentRadioStation++;
    }

    public void setReduceCurrentStation() {

        if (currentRadioStation == minRadioStation) {
            currentRadioStation = maxRadioStation;
            return;

        }
        currentRadioStation--;
    }


    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < minVolume) {
            return;
        }
        if (newCurrentVolume > maxVolume) {
            return;
        }
        currentVolume = newCurrentVolume;
    }


    public void setIncreaseVolume() {
        if (currentVolume == maxVolume) {

            currentVolume = maxVolume;
            return;
        }
        currentVolume = currentVolume + 1;


    }

    public void setDecreaseVolume() {

        if (currentVolume == minVolume) {
            currentVolume = minVolume;
            return;
        }

        currentVolume = currentVolume - 1;


    }
}








