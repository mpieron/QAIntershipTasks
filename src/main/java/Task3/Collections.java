package main.java.Task3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.stream.Stream;

public class Collections {

    public static void main(String[] args) throws FileNotFoundException {

        Scanner song = new Scanner(new File("src/main/resources/YellowSubmarine.txt"));
        StringBuilder lyric = new StringBuilder();

        while (song.hasNext())
            lyric.append(song.nextLine());

        countWords(splitOnWords(lyric.toString()));
        removeDuplicateAndPrint(splitOnWords(lyric.toString()));
        System.out.println(sortSong(lyric.toString()));
    }

    private static List<String> splitOnWords(String lyric){
        return Stream.of(lyric.replaceAll(", ", " ").replaceAll("[\\[\\](){}]","").replaceAll("\n", " ").split(" "))
                .filter(x -> !x.equals(",") && !x.equals("\n"))
                .map(String::toLowerCase)
                .toList();
    }

    private static void  countWords(List<String> lyric) {
        Map<String, Integer> wordsAmount = new HashMap<>();
        for (String word : lyric) {
            if (wordsAmount.containsKey(word))
                wordsAmount.put(word, wordsAmount.get(word) + 1);
            else
                wordsAmount.put(word, 1);
        }
        for (Map.Entry<String, Integer> entry : wordsAmount.entrySet()) {
            System.out.printf("%s - %d%n", entry.getKey(), entry.getValue());
        }
    }

    private static void removeDuplicateAndPrint(List<String> lyric){
        TreeSet<String> words = new TreeSet<>(lyric);
        System.out.println(words.stream().toList().toString());
    }

    private static String sortSong(String lyric){
        return splitOnWords(lyric).stream()
                .sorted(Comparator.comparingInt(String::length).thenComparing(Comparator.naturalOrder()))
                .toList()
                .toString();
    }
}
