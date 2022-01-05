package main.java.Task1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountWordsInSong {

    public static void main(String[] args) throws FileNotFoundException{

        Scanner song = new Scanner(new File("src/main/resources/YellowSubmarine.txt"));
        StringBuilder lyric = new StringBuilder();

        while (song.hasNext())
            lyric.append(song.nextLine()).append(" ");

        String lyricWithoutMarks = removeOtherMarks(removeCommas(lyric.toString()));
        String lyricLowerCase = toLowerCase(lyricWithoutMarks);
        String[] lyricArray = stringToArrayOfStrings(lyricLowerCase);
        printWordsAndTheirAmount(lyricArray);
    }

//  while reading lines and appending them to lyric, /n is ignored
    private static String removeCommas(String lyric){
        StringBuilder lyricWithoutComma = new StringBuilder();
        for(int i=0; i<lyric.length(); i++){
            if(lyric.charAt(i) != ',')
                lyricWithoutComma.append(lyric.charAt(i));
        }
        return lyricWithoutComma.toString();
    }

    private static String removeOtherMarks(String lyric){
        return lyric.replaceAll("[\\[\\](){}]","");
    }

    private static String toLowerCase(String lyric){
        StringBuilder lyricToLower = new StringBuilder();
        for(int i=0; i<lyric.length(); i++){
            if (65 <= lyric.charAt(i) && lyric.charAt(i)<=90)
                lyricToLower.append((char)(lyric.charAt(i)+32));
            else
                lyricToLower.append(lyric.charAt(i));
        }
        return lyricToLower.toString();
    }

    private static String[] stringToArrayOfStrings(String lyric){
        return lyric.split(" ");
    }

    private static void printWordsAndTheirAmount(String[] lyric){
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
}
