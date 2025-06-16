package javaIO.exam;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CharIOExam1 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            String line = br.readLine();
            System.out.println(line);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
