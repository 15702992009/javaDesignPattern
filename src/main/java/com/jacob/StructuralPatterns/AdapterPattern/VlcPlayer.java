package com.jacob.StructuralPatterns.AdapterPattern;

public class VlcPlayer implements AdvancedMediaPlayer {

    @Override
    public void playVlc(String s) {
        System.out.println(s);
    }

    @Override
    public void playMp4(String s) {

    }
}
