package Task2;

public class ReverseString {
//    Write 3 implementations (or more) for reversing string.
//    Input:  String stringToRevers = "I'm going to go to school today morning."
//    Output: ".gninrom yadot loohcs ot og ot gniog m'I"

    public static void main(String[] args) {
        System.out.println(reverseFor("I'm going to go to school today morning."));
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
}
