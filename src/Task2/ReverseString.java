package Task2;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class ReverseString {
//    Write 3 implementations (or more) for reversing string.
//    Input:  String stringToRevers = "I'm going to go to school today morning."
//    Output: ".gninrom yadot loohcs ot og ot gniog m'I"

    static String sentence = "I'm going to go to school today morning.";

    public static void main(String[] args) {
        System.out.println(reverseFor(sentence));
        System.out.println(reverseWhile(sentence));
        System.out.println(reverseStringBuffer(sentence));
        System.out.println(reverseFirstLast(sentence));
        System.out.println(reverseStack(sentence));
        System.out.println(reverseRecursion(sentence));
        System.out.println(reverseQueue(sentence));
    }

    public static String reverseFor(String sentence){
        String reversed = "";

        for(int i=sentence.length()-1; i>=0; i--)
            reversed += sentence.charAt(i);
        return  reversed;
    }

    public static String reverseWhile(String sentence){
        String reversed = "";
        int length = sentence.length()-1;

        while(length >= 0) {
            reversed += sentence.charAt(length);
            length--;
        }
        return reversed;
    }

    public static String reverseStringBuffer(String sentence){
        return new StringBuffer(sentence).reverse().toString();
    }

    public static String reverseFirstLast(String sentence){
        int length = sentence.length();
        char[] newSentence = new char[length];

        for(int i=0; i<length/2; i++){
            newSentence[length-1-i] = sentence.charAt(i);
            newSentence[i] = sentence.charAt(length-1-i);
        }
        return String.valueOf(newSentence);
    }

    public static String reverseStack(String sentence){
        Stack<Character> stack = new Stack<>();
        String newSentence = "";

        for(int i=0; i<sentence.length(); i++)
            stack.push(sentence.charAt(i));
        while(!stack.empty())
            newSentence += stack.pop();
        return  newSentence;
    }

    public static String reverseRecursion(String sentence){
        if (sentence.length() < 1)
            return "";
        return sentence.charAt(sentence.length()-1) + reverseRecursion(sentence.substring(0,sentence.length()-1));
    }

    public static String reverseQueue(String sentence){
        String newSentence = "";
        Queue<Character> queue = new ArrayDeque<>();

        for(int i=sentence.length()-1; i>-1; i--)
            queue.add(sentence.charAt(i));
        while(!queue.isEmpty())
            newSentence += queue.poll();
        return newSentence;
    }
}
