package javaIO.exam;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class ByteExam3 {
    public static void main(String[] args) {
        try(
                DataOutputStream dos = new DataOutputStream(new FileOutputStream("data.txt"));
                ) {
            dos.writeInt(100);
            dos.writeBoolean(true);
            dos.writeDouble(50.5);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
