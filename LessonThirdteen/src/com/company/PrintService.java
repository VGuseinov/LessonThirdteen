package com.company;

public class PrintService {

    public <T extends Convertible> void convert(String[][] data, T type) {
        type.convert(data);
    }
}
