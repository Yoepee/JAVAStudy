package javaIO.exam;

import java.io.DataInputStream;
import java.io.FileInputStream;

public class ByteExam4 {
    public static void main(String[] args) {
        try(
                DataInputStream dis = new DataInputStream(new FileInputStream("data.txt"));
        ) {
            int i = dis.readInt();
            boolean b = dis.readBoolean();
            double d = dis.readDouble();

            System.out.println(i);
            System.out.println(b);
            System.out.println(d);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
