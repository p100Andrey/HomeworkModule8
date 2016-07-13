package Homework.Exercise1;

import java.lang.reflect.Array;
import java.util.Collection;


public class Table {
    public void showTable(Collection<File> anyList) {
        String gorizontalLine = new String(new char[77]).replace("\0", "-");
        System.out.println(gorizontalLine);
        System.out.println("|  Name            |  Book            |  Author          |  Painter         |");
        System.out.println(gorizontalLine);
        for (File element : anyList) {
            printLine(element, gorizontalLine);
        }
    }

    private void printLine(File file, String gorizontalLine) {
        System.out.printf("|  %-16.16s", file.getName());
        String stolbec = "                  |";
        if (file instanceof ImageFile) {
            System.out.printf("|%s%s  %-16.16s|%n", stolbec, stolbec, ((ImageFile) file).getPainter());
        }
        if (file instanceof AudioFile) {
            System.out.printf("|%s  %-16.16s|%s%n", stolbec, ((AudioFile) file).getAuthor(), stolbec);
        }
        if (file instanceof TextFile) {
            System.out.printf("|  %-16.16s|%s%s%n", ((TextFile) file).getBook(), stolbec, stolbec);
        }
        System.out.println(gorizontalLine);
    }
}

