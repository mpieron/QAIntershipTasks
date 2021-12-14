package JavaBasicForQACourse;

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
