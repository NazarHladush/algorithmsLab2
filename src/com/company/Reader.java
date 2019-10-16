package com.company;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Reader {
    public ArrayList<String> reader(String name) {
        ArrayList<String> list = new ArrayList<>();
        String line = "";
        try (FileInputStream fis = new FileInputStream(name);
             InputStreamReader isr = new InputStreamReader(fis);
             BufferedReader bufReader = new BufferedReader(isr)) {
            while (line != null) {
                line = bufReader.readLine();
                list.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }
}
