package ru.netology.Smarthome;



public class Radio {
    private int maxRadioStation = 9;
    private final int minRadioStation = 0;
    private int currentRadioStation;
    private  int maxVolume;
    private  int minVolume;
    private int currentVolume;

    public Radio() {
        this.currentRadioStation = this.minRadioStation;
        this.maxVolume = 100;
        this.minVolume = 0;
    }

    public Radio(int maxStationIndex) {
      //  this.currentRadioStation = this.minRadioStation;
     //  this.maxVolume = 100;
      //  this.minVolume = 0;
        this.maxRadioStation = maxStationIndex - 1;
    }

    public int getMaxRadioStation() {

        return this.maxRadioStation;
    }

    public int getMinRadioStation() {
        return this.minRadioStation;
    }

    public int getCurrentRadioStation() {
        return this.currentRadioStation;
    }

    public int getMaxVolume() {
        return this.maxVolume;
    }

    public int getMinVolume() {
        return this.minVolume;
    }

    public int getCurrentVolume() {
        return this.currentVolume;
    }

    public void setCurrentRadioStation(int newCurrentRadioStation) {
        if (newCurrentRadioStation >= this.minRadioStation) {
            if (newCurrentRadioStation <= this.maxRadioStation) {
                this.currentRadioStation = newCurrentRadioStation;
            }
        }
    }

    public void setIncreaseNextStation() {
        if (this.currentRadioStation == this.maxRadioStation) {
            this.currentRadioStation = this.minRadioStation;
        } else {
            ++this.currentRadioStation;
        }
    }

    public void setReduceCurrentStation() {
        if (this.currentRadioStation == this.minRadioStation) {
            this.currentRadioStation = this.maxRadioStation;
        } else {
            --this.currentRadioStation;
        }
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume >= this.minVolume) {
            if (newCurrentVolume <= this.maxVolume) {
                this.currentVolume = newCurrentVolume;
            }
        }
    }

    public void setIncreaseVolume() {
        if (this.currentVolume == this.maxVolume) {
        } else {
            ++this.currentVolume;

        }
    }

    public void setDecreaseVolume() {
        if (this.currentVolume == this.minVolume) {
        } else {
            --this.currentVolume;
        }
    }
}





