package main.day12.task3;

import java.util.*;

public class Task3 {
    public static void main(String[] args) {
        List<MusicBand> list = new ArrayList<>(10);
        list.addAll(Arrays.asList(new MusicBand(2001, "N"),
                new MusicBand(1992, "D"),
                new MusicBand(1875, "M"),
                new MusicBand(2021, "L"),
                new MusicBand(2017, "H"),
                new MusicBand(1754, "K"),
                new MusicBand(2000, "G"),
                new MusicBand(1985, "Z"),
                new MusicBand(1567, "T"),
                new MusicBand(1999, "R")));
        Collections.shuffle(list);
        List<MusicBand> list2 = groupsAfter2000(list);
        System.out.println(list);
        System.out.println(list2);
    }

    public static List<MusicBand> groupsAfter2000 (List<MusicBand> bands){
        List<MusicBand> list = new ArrayList<>();
        for (MusicBand x: bands){
            if (x.getYear() > 2000) list.add(x);
        }
        return list;
    }
}
