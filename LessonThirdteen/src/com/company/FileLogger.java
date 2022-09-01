package com.company;

import java.io.FileWriter;
import java.io.IOException;

public class FileLogger implements Convertible {

    private String filepath;

    public FileLogger(String filepath) {
        this.filepath = filepath;
    }

    @Override
    public void convert(String[][] data) {
        try {
            FileWriter fw = new FileWriter(this.filepath);
            for (String[] arr : data) {
                for (String str : arr) {
                    fw.write(str + " ");
                }
                fw.write("\n");
            }
            fw.flush();
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
