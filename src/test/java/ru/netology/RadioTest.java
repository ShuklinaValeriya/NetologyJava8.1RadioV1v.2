package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    public void getCurrentStation() {
        Radio radio = new Radio();

        radio.setCurrentStation(10);
        int expected = 0;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void getCurrentStation1() {
        Radio radio = new Radio();

        radio.setCurrentStation(9);
        int expected = 9;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void getCurrentStation2() {
        Radio radio = new Radio();

        radio.setCurrentStation(-1);
        int expected = 0;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }


    @Test
    public void setCurrentStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(1);

        int expected = 1;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void setCurrentStation1() {
        Radio radio = new Radio();
        radio.setCurrentStation(-1);

        int expected = 0;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void setCurrentStation2() {
        Radio radio = new Radio();
        radio.setCurrentStation(10);

        int expected = 0;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void nextTransferStation() {

        Radio radio = new Radio();

        radio.setCurrentStation(9);
        radio.nextTransferStation();
        int expected = 0;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void nextTransferStation1() {
        Radio radio = new Radio();

        radio.setCurrentStation(8);
        radio.nextTransferStation();

        int expected = 9;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }


    @Test
    public void prevCurrentStation() {
        Radio radio = new Radio();

        radio.setCurrentStation(0);
        radio.prevCurrentStation();
        int expected = 9;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void prevCurrentStation1() {
        Radio radio = new Radio();

        radio.setCurrentStation(9);
        radio.prevCurrentStation();
        int expected = 8;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void prevCurrentStation2() {
        Radio radio = new Radio();

        radio.setCurrentStation(0);
        radio.prevCurrentStation();
        int expected = 9;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeMin() {
        Radio radio = new Radio();

        radio.setCurrentVolume(0);
        radio.increaseVolume();
        int expected = 1;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeMax() {
        Radio radio = new Radio();

        radio.setCurrentVolume(10);
        radio.increaseVolume();
        int expected = 10;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(4);
        radio.increaseVolume();
        int expected = 5;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(4);
        radio.decreaseVolume();
        int expected = 3;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolume1() {
        Radio radio = new Radio();

        radio.setCurrentVolume(12);
        radio.decreaseVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolume2() {
        Radio radio = new Radio();

        radio.setCurrentVolume(0);
        radio.decreaseVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void volume() {
        Radio rad = new Radio();

        rad.setCurrentVolume(5);

        int expected = 5;
        int actual = rad.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void setVolumeOverMax() {
        Radio rad = new Radio();

        rad.setCurrentVolume(11);

        int expected = 0;
        int actual = rad.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void setVolumeBelowMin() {
        Radio rad = new Radio();

        rad.setCurrentVolume(-1);

        int expected = 0;
        int actual = rad.getCurrentVolume();

        assertEquals(expected, actual);
    }
}