package edu.evan.smartTv;

public class SmartTv {
    private boolean isOn = false;
    private int canal = 1;
    private int volume = 25;

    public boolean isOn() {
        return isOn;
    }

    public void setOn(boolean isOn) {
        this.isOn = isOn;
    }

    public int getCanal() {
        return canal;
    }

    public void setCanal(int canal) {
        this.canal = canal;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "SmartTv [isOn=" + isOn + ", canal=" + canal + ", volume=" + volume + "]";
    }

    public void ligarTv() {
        if (this.isOn) {
            this.isOn = false;
            System.out.println("A tv já está ligada");
        } else {
            this.isOn = true;
            System.out.println("A tv foi ligada");
        }
    }

    public void desligarTv() {
        if (this.isOn) {
            this.isOn = false;
            System.out.println("A tv já está desligada");
        } else {
            this.isOn = true;
            System.out.println("A tv foi desligada");
        }
    }

    public void aumentarVolume() {
        this.volume = this.volume + 5;
        mostrarVolume();
    }

    public void diminuirVolume() {
        this.volume = this.volume - 5;
        mostrarVolume();
    }

    public void mostrarVolume() {
        System.out.println(this.getVolume());
    }

    public void mudarCanal() {
        this.canal = this.canal + 1;
        System.out.println("O canal foi mudado para: " + this.canal);
    }

    public void mudarCanal(int numCanal) {
        this.canal = numCanal;
        System.out.println("O canal foi mudado para: " + this.canal);
    }
}
