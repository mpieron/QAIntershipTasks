package main.java.Task5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class Exceptions {

    public static void main(String[] args) throws FileNotFoundException {

        Scanner scanner = new Scanner(new File("src/main/resources/YellowSubmarine.txt"));
        StringBuilder song = new StringBuilder();

        while (scanner.hasNext())
            song.append(scanner.nextLine()).append(" ");

        printUniqueWords(song.toString());
    }

    private static void printUniqueWords(String text){
        splitOnWords(text).stream().distinct().forEach(System.out::println);
    }

    private static List<String> splitOnWords(String lyric){
        return Stream.of(lyric.replaceAll(", ", " ").replaceAll("[\\[\\](){}]","").split(" "))
                .map(String::toLowerCase)
                .toList();
    }
}
