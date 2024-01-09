package main.day12.task4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {
        MusicBand band1 = new MusicBand(2001, "Rammstein",new ArrayList<>(Arrays.asList("L", "D", "V")));
        MusicBand band2 = new MusicBand(1995, "Horha", new ArrayList<>(Arrays.asList("H", "G", "N")));
        band1.printMembers();
        band2.printMembers();
        MusicBand.transferMembers(band1, band2);
        band1.printMembers();
        band2.printMembers();
    }
}
