package Homework.Exercise1;

import java.lang.reflect.Array;
import java.util.*;


public class Table {
    public void showTable(List<File> anyList) {
        String gorizontalLine = new String("   -----------------------------------------------------------------------------");
        System.out.println(gorizontalLine);
        System.out.println("   |  Name            |  Book            |  Author          |  Painter         |");
        System.out.println(gorizontalLine);
        for (File element : anyList) {
            if (element instanceof TextFile) {
                System.out.printf("   |  %-16.16s", ((TextFile) element).getName());
                System.out.printf("|  %-16.16s", ((TextFile) element).getBook());
                System.out.println("|                  |                  |");
                System.out.println(gorizontalLine);
            }
            if (element instanceof AudioFile) {
                System.out.printf("   |  %-16.16s", ((AudioFile) element).getName());
                System.out.print("|                  ");
                System.out.printf("|  %-16.16s", ((AudioFile) element).getAuthor());
                System.out.println("|                  |");
                System.out.println(gorizontalLine);
            }
            if (element instanceof ImageFile) {
                System.out.printf("   |  %-16.16s", ((ImageFile) element).getName());
                System.out.print("|                  |                  ");
                System.out.printf("|  %-16.16s", ((ImageFile) element).getPainter());
                System.out.println("|");
                System.out.println(gorizontalLine);
            }
        }
    }
}
