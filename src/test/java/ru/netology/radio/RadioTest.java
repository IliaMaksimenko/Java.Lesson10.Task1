package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;


public class RadioTest {


    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/OptionsSwitchStation.csv")
    public void shouldSetStation(int station, int expected) {
        Radio state = new Radio(16);

        state.setStation(station);
        int actual = state.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }


    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/OptionsNextStation.csv")
    public void shouldSetNextStation(int station, int expected) {
        Radio state = new Radio(20);

        state.setStation(station);
        state.nextStation();
        int actual = state.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }


    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/OptionsPreviousStation.csv")
    public void shouldSetPreviousStation(int station, int expected) {
        Radio state = new Radio();

        state.setStation(station);
        state.previousStation();
        int actual = state.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }


    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/OptionsPlusVolume.csv")
    public void shouldSetPlusVolume(int volume, int expected) {
        Radio state = new Radio();

        state.volumePlus(volume);
        int actual = state.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }


    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/OptionsMinusVolume.csv")
    public void shouldSetMinusVolume(int volume, int expected) {
        Radio state = new Radio();

        state.volumeMinus(volume);
        int actual = state.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
}
