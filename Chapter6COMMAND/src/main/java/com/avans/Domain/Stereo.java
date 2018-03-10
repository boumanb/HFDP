package com.avans.Domain;

public class Stereo {
    public void on() {
        System.out.println("Stereo went on");
    }

    public void off() {
        System.out.println("Stereo went off");
    }

    public void setCD() {
        System.out.println("CD is set");
    }

    public void setDVD() {

    }

    public void setRadio() {

    }

    public void setVolume(int volume) {
        System.out.println("Volume set to " + volume);
    }
}
