package javaIO.exam;

import java.io.*;

public class CharIOExam2 {
    public static void main(String[] args) {
        BufferedReader br = null;
        PrintWriter pw = null;
        try{
            br = new BufferedReader(new FileReader("src/javaIO/exam/CharIOExam2.java"));
            // 데코레이터 패턴으로 굳이 사용하지 않아도 사용할 수 있음.
            pw = new PrintWriter(new FileWriter("test.txt"));

            String line = null;
            while((line = br.readLine()) != null){
                pw.println(line);
            }
        }  catch (Exception e) {
            e.printStackTrace();
        } finally {
            pw.close();
            try{
                br.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
