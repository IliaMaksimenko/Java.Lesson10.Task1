package ru.netology.radio;

public class Radio {

    public int amountStations;
    public int currentStation;
    public int currentVolume;

    public int getCurrentStation() {

        return currentStation;
    }

    public int getCurrentVolume() {

        return currentVolume;
    }

    public Radio() {
        amountStations = 10;
    }

    public Radio(int maxStation) {
        amountStations = maxStation;
    }

    public void setStation(int switchStation) {
        if (switchStation < amountStations & switchStation >= 0) {
            currentStation = switchStation;
        }
    }

    public void nextStation() {
        if (currentStation < amountStations - 1) {
            ++currentStation;
        } else {
            currentStation = 0;
        }
    }

    public void previousStation() {
        if (currentStation > 0) {
            --currentStation;
        } else {
            currentStation = amountStations - 1;
        }
    }

    public void volumePlus() {
        if (currentVolume < 100) {
            ++currentVolume;
        } else {
            currentVolume = 100;
        }
    }

    public void volumeMinus() {
        if (currentVolume > 0) {
            --currentVolume;
        } else {
            currentVolume = 0;
        }
    }
}
