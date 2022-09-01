package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // wildcards
        // <? extends Class>
        // <? super Class>
        // ? extend Number - любой класс наследующий Number и сам класс Number
        ArrayList<? extends Number> list = new ArrayList<>();

        // ? super Number - любой родительский класс наследником которого явлеется Number
        // и сам класс Number
        ArrayList<? super Number> list2 = new ArrayList<>();
        PrintService ps = new PrintService();
        String[][] data = {{"Hello"}, {"Java", "String"}, {"Senior", "Matrix", "BonAqua"}};
        ps.convert(data, new Logger());
        ps.convert(data, new FileLogger("1.txt"));
        String[][] data2 = {{"1", "2", "=A1 + B1"}, {"2", "10", "30", "=SUM(B1+C2)"}};
        ps.convert(data2, new CSVLogger("1.csv"));
    }
}