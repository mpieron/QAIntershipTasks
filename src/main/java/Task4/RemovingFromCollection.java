package main.java.Task4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class RemovingFromCollection {
//      1. Take ArrayList<String> of song
//      2. Remove all words “yellow” and “submarine”
//      3. Print result to console.

    public static void main(String[] args) throws FileNotFoundException {

        Scanner song = new Scanner(new File("src/main/resources/YellowSubmarine.txt"));
        StringBuilder lyric = new StringBuilder();

        while (song.hasNext())
            lyric.append(song.nextLine()).append("\n");

        System.out.println(removeYellowAndSubmarine(lyric.toString()));
    }

    private static String removeYellowAndSubmarine(String lyric){
        return  lyric.replaceAll("Yellow.*", "")
                .replaceAll("yellow.*", "")
                .replaceAll("Submarine.*", "")
                .replaceAll("submarine.*", "");
    }
}
