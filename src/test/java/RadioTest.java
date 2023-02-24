import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.Smarthome.Radio;

public class RadioTest {

    @Test
    public void shouldSetRadioStation() {
        Radio stat = new Radio();
        stat.setCurrentRadioStation(6);

        int expected = 6;
        int actual = stat.currentRadioStation;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetRadioStationAboveMax() {
        Radio stat = new Radio();
        stat.setCurrentRadioStation(10);
        int expected = 0;
        int actual = stat.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldNotSetRadioStationBelowMin() {
        Radio stat = new Radio();
        stat.setCurrentRadioStation(-1);
        int expected = 0;
        int actual = stat.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldNextRadioStationAfterCurrent() {
        Radio stat = new Radio();
        int currentRadioStation = 1;
        stat.setCurrentRadioStation(currentRadioStation);
        stat.increaseNextStation();
        int expected = 2;
        int actual = stat.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReduceCurrentRadioStation() {
        Radio stat = new Radio();
        int currentRadioStation = 9;
        stat.setCurrentRadioStation(currentRadioStation);
        stat.reduceCurrentStation();
        int expected = 8;
        int actual = stat.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextStationAfterMax() {
        Radio stat = new Radio();
        int currentRadioStation = 9;
        stat.setCurrentRadioStation(currentRadioStation);
        stat.increaseNextStation();
        int expected = 0;
        int actual = stat.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPreviousStationBeforeMin() {
        Radio stat = new Radio();
        int currentRadioStation = 0;
        stat.setCurrentRadioStation(currentRadioStation);
        stat.reduceCurrentStation();
        int expected = 9;
        int actual = stat.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldValueSetAboveMaxVolumeLevel1() {
        Radio stat = new Radio();
        stat.setCurrentVolume(-1);
        int expected = 0;
        int actual = stat.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldTurnDownVolumeInMiddle() {
        Radio stat = new Radio();
        int currentVolume = 6;
        stat.setCurrentVolume(currentVolume);
        stat.decreaseVolume();
        int expected = 5;
        int actual = stat.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSetPreviousVolumeSoundAboutMax() {
        Radio stat = new Radio();
        int currentVolume = 10;
        stat.setCurrentVolume(currentVolume);
        stat.decreaseVolume();
        int expected = 9;
        int actual = stat.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }


    @Test
    public void shouldIncreaseMaxVolumeLevelOne() {
        Radio stat = new Radio();
        int currentVolume = 10;
        stat.setCurrentVolume(currentVolume);
        stat.increaseVolume();
        int expected = 10;
        int actual = stat.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldReduceMinVolumeLevelOn() {
        Radio stat = new Radio();
        int currentVolume = 1;
        stat.setCurrentVolume(currentVolume);
        stat.decreaseVolume();
        int expected = 0;
        int actual = stat.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSetVolumeLevelBelowMin() {
        Radio stat = new Radio();
        int currentVolume = 0;
        stat.setCurrentVolume(currentVolume);
        stat.decreaseVolume();
        int expected = 0;
        int actual = stat.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSetVolumeLevelAboveMax() {
        Radio stat = new Radio();
        int currentVolume = 11;
        stat.setCurrentVolume(currentVolume);
        stat.increaseVolume();
        int expected = 0;
        int actual = stat.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeLevelBeginning() {
        Radio stat = new Radio();
        int currentVolume = 1;
        stat.setCurrentVolume(currentVolume);
        stat.increaseVolume();
        int expected = 2;
        int actual = stat.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }


}