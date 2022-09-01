package com.company;

import java.io.FileWriter;
import java.io.IOException;

public class CSVLogger implements Convertible {

    private String delimiter;
    private String filepath;

    public CSVLogger(String filepath) {
        this.delimiter = ";";
        this.filepath = filepath;
    }

    public CSVLogger(String filepath, String delimiter) {
        this.delimiter = delimiter;
        this.filepath = filepath;
    }

    @Override
    public void convert(String[][] data) {
        try {
            FileWriter fw = new FileWriter(this.filepath);
            for (String[] arr : data) {
                String s = String.join(this.delimiter, arr);
                fw.write(s + "\n");
            }
            fw.flush();
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
