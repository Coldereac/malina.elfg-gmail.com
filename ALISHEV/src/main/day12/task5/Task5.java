package main.day12.task5;

import java.util.ArrayList;
import java.util.Arrays;

public class Task5 {
    public static void main(String[] args) {

        MusicBand band1 = new MusicBand(2001, "Rammstein",
                new ArrayList<>(
                        Arrays.asList(new MusicArtist("L", 12),
                                new MusicArtist("D", 15))
                ));
        MusicBand band2 = new MusicBand(1995, "Horha",
                new ArrayList<>(
                        Arrays.asList(new MusicArtist("N", 20),
                                new MusicArtist("L", 21))
                ));
        band1.printMembers();
        band2.printMembers();
        MusicBand.transferMembers(band1, band2);
        band1.printMembers();
        band2.printMembers();
    }
}

