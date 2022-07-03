package ru.netology.radio;

public class Radio {

    private int amountStations;
    private int currentStation;
    private int currentVolume;

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
        amountStations = maxStation - 1;
    }

    public void setStation(int switchStation) {
        if (switchStation <= amountStations & switchStation >= 0) {
            currentStation = switchStation;
        }
    }

    public void nextStation() {
        if (currentStation < amountStations) {
            ++currentStation;
        } else {
            currentStation = 0;
        }
    }

    public void previousStation() {
        if (currentStation > 0) {
            --currentStation;
        } else {
            currentStation = amountStations;
        }
    }

    public void volumePlus(int volume) {
        if (volume < 100) {
            currentVolume = volume + 1;
        } else {
            currentVolume = 100;
        }
    }

    public void volumeMinus(int volume) {
        if (volume > 0) {
            currentVolume = volume - 1;
        } else {
            currentVolume = 0;
        }
    }
}
