package ru.netology;

public class Radio {

    private int currentStation;
    private int currentVolume;

    public int getCurrentStation() {
        return currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }


    // Работа с радиостанциями (station):

    public void setCurrentStation(int currentStation) {
        if (currentStation > 9) {
            return;
        }
        if (currentStation < 0) {
            return;
        }
        this.currentStation = currentStation;
    } //Устанавливаем конкретную станцию

    public void nextTransferStation() {
        if (currentStation == 9) {
            currentStation = 0;
            return;
        }
        currentStation++;

        this.currentStation = currentStation;

    } //Переключаем на +1 станцию

    public void prevCurrentStation() {
        if (currentStation == 0) {
            currentStation = 9;
            return;
        }
        currentStation--;

        this.currentStation = currentStation;
    } //Переключаем на -1 станцию


    // Работа с уровнем громкости звука (volume):

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > 10) {
            return;
        }
        if (currentVolume < 0) {
            return;
        }
        this.currentVolume = currentVolume;
    } //Устанавливаем ур-нь звука

    public void increaseVolume() {
        if (currentVolume < 10) {
            currentVolume++;
        }

    } //Прибавляем уровень звука

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }

    } //Уменьшаем уровень звука

}
