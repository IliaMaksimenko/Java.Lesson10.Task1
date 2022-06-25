package ru.netology.radio;

public class Radio {

    public int currentStation;
    public int currentVolume;

    public int getCurrentStation() {

        return currentStation;
    }

    public int getCurrentVolume() {

        return currentVolume;
    }

    public void setStation(int switchStation) {
        if (switchStation < 10 & switchStation >= 0) {
            currentStation = switchStation;
        }
    }

    public void nextStation() {
        if (currentStation < 9) {
            currentStation = currentStation + 1;
        } else {
            currentStation = 0;
        }
    }

    public void previousStation() {
        if (currentStation > 0) {
            currentStation = currentStation - 1;
        } else {
            currentStation = 9;
        }
    }

    public void volumePlus() {
        if (currentVolume < 10) {
            ++currentVolume;
        } else {
            currentVolume = 10;
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
