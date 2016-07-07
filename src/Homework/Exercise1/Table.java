package Homework.Exercise1;

import java.lang.reflect.Array;
import java.util.*;


public class Table {
    public void showTable(List<File> anyList) {
        String gorizontalLine = new String(new char[77]).replace("\0", "-");
        System.out.println(gorizontalLine);
        System.out.println("|  Name            |  Book            |  Author          |  Painter         |");
        System.out.println(gorizontalLine);
        for (File element : anyList) {
            printLine(element, gorizontalLine);
        }
    }

    public void printLine(File file, String gorizontalLine) {
        switch (file.getClass().toString()) {
            case "class Homework.Exercise1.ImageFile": {
                System.out.printf("|  %-16.16s", ((ImageFile) file).getName());
                System.out.print("|                  |                  ");
                System.out.printf("|  %-16.16s", ((ImageFile) file).getPainter());
                System.out.println("|");
                break;
            }
            case "class Homework.Exercise1.AudioFile": {
                System.out.printf("|  %-16.16s", ((AudioFile) file).getName());
                System.out.print("|                  ");
                System.out.printf("|  %-16.16s", ((AudioFile) file).getAuthor());
                System.out.println("|                  |");
                break;
            }
            case "class Homework.Exercise1.TextFile": {
                System.out.printf("|  %-16.16s", ((TextFile) file).getName());
                System.out.printf("|  %-16.16s", ((TextFile) file).getBook());
                System.out.println("|                  |                  |");
                break;
            }
        }
        System.out.println(gorizontalLine);
    }
}

