package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       /* try {
            int a = 100;
            int b = 0;
            int c = a / b; // исключение
        } catch(Exception e) {
            System.out.println("Error!");
        }
        System.out.println("After...");*/








	    File file = new File("C:/777/readme.txt");
        try {
            file.createNewFile();
            PrintWriter pw = new PrintWriter(file);
            pw.print("Stroka!!!!");
            pw.close();
        } catch (Exception e) {
            System.out.println(e.toString());
        }

        // чтение
        // Scanner
        // BufferedReader
        File file2 = new File("C:/777/readme.txt");
        try {
            Scanner scan = new Scanner(file2);
            while(scan.hasNextLine()) {
                System.out.println(scan.nextLine());
            }
            scan.close();
        } catch (FileNotFoundException e) {

        }

    }
}
