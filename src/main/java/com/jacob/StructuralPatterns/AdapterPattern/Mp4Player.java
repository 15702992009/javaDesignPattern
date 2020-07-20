package com.jacob.StructuralPatterns.AdapterPattern;

public class Mp4Player implements AdvancedMediaPlayer {

    @Override
    public void playVlc(String s) {

    }

    @Override
    public void playMp4(String s) {
        System.out.println(s);
    }
}
