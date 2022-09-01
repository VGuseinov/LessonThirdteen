package com.company;

public class Logger implements Convertible {

    @Override
    public void convert(String[][] data) {
        for (String[] arr : data) {
            for (String str : arr) {
                System.out.print(str + " ");
            }
            System.out.println();
        }
    }
}
