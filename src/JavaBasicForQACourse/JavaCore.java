package JavaBasicForQACourse;

public class JavaCore {

    /*
    Input and Output with Streams and Files

    Task 1.
    Given the following code, under which circumstances will the method return ‘false’?
    public static boolean test(InputStream is) throws IOException {
        int value = is.read();
        return value >= 0;
    }
    Select the one correct answer.
    (a) A character of more than 8 bits was read from the input stream.
    (b) An I/O error occurred.
    (c) Never.
    (d) The end of the stream was reached in the input stream.

--  Solution: d

    Task 2.
    Which of these classes provide methods for writing binary representations of Java primitive values?
    Select the two correct answers.
    (a) DataOutputStream
    (b) FileOutputStream
    (c) ObjectOutputStream
    (d) PrintStream
    (e) BufferedOutputStream

--  Solution: b, c

    Task 3.
    Given the following program:
    import java.io.DataInputStream;
    import java.io.EOFException;
    import java.io.FileInputStream;
    import java.io.FileNotFoundException;
    import java.io.IOException;
    public class Endings {
        public static void main(String[] args) {
            try {
                FileInputStream fos = new FileInputStream("info.dat");
                DataInputStream dis = new DataInputStream(fos);
                int i = dis.readByte();
                while (i != -1) {
                System.out.print((byte)i + "|");
                i = dis.readByte();
                }
            } catch (FileNotFoundException fnf) {
                System.out.println("File not found");
            } catch (EOFException eofe) {
                System.out.println("End of stream");
            } catch (IOException ioe) {
                System.out.println("Input error");
            }
        }
       }

    Assume that the file "info.dat" exists in the current directory and has only the byte values 10, 20 and 30, stored in that order. Select the one correct answer:
    (a)  The program will not compile because a certain unchecked exception is not caught.
    (b)  The program will compile and print 10|20|30| Input error.
    (c)  The program will compile and print 10|20|30| End of stream.
    (d)  The program will compile and print 10|20|30|, and then block in order to read from the file.
    (e)  The program will compile and print 10|20|30|, and terminate because of an uncaught exception.

--  Solution: d

    String Formatting and Regular Expressions
    https://www.hackerrank.com/challenges/java-regex/problem

-- Solution:
    class MyRegex {
        public String pattern = "((\\d|\\d\\d|[0-1]\\d\\d|2[0-4][0-9]|25[0-5])\\.){3}(\\d|\\d\\d|[0-1]\\d\\d|2[0-4][0-9]|25[0-5])";
    }

    Working with Collections

    Task 1
    Which methods are specified by the Iterator<E> interface?
    Select the three correct answers.
    (a) hasNext()
    (b) hasMore()
    (c) remove()
    (d) delete()
    (e) more()
    (f) next()

--  Solution: a,c,f

    Task 2
    Which of these implementations are provided by the java.util package? Select the two correct answers.
    (a) HashList<E>
    (b) HashMap<K,V>
    (c) ArraySet<E>
    (d) ArrayMap<K,V>
    (e) TreeMap<K,V>

--  Solution: b,  e

    Task 3
    What is the name of the interface used to represent collections that maintain non-unique elements in order?
    Select the one correct answer.
    (a) Collection<E>
    (b) Set<E>
    (c) SortedSet<E>
    (d) List<E>
    (e) Sequence<E>

--  Solution: d

    Task 5
    Which identifiers, when inserted in appropriate places in the program, will result
    in the output 911?
    Collection <________>  myItems = new ArrayList <__________>();
    myItems.add(9);
    myItems.add(1);
    myItems.add(1);

    Iterator<_________> iterator = _____________.iterator();
    while (______________.___________()) {
    System.out.print(_____________._________());
    }

    Select the five correct answers.
    (a) hasNext
    (b) myItems
    (c) next
    (d) Integer
    (e) int
    (f) Collection
    (g) iterator

 --  Solution: a, b, c, d, g
    Collection <Integer>  myItems = new ArrayList <Integer>();
    myItems.add(9);
    myItems.add(1);
    myItems.add(1);

    Iterator<Integer> iterator = myItems.iterator();
    while (iterator.hasNext()) {
    System.out.print(iterator.next());
    }

    Task 6
    Which sequence of digits will the following program print?
    import java.util.ArrayList;
    import java.util.LinkedList;
    import java.util.List;
    public class Lists {
        public static void main(String[] args) {
            List<String> list = new ArrayList<String>();
            list.add("1");
            list.add("2");
            list.add(1, "3");
            List<String> list2 = new LinkedList<String>(list);
            list.addAll(list2);
            list2 = list.subList(2, 5);
            list2.clear();
            System.out.println(list);
        }

    Select the one correct answer.
    (a) [1, 3, 2]
    (b) [1, 3, 3, 2]
    (c) [1,3,2,1,3,2](d) [3, 1, 2]
    (e) [3, 1, 1, 2]
    (f) None of the above.

--  Solution: a

    Running multiple classes from one JAR file

    Create any 2 classes with the main method. For instance,
    public class HelloWord {
        public static void main(String[] args) {
            System.out.println("Hello World!");
        }
    }

    import java.io.DataInputStream;
    import java.io.EOFException;
    import java.io.FileInputStream;
    import java.io.FileNotFoundException;
    import java.io.IOException;
    public class Endings {
        public static void main(String[] args) {
            try {
                FileInputStream fos = new FileInputStream("info.dat");
                DataInputStream dis = new DataInputStream(fos);
                int i = dis.readByte();
                while (i != -1) {
                    System.out.print((byte)i + "|");
                    i = dis.readByte();
                }
            } catch (FileNotFoundException fnf) {
                System.out.println("File not found");
            } catch (EOFException eofe) {
                System.out.println("End of stream");
            } catch (IOException ioe) {
                System.out.println("Input error");
            }
        }
    }

    Create a jar file containing 2 main methods
    Run each main class from CLI

    Solution:
    (from src)
    javac JavaBasicForQACourse/HelloWord.java
    javac JavaBasicForQACourse/Endings.java
    jar cf TwoMainJar.jar JavaBasicForQACourse/HelloWord JavaBasicForQACourse/Endings
    java -cp TwoMainJar.jar JavaBasicForQACourse/HelloWord
    java -cp TwoMainJar.jar JavaBasicForQACourse/Endings

    Specify different formats of logging for different logging level

    1. Replace System.out.println with Java Util logging logger.info, logger.error and so on
    import java.io.DataInputStream;
    import java.io.EOFException;
    import java.io.FileInputStream;
    import java.io.FileNotFoundException;
    import java.io.IOException;
    public class Endings {
        public static void main(String[] args) {
            try {
                FileInputStream fos = new FileInputStream("info.dat");
                DataInputStream dis = new DataInputStream(fos);
                int i = dis.readByte();
                while (i != -1) {
                    System.out.print((byte)i + "|");
                    i = dis.readByte();
                }
            } catch (FileNotFoundException fnf) {
                System.out.println("File not found");
            } catch (EOFException eofe) {
                System.out.println("End of stream");
            } catch (IOException ioe) {
                System.out.println("Input error");
            }
        }
    }

--  Solution:
    static Logger logger = Logger.getLogger("JavaCore");
    public static void main(String[] args) {
        try {
            FileInputStream fos = new FileInputStream("info.dat");
            DataInputStream dis = new DataInputStream(fos);
            int i = dis.readByte();
            while (i != -1) {
                System.out.print((byte)i + "|");
                i = dis.readByte();
            }
        } catch (FileNotFoundException fnf) {
            logger.log(Level.INFO, "File not found");
        } catch (EOFException eofe) {
            logger.log(Level.WARNING, "End of stream");
        } catch (IOException ioe) {
            logger.log(Level.WARNING, "Input error");
        }
    }
    */

}
