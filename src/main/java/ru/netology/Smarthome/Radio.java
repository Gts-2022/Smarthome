package ru.netology.Smarthome;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Radio {
    private int maxRadioStation = 9;
    private final int minRadioStation = 0;
    private int currentRadioStation;
    private int maxVolume = 100;
    private int minVolume;
    private int currentVolume;


    public Radio(int maxStationIndex) {
        this.currentRadioStation = this.minRadioStation;
        this.maxVolume = 100;
        this.minVolume = 0;
        this.maxRadioStation = maxStationIndex - 1;
    }


    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume >= this.minVolume) {
            if (newCurrentVolume <= this.maxVolume) {
                this.currentVolume = newCurrentVolume;
            }
        }
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