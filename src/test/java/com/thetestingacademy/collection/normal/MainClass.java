package com.thetestingacademy.collection.normal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainClass {
    public static void main(String[] args) {
        List<Song> songList = new ArrayList<>();
        songList.add(new Song("Money Manager", "100", "Pramod"));
        songList.add(new Song("Profit", "120", "Dutta"));
        songList.add(new Song("OOTA", "220", "Utta"));

        System.out.println(songList);

    }
}
